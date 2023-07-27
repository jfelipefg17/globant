package service;

import entities.Movie;
import javafx.util.converter.LocalTimeStringConverter;

import java.lang.reflect.Modifier;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMovies {

    ArrayList<Movie> listM = new ArrayList<>();
    private final Scanner read = new Scanner(System.in);
    private final Scanner num = new Scanner(System.in);

    public void creatMovie () {


        System.out.println("write the name of the movie");
        String nameM = read.nextLine();

        System.out.println("write the name of the movie director");
        String nameD = read.nextLine();

        System.out.println("write duration hours");
        int hrs = num.nextInt();

        System.out.println("-----------------------");

        System.out.println("write duration min");
        int min = num.nextInt();

        LocalTime time = LocalTime.of(hrs,min);

        listM.add(new Movie(nameM,nameD,time));
    }

    public void printList () {
        for (Movie var : listM) {
            System.out.println(var);
        }
    }
}
