package com.Globant.example2.controllers;


import com.Globant.example2.services.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class NewController {

  @Autowired
  private NewService newService;

  @GetMapping("/NewList")
  public String cards() {

    return "index.html";
  }



}
