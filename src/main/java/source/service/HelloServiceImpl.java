package source.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl() {
    }

    public String vratiPoruku() {
        return "Zdravo Nikola";
    }
}
