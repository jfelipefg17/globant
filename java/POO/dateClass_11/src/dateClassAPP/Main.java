package dateClassAPP;

import dateClassAPP.entities.Date1;
import dateClassAPP.service.Date1Service;

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

        //Date1 p1 = new Date1();
        //what is the difference between and the 26 line
        Date1Service d1 = new Date1Service();
        Date1 p1 = d1.UserDate();

        System.out.println(p1);


    }
}