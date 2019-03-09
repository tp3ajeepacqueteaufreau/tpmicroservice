package org.mines.douai.pacqueteau_freau.waitingqueue.dto;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class QueueDTO {
    
    public String distantService;
    
    public String payload;
    
    @JsonCreator
    public QueueDTO(@JsonProperty("service") String distantService, @JsonProperty("payload") String payload) {
        this.distantService = distantService;
        this.payload = payload;
    }
    
    public String getDistantService() {
        return distantService;
    }
    
    public void setDistantService(String distantService) {
        this.distantService = distantService;
    }
    
    public String getPayload() {
        return payload;
    }
    
    public void setPayload(String payload) {
        this.payload = payload;
    }
}
