package source.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/zdravo")
    public String reciZdravo() {
        return "Zdravo Nikola";
    }

    @GetMapping("/pozdrav")
    public String reciPozdrav() {
        return "Pozdrav Djordje";
    }
}