package org.mines.douai.pacqueteau_freau.bancairebackend.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class TransactionBancaire {
    
    @Id
    @Column(name = "transactionId")
    private Long id;
    
    @Column(name = "from")
    private Long from;
    
    @Column(name = "to")
    private Long to;
    
    @Column(name = "amount")
    private float montant;
    
    public TransactionBancaire() {
    }
    
    public TransactionBancaire(Long id, Long from, Long to, float montant) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.montant = montant;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getFrom() {
        return from;
    }
    
    public void setFrom(Long from) {
        this.from = from;
    }
    
    public Long getTo() {
        return to;
    }
    
    public void setTo(Long to) {
        this.to = to;
    }
    
    public float getMontant() {
        return montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }
}
