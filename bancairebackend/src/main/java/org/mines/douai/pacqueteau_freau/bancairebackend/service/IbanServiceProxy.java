package org.mines.douai.pacqueteau_freau.bancairebackend.service;


import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.IbanAnswerDTO;
import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.IbanRequestDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient("iban")
public interface IbanServiceProxy {
    
    @RequestMapping(method = RequestMethod.POST, value = "http://localhost:8082/iban")
    public IbanAnswerDTO checkIban(IbanRequestDto ibanRequestDto);
    
}
