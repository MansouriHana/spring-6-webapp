package hm.springframework.sprin6webappp.services;

import hm.springframework.sprin6webappp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
