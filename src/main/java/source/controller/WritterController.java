package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import source.model.Writer;
import source.service.WriterService;

import java.util.List;

@RestController
@RequestMapping("/writer")
public class WritterController {

    @Autowired
    private WriterService writerService;

    @GetMapping("/get-all")
    public List<Writer> getAll() {
        return writerService.getAll();
    }

    @PostMapping("/save")
    public Writer save(Writer writer) {
        return writerService.save(writer);
    }

}
