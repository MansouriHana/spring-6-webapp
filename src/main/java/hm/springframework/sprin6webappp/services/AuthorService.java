package hm.springframework.sprin6webappp.services;

import hm.springframework.sprin6webappp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
