package service;

import entities.Rent;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class RentService {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);


    public Rent creatRent () {
        // change available boolean
        System.out.println("-----------------------");
        System.out.println("write the name of the movie");
        String tittle = read.nextLine();
        System.out.println("-----------------------");

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("-----------------------");
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
