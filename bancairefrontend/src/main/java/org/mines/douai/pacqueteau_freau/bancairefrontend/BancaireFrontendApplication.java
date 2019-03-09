package org.mines.douai.pacqueteau_freau.bancairefrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BancaireFrontendApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BancaireFrontendApplication.class, args);
    }
    
}
