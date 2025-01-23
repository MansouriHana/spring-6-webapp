package hm.springframework.sprin6webappp.repositories;

import hm.springframework.sprin6webappp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long
        > {
}
