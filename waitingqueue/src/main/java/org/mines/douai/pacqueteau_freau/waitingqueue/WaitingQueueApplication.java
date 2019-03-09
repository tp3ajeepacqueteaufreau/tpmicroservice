package org.mines.douai.pacqueteau_freau.waitingqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WaitingQueueApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WaitingQueueApplication.class, args);
    }
    
}
