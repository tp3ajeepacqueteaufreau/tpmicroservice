package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;
    
    public List<Account> getAllAccount() {
        List<Account> ret = new ArrayList<Account>();
        accountRepository.findAll().forEach(ret::add);
        return ret;
    }
    
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).get();
    }
    
    public void saveOrUpdate(Account account) {
        accountRepository.save(account);
    }
    
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
    
}
