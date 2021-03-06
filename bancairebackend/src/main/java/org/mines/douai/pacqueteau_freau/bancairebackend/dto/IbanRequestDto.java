package org.mines.douai.pacqueteau_freau.bancairebackend.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IbanRequestDto {
    private String iban;
    
    @JsonCreator
    public IbanRequestDto(@JsonProperty("iban") String iban) {
        this.iban = iban;
    }
    
    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
}
