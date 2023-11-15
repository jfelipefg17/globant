package com.Globant.library.services;

import com.Globant.library.entities.Author;
import com.Globant.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

  @Autowired
  private AuthorRepository authorRepository;
  @Transactional
  public void creatAuthor (String name) {

    Author author = new Author();

    author.setName(name);

    authorRepository.save(author);
  }

  public List<Author> searchAllAuthor () {

    List<Author> authorList = new ArrayList<>();

    authorList = authorRepository.findAll();

    return authorList;
  }
}
