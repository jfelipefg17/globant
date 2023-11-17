package com.Globant.library.controllers;

import com.Globant.library.exceptions.MyExceptions;
import com.Globant.library.services.AuthorService;
import com.Globant.library.services.BookService;
import com.Globant.library.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
  public String registration (@RequestParam(required = false) Long isbn , @RequestParam String tittle, @RequestParam(required = false) Integer numberBook, @RequestParam String idAuthor, @RequestParam String idPublisher, ModelMap model) {

    try {

      bookService.createBook(isbn,tittle,numberBook,idAuthor,idPublisher);
      model.put("Good", "The Book was successfully uploaded");

    }catch (MyExceptions e){

      System.out.println(e.getMessage());
      model.put("Error", e.getMessage());

      return "bookForm.html";
    }

    return "index.html";
  }
}
