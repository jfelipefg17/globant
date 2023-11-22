package com.Globant.example2.services;

import com.Globant.example2.entities.New;
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
  public void createNew(String tittle, String body) {

  }

  public List<New> searchAllNews(){

    return newRepository.findAll();
  }

  public New searchNewByTittle(String tittle) {

    return newRepository.getById(tittle);
  }

  public void updateNew (String tittle, String body) {

  }

  public void deleteNew(String tittle) {

    newRepository.deleteById(tittle);
  }





}
