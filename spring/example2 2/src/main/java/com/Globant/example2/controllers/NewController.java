package com.Globant.example2.controllers;


import com.Globant.example2.entities.New;
import com.Globant.example2.exceptions.MyException;
import com.Globant.example2.services.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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
  public String addNew(@RequestParam String tittle, @RequestParam String body, ModelMap modelMap) throws MyException {

    try {

      newService.createNew(tittle,body);
      modelMap.put("Good", "The Author was successfully uploaded");
    }catch (MyException e){

      System.out.println(e.getMessage());
      modelMap.put("error", e.getMessage());
      return "newForm.html";
    }

    return "index.html";
  }




  @GetMapping("/modify/{tittle}")
  @Transactional
  public String modifyNew(@PathVariable String tittle, ModelMap modelMap) {
    modelMap.put("new", newService.getOne(tittle));

    return "newModify.html";
  }

  @PostMapping("/modify{tittle}")
  @Transactional
  public String addModifyNew(@RequestParam String tittle, @RequestParam String body, ModelMap modelMap) throws MyException {

    try {
      newService.updateNew(tittle,body);

      return "redirect../newList";
    }catch (MyException e){

      System.out.println(e.getMessage());
      modelMap.put("error", e.getMessage());
      return "newModify.html";
    }

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
