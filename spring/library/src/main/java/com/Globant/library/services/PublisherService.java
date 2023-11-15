package com.Globant.library.services;

import com.Globant.library.entities.Publisher;
import com.Globant.library.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherService {

  @Autowired
  private PublisherRepository publisherRepository;

  @Transactional
  public void createPublisher (String name) {

    Publisher publisher = new Publisher();

    publisher.setName(name);

    publisherRepository.save(publisher);
  }

  public List<Publisher> searchAllPublisher(){

    List<Publisher> publisherList = new ArrayList<>();

    publisherList = publisherRepository.findAll();

    return publisherList;
  }
}
