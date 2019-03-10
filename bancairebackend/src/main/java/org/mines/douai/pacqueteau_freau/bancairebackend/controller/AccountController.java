package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.dto.IbanRequestDto;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.AccountService;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.IbanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    
    Logger logger = LoggerFactory.getLogger(AccountController.class);
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private IbanService ibanService;
    
    @GetMapping("/account")
    public List<Account> getAllAccount() {
        return this.accountService.getAllAccount();
    }
    
    @GetMapping("/account/{id}")
    public Account getAnAccount(@PathVariable("id") Long id) {
        return this.accountService.getAccountById(id);
    }
    
    @PostMapping("/account")
    public Account addNewAccount(@RequestBody Account account) {
        logger.info("Ask for account creation");
        if (this.ibanService.checkIban(new IbanRequestDto(account.getIban())).isOk()) {
            logger.info("IBAN is ok");
            this.accountService.saveOrUpdate(account);
            return account;
        } else {
            logger.info("IBAN is not ok");
            return null;
        }
    }
    
    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        this.accountService.delete(id);
    }
    
}
