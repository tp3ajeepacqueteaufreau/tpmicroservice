package org.mines.douai.pacqueteau_freau.ibanfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {
    
    @GetMapping("/")
    public String getIban() {
        return "index.html";
    }
    
}
