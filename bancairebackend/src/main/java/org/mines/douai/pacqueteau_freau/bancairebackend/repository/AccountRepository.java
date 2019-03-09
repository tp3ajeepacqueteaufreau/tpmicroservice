package org.mines.douai.pacqueteau_freau.bancairebackend.repository;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    
    List<Account> findAll();
    
    void delete(Account account);
}
