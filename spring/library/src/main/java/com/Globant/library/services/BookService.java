package com.Globant.library.services;

import com.Globant.library.entities.Author;
import com.Globant.library.entities.Book;
import com.Globant.library.entities.Publisher;
import com.Globant.library.repositories.AuthorRepository;
import com.Globant.library.repositories.BookRepository;
import com.Globant.library.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;
  @Autowired
  private AuthorRepository authorRepository;
  @Autowired
  private PublisherRepository publisherRepository;

  @Transactional
  public void createBook(Long isbn, String tittle, Integer numberBooks, String idAuthor, String idPublisher) {

    Author author = authorRepository.findById(idAuthor).get();
    Publisher publisher = publisherRepository.findById(idPublisher).get();

    Book book = new Book();

    book.setIsbn(isbn);
    book.setTittle(tittle);
    book.setNumberBooks(numberBooks);
    book.setEntryDate(new Date());
    book.setAuthor(author);
    book.setPublisher(publisher);

    bookRepository.save(book);
  }

  public List<Book>  searchAllBook(){

    List<Book> bookList = new ArrayList<>();

    bookList = bookRepository.findAll();

    return bookList;
  }
}
