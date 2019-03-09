package org.mines.douai.pacqueteau_freau.bancairefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class API {
    
    @GetMapping("/")
    public String getIndex() {
        return "index.html";
    }
    
}
