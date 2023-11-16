package com.Globant.library.controllers;

import com.Globant.library.entities.Author;
import com.Globant.library.exceptions.MyExceptions;
import com.Globant.library.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/author")
public class AuthorController {

  @Autowired
  private AuthorService authorService;

  @GetMapping("/register")
  public String authorForm() {
    return "authorForm.html";
  }

  @PostMapping("/registration")
  public String registration (@RequestParam String name) {
//    System.out.println("Name" + name);

    try {
      authorService.creatAuthor(name);

    }catch (MyExceptions e) {
      System.out.println(e.getMessage());
      return "authorForm.html";
    }


    return "index.html";
  }
}
