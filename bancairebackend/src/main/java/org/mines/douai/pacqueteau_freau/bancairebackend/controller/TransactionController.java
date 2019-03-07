package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.TransactionBancaire;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    
    @GetMapping("/transaction")
    public List<TransactionBancaire> getAllTransaction() {
        return transactionService.getAllTransactions();
    }
    
}
