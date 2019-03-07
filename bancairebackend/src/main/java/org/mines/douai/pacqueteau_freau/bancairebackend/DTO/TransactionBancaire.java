package org.mines.douai.pacqueteau_freau.bancairebackend.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionBancaire {
    
    @Id
    private Long id;
    
    private Account from;
    
    private Account to;
    
    private float montant;
    
    public TransactionBancaire() {
    }
    
    public TransactionBancaire(Long id, Account from, Account to, float montant) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.montant = montant;
    }
    
    public Account getFrom() {
        return from;
    }
    
    public void setFrom(Account from) {
        this.from = from;
    }
    
    public Account getTo() {
        return to;
    }
    
    public void setTo(Account to) {
        this.to = to;
    }
    
    public float getMontant() {
        return montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }
}
