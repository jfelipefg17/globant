package service;

import entities.Fly;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ServiceFly {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);
    private Random random = new Random();

    HashMap<String, Fly> flyList = new HashMap<>();

    public void createFly () {


        System.out.println("write code of the fly EXAMPLE (AAA512) ");
        String code = read.nextLine();
        System.out.println("==================");
        System.out.println("");
        int id = random.nextInt(10000 - 99999);
        boolean ava = true;
        //local date

        // local time

        //flyList.put(code,new Fly(code,id,ava,date,time));
    }

    public void showFly () {

        for ( Map.Entry<String,Fly> entry : flyList.entrySet()) {
            System.out.println("code fly" + entry.getKey() + "fly: " + entry.getValue());
        }

    }

    public void reserveFly () {

        boolean ss = true;

        showFly();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("write the code of the fly u want to reserve");
        String code = read.nextLine();

        for ( Map.Entry<String,Fly> entry : flyList.entrySet()) {

            if (entry.getKey().equals(code) ) {
                if (entry.getValue().isAvailable()) {
                    System.out.println("you have reservation for " + entry.getKey() + "fly");
                    entry.getValue().setAvailable(false);
                    ss = false;
                    break;
                } else {
                    System.out.println("THAT FLY IS NO AVAILABLE");
                    break;
                }
            }
        }
        if (ss) {
            System.out.println(" THE CODE YOU WROTE IS NOT ON THE FLY LIST");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        }
    }

    public void deleteFly () {

        boolean ss = true;

        showFly();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("write the code of the fly u want to delete");
        String code = read.nextLine();

        for ( Map.Entry<String, Fly> entry : flyList.entrySet() ) {

            if (entry.getKey().equals(code)) {
                flyList.remove(entry.getKey());
                System.out.println("you remove fly: " + entry.getKey());
                ss = false;
                break;
            }
        }
        if (ss) {
            System.out.println(" THE CODE YOU WROTE IS NOT ON THE FLY LIST");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        }
    }
}
