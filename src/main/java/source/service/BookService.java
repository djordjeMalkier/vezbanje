package source.service;

import source.model.Book;

import java.math.BigDecimal;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks(Long id);
    List<Book> getAll();

    Book save(Book book);

    List<Book> getBooksMoreExpensiveThan(BigDecimal price);

    List<Book> getByTitle(String title);
}
