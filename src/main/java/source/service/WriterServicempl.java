package source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.data.WriterRepository;
import source.model.Writer;

import java.util.List;
@Service
public class WriterServicempl implements WriterService{

    WriterRepository writerRepository;

    @Autowired
    public WriterServicempl(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    @Override
    public List<Writer> getAll() {
        return writerRepository.findAll();
    }

    @Override
    public Writer save(Writer writer) {
        return writerRepository.save(writer);
    }
}
