package com.Globant.library.controllers;

import com.Globant.library.exceptions.MyExceptions;
import com.Globant.library.services.AuthorService;
import com.Globant.library.services.BookService;
import com.Globant.library.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {

  @Autowired
  private BookService bookService;
  @Autowired
  private AuthorService authorService;
  @Autowired
  private PublisherService publisherService;


  @GetMapping("/register")
  public String bookForm() {
    return "bookForm.html";
  }

  @PostMapping("/registration")
  public String registration (@RequestParam Long isbn ,@RequestParam String tittle, Integer numberBook, String idAuthor, String idPublisher) {

    try {
      bookService.createBook(isbn,tittle,numberBook,idAuthor,idPublisher);
    }catch (MyExceptions e){
      System.out.println(e.getMessage());
      return "index.hmtl";
    }

    return "index.html";
  }
}
