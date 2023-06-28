package petsAPP;
/**example objects constructors and accessibility with put encapsulation */


import petsAPP.entities.Pets;

import java.util.Scanner;

public class PetsAPP {

    //method main , hear call everything
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        // declared an object
        Pets d1;
        // instantiation or create an object
        Pets d2 = new Pets();
        // I can send this argument like this because it is public
        Pets d3 = new Pets(true);




        // this attribute of the object is public
        // and that is why I can access in this way
        d2.name = "cooper";

        System.out.println(d2.name);
        System.out.println("-----------------------------------------------------------------------------------");



    }
}