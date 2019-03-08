package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.*;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.AccountService;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.IbanServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class AccountController {
    
    private final AccountService accountService;
    
    private final IbanServiceProxy ibanServiceProxy;
    
    @Autowired
    public AccountController(AccountService accountService, IbanServiceProxy ibanServiceProxy) {
        this.accountService = accountService;
        this.ibanServiceProxy = ibanServiceProxy;
    }
    
    @GetMapping("/accounts")
    public List<Account> getAllAccount() {
        return this.accountService.getAllAccount();
    }
    
    @GetMapping("/account/{id}")
    public Account getAnAccount(@PathVariable("id") Long id) {
        return this.accountService.getAnAccount(id);
    }
    
    @GetMapping("/account/{id}/transactions")
    public List<TransactionBancaire> getTransactionsOfAccount(@PathVariable("id") Long id) {
        Account account = this.getAnAccount(id);
        return account.getTransactions();
    }
    
    @PostMapping("/account")
    public Account newAccount(@RequestBody AccountCreationRequest accountCreationRequest) {
        IbanRequestDto ibanRequestDto = new IbanRequestDto(accountCreationRequest.getIban());
        IbanAnswerDTO ibanAnswerDTO = this.ibanServiceProxy.checkIban(ibanRequestDto);
        
        if (ibanAnswerDTO.isOk()) {
            Account account = new Account(accountCreationRequest);
            account = this.accountService.createNewAccount(account);
            return account;
        }
        return null;
    }
    
    @DeleteMapping("/account/{id}")
    public boolean deleteAccount(@PathVariable("id") Long id) {
        this.accountService.deleteAccount(id);
        return true;
    }
}
