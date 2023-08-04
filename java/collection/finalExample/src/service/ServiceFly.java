package service;

import entities.Fly;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class ServiceFly {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);
    private Random random = new Random();

    HashMap<String, Fly> flyList = new HashMap<>();

    public void createFly () {

        LocalDate date;
        LocalTime duration;

        System.out.println("write code of the fly EXAMPLE (AAA512) ");
        System.out.println("==================");
        String code = read.nextLine();
        int id = random.nextInt(10000 - 99999);
        boolean ava = true;
        System.out.println("write date of the fly (MM/DD) ");
        System.out.println("==================");
        date = LocalDate.parse(read.nextLine());
        System.out.println("write duration of the fly (HH/MM) ");
        System.out.println("==================");
        duration = LocalTime.parse(read.nextLine());
        flyList.put(code,new Fly(code,id,ava,date,duration));

        System.out.println("YOU ADD A NEW FLY");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
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
                    System.out.println("YOU HAE RESERVED " + entry.getKey() + " FLY");
                    entry.getValue().setAvailable(false);
                    ss = false;
                } else {
                    System.out.println("THAT FLY IS NO AVAILABLE");
                }
                break;
            }
        }
        if (ss) {
            System.out.println(" THE CODE YOU WROTE IS NOT ON THE FLY LIST");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||");
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
