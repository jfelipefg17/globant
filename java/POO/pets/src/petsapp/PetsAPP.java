package petsapp;

import petsapp.entities.Pet;
import java.util.Scanner;

public class PetsAPP {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Pet p1 = new Pet("cooper", read.next(), "Dog");

        p1.setName("mini Copper");

        System.out.println(p1);
//        System.out.println(p1.name + " " + p1.nickName + " " + p1.type + " ");
    }
}
