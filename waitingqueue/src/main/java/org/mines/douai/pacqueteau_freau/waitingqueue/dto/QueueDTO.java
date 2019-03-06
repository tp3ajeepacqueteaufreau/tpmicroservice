package org.mines.douai.pacqueteau_freau.waitingqueue.dto;


public class QueueDTO {
    
    public String id;
    
    public String action;
    
    public QueueDTO(String id, String action) {
        this.id = id;
        this.action = action;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
}
