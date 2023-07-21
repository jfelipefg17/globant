package service;

import entities.Routine;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServiceRoutine {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    List<Routine> listR = new ArrayList<Routine>();

    public void registerRoutine() {

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

        listR.add(new Routine(id,name,duration,dif,obj));

    }

    public void routines () {
        for ( int i = 0; i < listR.size();i++ ) {
            System.out.println(i+" "+listR.get(i).toString());
        }
    }
    // number of routine
    public void infoRoutine (int j) {

        System.out.println("/////////NEW DATA/////////");
        System.out.println("write your id");
        int id = num.nextInt();
        listR.get(j).setId(id);
        System.out.println("write your name");
        String name = read.nextLine();
        listR.get(j).setName(name);
        System.out.println("-----------------------");
        System.out.println("write duration hours");
        int hrs = num.nextInt();
        System.out.println("-----------------------");
        System.out.println("write duration min");
        int min = num.nextInt();
        LocalTime duration = LocalTime.of(hrs,min);
        listR.get(j).setTime(duration);
        System.out.println("write the difficult 1-5");
        int dif = num.nextInt();
        listR.get(j).setDifficult(dif);
        System.out.println("write your objective");
        String obj = read.nextLine();
        listR.get(j).setDescription(obj);
        //how to update the arraylist with this information

    }
    // number of routine
    public void deleteRoutine (int k) {

        listR.remove(k);

    }
}
