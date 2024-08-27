package service;

import entities.Movies;
import entities.Rent;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class RentService {

    Scanner num = new Scanner(System.in);

    public Rent creatRent (Movies [] listM) {

        boolean ss = true;
        String tittle = "";
        LocalDate dateStart = null;
        LocalDate dateFinish = null;
        double price = 0;



        do {
            System.out.println("-----------------------");
            System.out.println("write the number of the movie");
            int n = num.nextInt();
            System.out.println("-----------------------");

            if (listM[n].isAvailable()) {

                ss = false;
                listM[n].setAvailable(false);
                tittle = listM[n].getTittle();

                System.out.println("-----------------------");
                System.out.println("write the day you come back the movie: ");
                int day = num.nextInt();

                System.out.println("write the month you come back the movie: ");
                int month = num.nextInt();

                dateFinish = LocalDate.of(2023,month,day);
                dateStart = LocalDate.now();

                price = rentPrice(dateStart,dateFinish);

                System.out.println("----------------------");
                System.out.println("YOU RENT " + listM[n].getTittle());
                System.out.println();
            }else {
                System.out.println("---------------------");
                System.out.println("the movie is not available");
                System.out.println("try again with other movie");
            }
        }while(ss);

        return new Rent(tittle, dateStart, dateFinish,price);
    }


    public void listMoviesRent(Rent[] listR) {
            for ( int j = 0  ; j < listR.length; j++ ) {
                System.out.println(j + " " + listR[j].toString());
            }
        }




    public void searchdate(LocalDate date) {

    }

    public double rentPrice(LocalDate dateStart, LocalDate dateFinish) {
        double price = 10;
        long days = ChronoUnit.DAYS.between(dateStart, dateFinish);

        if (days > 3) {
            for (int i = 3; i <= days; i++) {
                price = price + ((price * 10) / 100);
            }
        }

        System.out.println("you have to pay: " + price);

        return price;
    }

}
