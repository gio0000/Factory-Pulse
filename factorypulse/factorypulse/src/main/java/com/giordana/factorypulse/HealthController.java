package com.giordana.factorypulse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/status")
    public String status() {
        return "FactoryPulse está funcionando!";
    }
}