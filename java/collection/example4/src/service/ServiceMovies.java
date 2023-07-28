package service;

import entities.Movie;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
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

    public void printMovis1Hour () {
        for (Movie var : listM)  {
            int hrs = 1;
            int seg = 0;
            LocalTime now = LocalTime.of(hrs,seg);
            if (var.getDuration().isAfter(now)) {
                System.out.println(var);
            }
        }
    }

    public void orderTimeHighest () {
        Collections.sort(listM, (Movie m1, Movie m2) -> m1.getDuration().compareTo(m2.getDuration()));
        for (Movie var : listM) {
            System.out.println(var);
        }
    }

    public void orderTimeLowest () {
        Collections.sort(listM, (Movie m1, Movie m2) -> m2.getDuration().compareTo(m1.getDuration()));
        for (Movie var : listM) {
            System.out.println(var);
        }
    }

    public void orderTittle () {
        Collections.sort(listM, (Movie m1, Movie m2) -> m1.getTittle().compareTo(m2.getTittle()));
        for (Movie var : listM) {
            System.out.println(var);
        }
    }

    public void orderDirector () {
        Collections.sort(listM, (Movie m1, Movie m2) -> m1.getDirector().compareTo(m2.getDirector()));
        for (Movie var : listM) {
            System.out.println(var);
        }
    }
}
