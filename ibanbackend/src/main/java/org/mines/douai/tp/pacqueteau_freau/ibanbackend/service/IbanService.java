package org.mines.douai.tp.pacqueteau_freau.ibanbackend.service;

import org.mines.douai.tp.pacqueteau_freau.ibanbackend.DTO.IbanAnswerDTO;
import org.mines.douai.tp.pacqueteau_freau.ibanbackend.DTO.IbanRequestDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class IbanService {
    
    @Value("${metier.ibanregex}")
    private String ibanregex;
    
    
    public IbanAnswerDTO verifyIBAN(IbanRequestDto requestDto) {
        Pattern p = Pattern.compile(this.ibanregex);
        return new IbanAnswerDTO(requestDto.getIban(), p.matcher(requestDto.getIban()).matches());
    }
}
