package org.mines.douai.pacqueteau_freau.bancairebackend.DTO;


import com.fasterxml.jackson.annotation.JsonCreator;

public class AccountCreationRequest {
    
    private String iban;
    
    private String owner;
    
    private float montant;
    
    @JsonCreator
    public AccountCreationRequest(String iban, String owner, float montant) {
        this.iban = iban;
        this.owner = owner;
        this.montant = montant;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public float getMontant() {
        return montant;
    }
    
    public void setMontant(float montant) {
        this.montant = montant;
    }
}
