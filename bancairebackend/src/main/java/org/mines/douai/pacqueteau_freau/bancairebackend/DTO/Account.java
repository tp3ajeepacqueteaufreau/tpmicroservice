package org.mines.douai.pacqueteau_freau.bancairebackend.DTO;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {
    
    @Id
    @Column(name = "accountId")
    private Long id;
    
    @Column(name = "owner")
    private String owner;
    
    @Column(name = "iban")
    private String iban;
    
    @OneToMany
    private List<TransactionBancaire> transactions;
    
    @Column(name = "amount")
    private float montant;
    
    public Account() {
    }
    
    public Account(AccountCreationRequest accountCreationRequest) {
        this.iban = accountCreationRequest.getIban();
        this.owner = accountCreationRequest.getOwner();
        this.montant = accountCreationRequest.getMontant();
    }
    
    @JsonCreator
    public Account(Long id, String owner, String iban, List<TransactionBancaire> transactions, float montant) {
        this.id = id;
        this.owner = owner;
        this.iban = iban;
        this.transactions = transactions;
        this.montant = montant;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public List<TransactionBancaire> getTransactions() {
        return transactions;
    }
    
    public void setTransactions(List<TransactionBancaire> transactions) {
        this.transactions = transactions;
    }
    
    public float getMontant() {
        return montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }
}
