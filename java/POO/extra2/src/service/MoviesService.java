package service;

import entities.Movies;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MoviesService {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);


    public Movies creatMovie () {

        System.out.println("-----------------------");
        System.out.println("write the name of the movie");
        String tittle = read.nextLine();
        System.out.println("-----------------------");
        System.out.println("write genre");
        String genre = read.nextLine();
        System.out.println("-----------------------");
        System.out.println("year");
        int year = num.nextInt();
        System.out.println("-----------------------");
        System.out.println("write duration hours");
        int hrs = num.nextInt();
        System.out.println("-----------------------");
        System.out.println("write duration min");
        int min = num.nextInt();

        LocalTime duration = LocalTime.of(hrs,min);

        boolean available = true;

        return new Movies(tittle,genre,year,duration,available);

    }

    public String [] listMoviesAvailable() {
        return null;
    }

    public void searchTittle(String tittle) {

    }
    public void searchGenre(String genre
    ) {

    }
}
