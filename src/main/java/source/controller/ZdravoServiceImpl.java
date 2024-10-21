package source.controller;

import org.springframework.stereotype.Service;

@Service
public class ZdravoServiceImpl implements HelloService{
    @Override
    public String vratiPoruku() {
        return "ZdravoZdravo";
    }
}
