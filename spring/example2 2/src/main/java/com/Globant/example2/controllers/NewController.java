package com.Globant.example2.controllers;


import com.Globant.example2.entities.New;
import com.Globant.example2.exceptions.MyException;
import com.Globant.example2.services.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/new")
public class NewController {

  @Autowired
  private NewService newService;

  @GetMapping("/create")
  public String createNew(ModelMap modelMap) {

    return "newForm.html";
  }

  @PostMapping("/addNew")
  public String addNew(@RequestParam String tittle, @RequestParam String body) throws MyException {

    try {

      newService.createNew(tittle,body);
    }catch (MyException e){

      System.out.println(e.getMessage());
      return "newForm.html";
    }

    return "index.html";
  }

  @GetMapping("/modify")
  @Transactional
  public String modifyNew(ModelMap modelMap) {

    return "newModify.html";
  }

  @PostMapping("/addModifyNew")
  public String addModifyNew(@RequestParam String tittle, @RequestParam String body) throws MyException {

    try {
      newService.updateNew(tittle,body);
    }catch (MyException e){

      System.out.println(e.getMessage());
      return "newModify.html";
    }

    return "index.html";
  }

  @GetMapping("/delete")
  public String deleteNew(ModelMap modelMap) {

    return "newDelete.html";
  }

  @GetMapping("/newList")
  @Transactional
  public String listNews(ModelMap modelMap) {
    List<New> news = newService.searchAllNews();

    modelMap.addAttribute("news", news);

    return "newsList.html";
  }



}
