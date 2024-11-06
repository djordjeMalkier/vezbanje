package source.service;

import org.springframework.beans.factory.annotation.Autowired;
import source.data.BookRepository;
import source.model.Book;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{


    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks(Long id) {
        return bookRepository.getAllById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
//        book.setId(4l);
//        book.setTitle("Anabell Lee");
//        book.setPrice(BigDecimal.valueOf(19.99));
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooksMoreExpensiveThan(BigDecimal price) {
        return bookRepository.findAllByPriceIsGreaterThan(price);
    }

    @Override
    public List<Book> getByTitle(String title) {
        return bookRepository.findAllByTitleContaining(title);
    }
}
