package com.Globant.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalController {

  @GetMapping("/")
  public String index() {
    return "index.html";
  }


  @GetMapping("/register")
  public String register() {
    return "register.html";
  }

  @GetMapping("/login")
  public String login(){
    return "login.html";
  }


}
