package org.mines.douai.pacqueteau_freau.bancairebackend.service;

import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.IbanAnswerDTO;
import org.mines.douai.pacqueteau_freau.bancairebackend.DTO.IbanRequestDto;
import org.springframework.stereotype.Service;

@Service
public class IbanService {

//    @Autowired
//    private IbanServiceProxy serviceProxy;
    
    public IbanAnswerDTO checkIban(IbanRequestDto ibanRequestDto) {
        //return this.serviceProxy.checkIban(ibanRequestDto);
        return null;
    }
    
}
