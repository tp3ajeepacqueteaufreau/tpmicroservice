package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @GetMapping("/account")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }
    
    
}
