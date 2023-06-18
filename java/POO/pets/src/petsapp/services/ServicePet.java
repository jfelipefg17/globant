package petsapp.services;

import petsapp.entities.Pet;

import java.util.Scanner;

public class ServicePet {

    private Scanner read = new Scanner(System.in);
    private Scanner num = new Scanner(System.in);
    private Scanner bo = new Scanner(System.in);

    public Pet creatPet () {

        System.out.println("write a name");
        String name = read.nextLine();

        System.out.println("write a nickname");
        String nickName = read.nextLine();

        System.out.println("write a type of pet");
        String type = read.nextLine();

        System.out.println("write a color of the pet");
        String color = read.nextLine();

        System.out.println("write the race");
        String race = read.nextLine();

        System.out.println("write how many year have your pet" );
        int age = num.nextInt();

        System.out.println("your pet have a tail");
        boolean tail = bo.nextBoolean();


        return new Pet(name,nickName,type,color,race,age,tail);
    }
}
