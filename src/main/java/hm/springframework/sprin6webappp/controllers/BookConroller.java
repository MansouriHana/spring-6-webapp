package hm.springframework.sprin6webappp.controllers;

import hm.springframework.sprin6webappp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookConroller {
    private final BookService bookService;

    public BookConroller(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
