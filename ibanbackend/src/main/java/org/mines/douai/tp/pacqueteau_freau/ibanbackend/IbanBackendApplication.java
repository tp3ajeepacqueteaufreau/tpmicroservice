package org.mines.douai.tp.pacqueteau_freau.ibanbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IbanBackendApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(IbanBackendApplication.class, args);
    }
    
}
