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

    public void routines () {

    }
    // number of routine
    public void infoRoutine (int j) {

        System.out.println("/////////NEW DATA/////////");
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

        //how to update the arraylist with this information

    }
    // number of routine
    public void deleteRoutine (int k) {

    }
}
