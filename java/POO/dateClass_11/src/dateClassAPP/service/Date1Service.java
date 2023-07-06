package dateClassAPP.service;

import dateClassAPP.entities.Date1;

import java.util.Scanner;


public class Date1Service {
    Scanner num = new Scanner(System.in);

    public Date1 UserDate () {

        System.out.println("day");
        System.out.println("---");
        int day = num.nextInt();


        System.out.println("month");
        int month = num.nextInt();
        System.out.println("---");


        System.out.println("year");
        int year = num.nextInt();
        System.out.println("---");

        return new Date1(day,month,year);
    }
}
