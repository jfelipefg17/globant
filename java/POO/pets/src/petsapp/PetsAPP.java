package petsapp;

import petsapp.entities.Pet;
import petsapp.services.ServicePet;
import petsapp.services.ServiceUser;

/**
 * no termino de entender bien como funciona PetsAPP ni como
 * estoy llmando a las cosas seteando y eso no se que hago en las lineas 17 y 18
 * no se como hacer para agregar el nombre del dueno del perro al constructor orginal
 * del perro que en un inicio sale sin dueno
 * no se si lo estoy haciendo bien
 * estoy enredado con el tema de objetos intanciar constructor llamar desde otros
 * archivos , settter gettter etec.
 *
 * */

public class PetsAPP {

    public static void main(String[] args) {


        ServicePet p = new ServicePet();
        ServiceUser us = new ServiceUser();

        Pet p1 = p.creatPet();

        // i cant put p1 because in pet,java i have toString
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println(p1);
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");


        us.petOwner(p1.getName(), p1.getRace());


        p1.setOwnerName(String.valueOf(us.owner()));



        p1.setOwner(true);
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println(p1);

    }
}
