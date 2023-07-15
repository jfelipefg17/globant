package service;

import entities.Movies;
import entities.Rent;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MoviesService {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    RentService r1 = new RentService();


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

    public void listMoviesAvailable( Movies [] listM,Rent [] listR) {

        for ( int i = 0  ; i < listR.length; i++ ){
            for ( int j = 0  ; j < listM.length; j++ ) {
                System.out.println(j + " " + listM[j].toString());
            }
            listR[i] = r1.creatRent(listM);
        }




    }

    public boolean searchTittle(Movies [] listM) {

        boolean ss = true;
        System.out.println("LEST CHECH A MOVIE IN THE LIST");
        System.out.println("write the movie tittle");
        String movie = read.nextLine();
        for ( int i = 0; i < listM.length; i++ ) {
            if (movie.equals(listM[i].getTittle())) {
                ss = true;
                break;
            }else {
                ss = false;
            }
        }
        return ss;
    }
    public boolean searchGenre(Movies [] listM) {

        boolean ss = true;
        System.out.println("LEST CHECH A MOVIE IN THE LIST");
        System.out.println("write the movie tittle");
        String genre = read.nextLine();
        for ( int i = 0; i < listM.length; i++ ) {
            if (genre.equals(listM[i].getGenre())) {
            ss = true;
            break;
            }else {
            ss = false;
            }

        }
        return ss;
    }
}
