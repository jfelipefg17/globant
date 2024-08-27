package dateClassAPP;


import java.time.LocalDate;

import java.util.Date;
import java.util.Scanner;

/**
 * Let’s put aside for a moment the concept of POO, now we will work
 * only with the Date class. In this exercise we will have to instantiate
 * in the main, a date using the Date class, for this we will have to
 * create 3 variables, day, month and year that the user will be asked
 * to put the constructor of the Date object. Once you have created
 * the date of type Date, you must show it and show how many years
 * there are between that date and the current date, which can be
 * achieved by instantiating a Date object with an empty constructor.
 *
 * Example date: Date date = new Date(anio, month, day);
 *
 * Current date example: Date date date = new Date();
 * */
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("write a day ");
        int day = num.nextInt();
        num.nextLine();
        System.out.println("-----");
        System.out.println("write a month");
        int month = num.nextInt();
        num.nextLine();
        System.out.println("-----");
        System.out.println("write a year");
        int year = num.nextInt();
        num.nextLine();
        System.out.println("-----");
        System.out.println( day +"/" + month +"/" + year);

        Date date1 = new Date(year-1900, month-1, day);

        System.out.println(date1);
        Date date2 = new Date();
        System.out.println(date2);

        int years = date2.getYear() - date1.getYear();

        System.out.println("------------");
        System.out.println(years);
        System.out.println("------------");

        LocalDate date3 = LocalDate.of(year,month,day);
        LocalDate date4 = LocalDate.now();

        int years2 = date4.getYear() - date3.getYear();

        System.out.println("------------");
        System.out.println(years2);
        System.out.println("------------");
    }
}