package org.mines.douai.pacqueteau_freau.bancairebackend.repository;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.TransactionBancaire;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<TransactionBancaire, Long> {
    
    List<TransactionBancaire> findAll();
    
}
