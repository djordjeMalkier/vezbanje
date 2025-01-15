package source.controller;

import source.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import source.service.BookService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String reciZdravo(@RequestParam String name, @RequestParam String writer) {
        return "New book created, name: " + name + " written by " + writer;
    }

    @GetMapping("/get-all")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("/get-higher-price")
    public List<Book> getHigherPrice(@RequestParam BigDecimal price) {
        return bookService.getBooksMoreExpensiveThan(price);
    }

    @GetMapping("/get-by-title")
    public List<Book> getHigherPrice(@RequestParam String title) {
        return bookService.getByTitle(title);
    }


}