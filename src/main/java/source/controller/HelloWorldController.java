package source.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/zdravo")
    public String reciZdravo() {
        System.out.println("komentar");
        return "Zdravo Nikola";
    }

    @GetMapping("/pozdrav")
    public String reciPozdrav() {
        System.out.println("test");
        return "Pozdrav Djordje";
    }

    @GetMapping("/funkcionalnost")
    public String funkcionalnost() {
        return "funkcionalnost";
    }
}