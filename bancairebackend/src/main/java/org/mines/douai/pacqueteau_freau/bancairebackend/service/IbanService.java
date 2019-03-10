package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.IbanAnswerDTO;
import org.mines.douai.pacqueteau_freau.bancairebackend.dto.IbanRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("iban-backend")
public interface IbanService {
    @RequestMapping(method = RequestMethod.GET, value = "iban")
    public IbanAnswerDTO checkIban(IbanRequestDto requestDto);
}
