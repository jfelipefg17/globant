package com.Globant.example2.services;

import com.Globant.example2.entities.New;
import com.Globant.example2.exceptions.MyException;
import com.Globant.example2.repositories.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class NewService {

  @Autowired
  private NewRepository newRepository;


  @Transactional
  public void createNew(String tittle, String body) throws MyException {

    validator(tittle,body);

    New news = new New(tittle,body);

    newRepository.save(news);

  }

  public List<New> searchAllNews(){

    return newRepository.findAll();
  }

  public New searchNewByTittle(String tittle) {

    return newRepository.getById(tittle);
  }

  public void updateNew (String tittle, String body) throws MyException {

  }

  public void deleteNew(String tittle) {

    newRepository.deleteById(tittle);
  }

  private void validator( String tittle, String body) throws MyException {

    if (tittle == null || tittle.isEmpty()) {
      throw new MyException("the name cant be null or empty");
    }

    if (body == null || body.isEmpty()) {
      throw new MyException("the name cant be null or empty");
    }
  }




}
