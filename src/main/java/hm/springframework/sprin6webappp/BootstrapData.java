package hm.springframework.sprin6webappp;

import hm.springframework.sprin6webappp.domain.Author;
import hm.springframework.sprin6webappp.domain.Book;
import hm.springframework.sprin6webappp.repositories.AuthorRepository;
import hm.springframework.sprin6webappp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setFirstname("eric");
        eric.setLastname("Hm");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author hana = new Author();
        eric.setFirstname("Hana");
        eric.setLastname("Mansouri");

        Book noEJB = new Book();
        ddd.setTitle("J2EE Developemnt without EJB");
        ddd.setIsbn("54757585");

        Author hanaSaved = authorRepository.save(hana);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        hanaSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(hanaSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: "+ authorRepository.count());
        System.out.println("Book Count: "+bookRepository.count());


    }
}
