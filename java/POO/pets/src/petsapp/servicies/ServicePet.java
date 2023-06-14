package petsapp.servicies;

import petsapp.entities.Pet;

import java.util.Scanner;

public class ServicePet {

    private Scanner read = new Scanner(System.in);

    public Pet creatPet () {

        System.out.println("write a name");
        String name = read.next();

        System.out.println("write a name");
        String nickName = read.next();

        System.out.println("write a name");
        String type = read.next();

        return new Pet(name,nickName,type);
    }
}
