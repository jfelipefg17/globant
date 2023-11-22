package com.Globant.example2.entities;

import org.thymeleaf.spring5.util.SpringRequestUtils;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class New {

  @Id
  private String tittle;
  private String body;

  public New() {

  }

  public New(String tittle, String body) {
    this.tittle = tittle;
    this.body = body;
  }

  public String getTittle() {
    return tittle;
  }

  public void setTittle(String tittle) {
    this.tittle = tittle;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
