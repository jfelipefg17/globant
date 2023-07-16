package service;


import entities.Routine;

import java.time.LocalTime;
import java.util.Scanner;


public class ServiceRoutine {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    public Routine registerRoutine() {
        System.out.println("write your id");
        int id = num.nextInt();
        System.out.println("write your name");
        String name = read.nextLine();
        System.out.println("-----------------------");
        System.out.println("write duration hours");
        int hrs = num.nextInt();
        System.out.println("-----------------------");
        System.out.println("write duration min");
        int min = num.nextInt();
        LocalTime duration = LocalTime.of(hrs,min);
        System.out.println("write the difficult 1-5");
        int dif = num.nextInt();
        System.out.println("write your objective");
        String obj = read.nextLine();
        return new Routine(id,name,duration,dif,obj);
    }

    public Routines () {

    }

    public void infoRoutine () {

    }

    public void deleteRoutine () {

    }
}
