package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.TransactionBancaire;
import org.mines.douai.pacqueteau_freau.bancairebackend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionService {
    
    @Autowired
    TransactionRepository transactionRepository;
    
    public List<TransactionBancaire> getAllTransactions() {
        return this.transactionRepository.findAll();
    }
}
