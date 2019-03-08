package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;
    
    public List<Account> getAllAccount() {
        return this.accountRepository.findAll();
    }
    
    public Account getAnAccount(Long id) {
        Optional<Account> account = this.accountRepository.findById(id);
        return account.orElse(null);
    }
    
    public Account createNewAccount(Account account) {
        return this.accountRepository.save(account);
    }
    
    public void deleteAccount(Long id) {
        this.accountRepository.delete(this.accountRepository.findById(id));
    }
}
