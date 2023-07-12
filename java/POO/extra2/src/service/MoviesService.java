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
        System.out.println("write duration hours-minutes-seconds");
        String time = read.nextLine();
        LocalTime duration = LocalTime.parse(time);

        return new Movies(tittle,genre,year,duration);

    }

    public String [] listMoviesAvailable() {
        return null;
    }

    public void searchTittle(String tittle) {

    }
    public void searchGenre(String genre) {

    }
}
