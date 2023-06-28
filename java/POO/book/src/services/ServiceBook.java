package services;

import entities.Book;

import java.util.Scanner;

public class ServiceBook {
    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    public Book createBook () {
        System.out.println("write the ISBN");
        int ISBN = num.nextInt();
        System.out.println("write the tittle");
        String tittle = read.nextLine();
        System.out.println("write the author of the book");
        String author = read.nextLine();
        System.out.println("number of pages");
        int numberPages = num.nextInt();

        return new Book(ISBN,tittle,author,numberPages);
    }

    public void showBook(int isbn, String author, String tittle, int numberPages) {
        System.out.println(isbn + "/" + author + "/" + tittle + "/" + numberPages);
    }
}
