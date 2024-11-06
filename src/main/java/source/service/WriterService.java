package source.service;

import source.model.Writer;

import java.util.List;

public interface WriterService {

    List<Writer> getAll();

    Writer save(Writer writer);

}
