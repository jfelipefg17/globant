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

    public void listMoviesAvailable( Movies [] listM) {

        for ( int i = 1; i <= listM.length; i++ ){
            System.out.println("------------------");
            System.out.println("TITTLE: " + listM[i].getTittle());
            System.out.println("------------------");
            System.out.println("GENRE: " + listM[i].getGenre());
            System.out.println("------------------");
            System.out.println("YEAR: " + listM[i].getYear());
            System.out.println("------------------");
            System.out.println("DURATION: " + listM[i].getDuration());
            System.out.println("------------------");
            System.out.println("AVAILABLE: " + listM[i].isAvailable());
            System.out.println("------------------");
        }


    }

    public void searchTittle(Movies [] listM) {

        System.out.println("write the movie tittle");
        String movie = read.nextLine();
        for ( int i = 1; i <= listM.length; i++ ) {
            if (movie.equals(listM[i].getTittle())) {
                System.out.println("--------------");
                System.out.println("WE HAVE THE MOVIE");
                System.out.println("this is the movie" + listM[i].getTittle());
            }else {
                System.out.println("-------------");
                System.out.println("WE DONT HAVE THE MOVIE");
            }
        }
    }
    public void searchGenre(Movies [] listM) {
        System.out.println("write the movie tittle");
        String genre = read.nextLine();
        for ( int i = 1; i <= listM.length; i++ ) {
            if (genre.equals(listM[i].getGenre())) {
                System.out.println("--------------");
                System.out.println("WE HAVE THE GENRE");
                System.out.println("this is the movie" + listM[i].getTittle());
            }else {
                System.out.println("-------------");
                System.out.println("WE DONT HAVE THE Genre");
            }

        }
    }
}
