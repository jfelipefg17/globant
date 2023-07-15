package service;

import entities.Movies;
import entities.Rent;

import java.time.LocalDate;
import java.util.Scanner;


public class RentService {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);


    public Rent creatRent (Movies [] listM) {
        // change available boolean
        System.out.println("-----------------------");
        System.out.println("write the name of the movie");
        String tittle = read.nextLine();
        System.out.println("-----------------------");
        for ( int i = 1; i <= listM.length; i++ ) {
            if (tittle.equals(listM[i].getTittle())) {
                listM[i].setAvailable(false);
                System.out.println("----------------------");
                System.out.println("YOU RENT " + listM[i].getTittle());
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        //price of the rent
        return new Rent();
    }


    public String [] listMoviesRent() {
        return null;
    }

    public void searchRent(LocalDate date) {

    }

    public int rentPrice (LocalDate dateStart, LocalDate dateFinish) {
        return 0;
    }
}
