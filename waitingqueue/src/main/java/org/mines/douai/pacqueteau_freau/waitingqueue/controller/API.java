package org.mines.douai.pacqueteau_freau.waitingqueue.controller;

import org.mines.douai.pacqueteau_freau.waitingqueue.dto.QueueDTO;
import org.mines.douai.pacqueteau_freau.waitingqueue.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    
    @Autowired
    public QueueService service;
    
    @PostMapping("/addinqueue")
    public String addInQueue(@RequestBody QueueDTO queueDTO) {
        return this.service.addInQueue(queueDTO);
    }
    
    @PostMapping("/getinqueue")
    public String getInQueue(@RequestBody QueueDTO queueDTO) {
        return this.service.getInQueue(queueDTO);
    }
    
}
