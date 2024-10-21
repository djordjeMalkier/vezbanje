package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import source.service.HelloServiceImpl;

@RestController
@RequestMapping("/knjige")
public class HelloWorldController {

    @Qualifier("zdravoServiceImpl")
    @Autowired
    HelloService helloService;

    @GetMapping("/zdravo")
    public String reciZdravo() {
        String poruka = helloService.vratiPoruku();
        return poruka;
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