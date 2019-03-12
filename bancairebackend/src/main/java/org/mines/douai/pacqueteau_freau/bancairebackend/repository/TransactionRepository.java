package org.mines.douai.pacqueteau_freau.bancairebackend.repository;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.TransactionBancaire;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<TransactionBancaire, Long> {
    
    List<TransactionBancaire> findByAccountFromOrAccountTo(Long from, Long to);
    
}
