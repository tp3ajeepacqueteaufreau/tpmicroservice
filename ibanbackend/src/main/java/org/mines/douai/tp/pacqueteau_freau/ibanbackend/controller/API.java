package org.mines.douai.tp.pacqueteau_freau.ibanbackend.controller;

import org.mines.douai.tp.pacqueteau_freau.ibanbackend.DTO.IbanAnswerDTO;
import org.mines.douai.tp.pacqueteau_freau.ibanbackend.DTO.IbanRequestDto;
import org.mines.douai.tp.pacqueteau_freau.ibanbackend.service.IbanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    
    @Autowired
    public IbanService service;
    
    @PostMapping("/iban")
    public IbanAnswerDTO verifyIban(@RequestBody IbanRequestDto requestDto) {
        return this.service.verifyIBAN(requestDto);
    }
    
}
