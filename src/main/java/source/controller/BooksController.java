package source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {



    @PostMapping("/addBook")
    public String reciZdravo(@RequestParam String name, @RequestParam String writer) {
        return "New book created, name: " + name + " written by " + writer;
    }


}