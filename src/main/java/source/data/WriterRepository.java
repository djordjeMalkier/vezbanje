package source.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.model.Writer;
import java.util.List;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Long> {
    List<Writer> findAll();
    Writer save(Writer writer);
}

