package com.Globant.library.controllers;

import com.Globant.library.entities.User;
import com.Globant.library.exceptions.MyExceptions;
import com.Globant.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PortalController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String index() {
    return "login.html";
  }


  @GetMapping("/register")
  public String register() {
    return "register.html";
  }

  @PostMapping("/register")
  public String register(@RequestParam String name, @RequestParam String email, @RequestParam String password1, @RequestParam String password2, ModelMap modelMap) throws MyExceptions{

    try {
     userService.register(name, email, password1, password2);
     modelMap.put("Good","User Successfully Registered");

     return "index1.html";

   } catch (MyExceptions e) {

     modelMap.put("Error", e.getMessage());
      modelMap.put("name", name);
      modelMap.put("email",email);

     return "register.html";

   }

  }

  @GetMapping("/login")
  public String login(@RequestParam(required = false) String error, ModelMap modelMap){
    if (error != null) {
      modelMap.put("Error","Email Or Password could be wrong");
    }
    return "login.html";
  }

  @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
  @GetMapping("/start")
  public String start(HttpSession session) {

    User logUser = (User) session.getAttribute("userSession");

    if (logUser.getRole().toString().equals("ADMIN")) {
      return "redirect:/admin/dashboard";
    } else {
      return "index1.html";
    }
  }

//  @PreAuthorize("hasRole('ROLE_USER')")
//  @GetMapping("/start")
//  public String start() {
//    return "index1.html";
//  }


}
