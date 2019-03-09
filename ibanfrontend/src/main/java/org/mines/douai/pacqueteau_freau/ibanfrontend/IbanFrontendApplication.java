package org.mines.douai.pacqueteau_freau.ibanfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IbanFrontendApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(IbanFrontendApplication.class, args);
    }
    
}
