# Taller: Tu primer Microservicio con Spring Boot

¡Bienvenidos al taller! Sigue estos pasos:

1. Descarga el proyecto en formato ZIP o clónalo.
2. Abre la carpeta en tu IDE (IntelliJ, Eclipse, VS Code, NetBeans).
3. Ve a la ruta `src/main/java/com/example/demo` (o el paquete que hayas creado).
4. Crea una clase llamada `MiPrimerMicroservicio.java` y pega exactamente el siguiente código:

```java
package com.example.demo; // Asegúrate de que coincida con tu paquete

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MiPrimerMicroservicio {

    @GetMapping("/taller") 
    public String funcionar() {
        return "¡Hola! Mi microservicio con Spring Boot está vivo.";
    }
}
