package hm.springframework.sprin6webappp.repositories;

import hm.springframework.sprin6webappp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
