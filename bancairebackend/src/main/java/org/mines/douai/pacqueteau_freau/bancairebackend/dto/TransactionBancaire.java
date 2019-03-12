package org.mines.douai.pacqueteau_freau.bancairebackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class TransactionBancaire implements Serializable {
    @Id
    @GeneratedValue
    private Long transactionId;
    
    private Long accountFrom;
    private Long accountTo;
    
    private BigDecimal montant;
    
    public Long getTransactionId() {
        return transactionId;
    }
    
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    
    public Long getAccountFrom() {
        return accountFrom;
    }
    
    public void setAccountFrom(Long accountFrom) {
        this.accountFrom = accountFrom;
    }
    
    public Long getAccountTo() {
        return accountTo;
    }
    
    public void setAccountTo(Long accountTo) {
        this.accountTo = accountTo;
    }
    
    public BigDecimal getMontant() {
        return montant;
    }
    
    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
