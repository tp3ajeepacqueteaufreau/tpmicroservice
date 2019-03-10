package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
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
        this.accountService.saveOrUpdate(account);
        return account;
    }
    
    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        this.accountService.delete(id);
    }
    
}
