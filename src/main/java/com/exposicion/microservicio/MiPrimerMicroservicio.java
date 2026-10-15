package com.exposicion.microservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiPrimerMicroservicio {

    @GetMapping("/taller")
    public String responder() {
        return "¡Hola! Mi primer microservicio con Spring Boot está funcionando correctamente.";
    }
}