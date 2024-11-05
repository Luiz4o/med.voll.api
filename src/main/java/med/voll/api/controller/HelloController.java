package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Request Controller para dizer que está é um classe Controller de uma Api Rest
// Mapping é para falar qual url este controller responde
@RestController
@RequestMapping("/hello")
public class HelloController {

    // Isto define que quando chamar um método Get para está URL estaremos chamando este amigo
    @GetMapping
    public String olaMundo(){
        return "Hello World!";
    }
}
