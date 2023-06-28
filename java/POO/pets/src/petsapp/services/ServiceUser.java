package petsapp.services;

import java.util.Scanner;

public class ServiceUser {

    private Scanner read = new Scanner(System.in);
    private Scanner num = new Scanner(System.in);

    public void petOwner (String name, String  race) {

        System.out.println("write name of your pet");
        String name2 = read.next();
        System.out.println("write the race of your pet");
        String race2 = read.next();

        if ((name == name2) && (race == race2)){

        }else {
            System.out.println("sorry you are not owner of " + name );
        }
    }

    public String owner () {

        System.out.println("write your name");
        String ownerName = read.next();


        System.out.println("write your ID");
        int ID = num.nextInt();


        return ownerName;
    }

}
