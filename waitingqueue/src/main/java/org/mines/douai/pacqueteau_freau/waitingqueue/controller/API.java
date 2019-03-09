package org.mines.douai.pacqueteau_freau.waitingqueue.controller;

import org.mines.douai.pacqueteau_freau.waitingqueue.dto.QueueDTO;
import org.mines.douai.pacqueteau_freau.waitingqueue.service.QueueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    private static final Logger logger = LoggerFactory.getLogger(API.class);
    
    @Autowired
    public QueueService service;
    
    @PostMapping("/addinqueue")
    public String addInQueue(@RequestBody QueueDTO queueDTO) {
        logger.info("Ask for addin in queue");
        String ret = this.service.addInQueue(queueDTO);
        try {
            this.service.updateService();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ret;
    }
    
}
