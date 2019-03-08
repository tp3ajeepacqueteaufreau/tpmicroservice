package org.mines.douai.pacqueteau_freau.bancairebackend.DTO;

public class IbanAnswerDTO {
    
    private String iban;
    
    private boolean ok;
    
    public IbanAnswerDTO(String iban, boolean ok) {
        this.iban = iban;
        this.ok = ok;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public boolean isOk() {
        return ok;
    }
    
    public void setOk(boolean ok) {
        this.ok = ok;
    }
}
