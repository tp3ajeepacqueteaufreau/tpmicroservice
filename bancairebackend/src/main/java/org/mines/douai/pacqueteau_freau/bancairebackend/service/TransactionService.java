package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.TransactionBancaire;
import org.mines.douai.pacqueteau_freau.bancairebackend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    
    @Autowired
    private TransactionRepository transactionRepository;
    
    public List<TransactionBancaire> getAllTransacation(Long accountId) {
        List<TransactionBancaire> ret = new ArrayList<TransactionBancaire>();
        transactionRepository.findByAccountFromOrAccountTo(accountId, accountId).forEach(ret::add);
        return ret;
    }
    
    public void saveOrUpdate(TransactionBancaire transactionBancaire) {
        transactionRepository.save(transactionBancaire);
    }
    
}
