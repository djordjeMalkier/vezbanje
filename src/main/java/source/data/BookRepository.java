package source.data;

import org.springframework.data.jpa.repository.Query;
import source.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;

// Spring Data JPA creates CRUD implementation at runtime automatically.
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> getAllById(Long id);

    List<Book> findAll();

    List<Book> findAllByPriceIsGreaterThan(BigDecimal price);

    List<Book> findAllByTitleContaining(String naziv);

    Book save(Book book);
}
