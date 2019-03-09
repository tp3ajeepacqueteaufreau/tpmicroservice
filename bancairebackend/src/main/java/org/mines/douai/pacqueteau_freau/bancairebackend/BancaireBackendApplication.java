package org.mines.douai.pacqueteau_freau.bancairebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BancaireBackendApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BancaireBackendApplication.class, args);
    }
    
}
