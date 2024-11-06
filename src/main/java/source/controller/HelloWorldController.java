package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import source.aop.LogAudit;
import source.service.HelloService;

@RestController
@RequestMapping("/knjige")
public class HelloWorldController {

    @Qualifier("zdravoServiceImpl")
    @Autowired
    HelloService helloService;

    @LogAudit
    @GetMapping("/zdravo")
    public String reciZdravo() {
        return helloService.vratiPoruku();
    }

    @LogAudit
    @GetMapping("/pozdrav")
    public String reciPozdrav() throws InterruptedException {
        System.out.println("test");
        Thread.sleep(3000);
        return "Pozdrav Djordje";
    }

    @GetMapping("/funkcionalnost")
    public String funkcionalnost() {
        return "funkcionalnost";
    }


}