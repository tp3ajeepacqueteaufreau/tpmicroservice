package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;
    
    public List<Account> getAllAccount() {
        return this.accountRepository.findAll();
    }
}
