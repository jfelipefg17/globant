package petsapp;

import petsapp.entities.Pet;
import petsapp.servicies.ServicePet;

import java.util.Scanner;

public class PetsAPP {

    public static void main(String[] args) {

        ServicePet p = new ServicePet();

        Pet p1 = p.creatPet();

        System.out.println(p1);
    }
}
