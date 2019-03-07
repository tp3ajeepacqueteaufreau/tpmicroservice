package org.mines.douai.tp.pacqueteau_freau.ibanbackend.DTO;

public class IbanRequestDto {
    private String iban;
    
    public IbanRequestDto(String iban) {
        this.iban = iban;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
}
