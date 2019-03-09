package org.mines.douai.pacqueteau_freau.waitingqueue.service;

import org.mines.douai.pacqueteau_freau.waitingqueue.dto.QueueDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class QueueService {
    
    private static final Logger logger = LoggerFactory.getLogger(QueueService.class);
    
    private Map<String, List<String>> queues;
    
    @PostConstruct
    public void postInit() {
        this.queues = new HashMap<>();
    }
    
    @Async("threadPoolTaskExecutor")
    public void updateService() throws InterruptedException {
        logger.info("Calling async message");
    
    
    }
    
    public String addInQueue(QueueDTO queueDTO) {
        String ret = null;
        List<String> el = this.getList(queueDTO);
        if (el.size() != 0) {
            ret = el.get(0);
            el.remove(ret);
        }
        return ret;
    }
    
    
    private List<String> getList(QueueDTO queueDTO) {
        return this.queues.getOrDefault(queueDTO.getDistantService(), new ArrayList<>());
    }
    
    public String getInQueue(QueueDTO queueDTO) {
        List<String> el = this.getList(queueDTO);
        el.add(el.size(), queueDTO.payload);
        this.queues.put(queueDTO.getDistantService(), el);
        return "OK";
    }
}
