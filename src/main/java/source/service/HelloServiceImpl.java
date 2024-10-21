package source.service;

import org.springframework.stereotype.Service;
import source.controller.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl() {
    }

    public String vratiPoruku() {
        return "Zdravo Nikola";
    }
}
