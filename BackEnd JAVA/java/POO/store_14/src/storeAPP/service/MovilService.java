package storeAPP.service;

import storeAPP.entities.Movil;

import java.util.Scanner;

public class MovilService {

    public Movil cell() {

        Scanner read = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("write the brand of your phone");
        String brand = read.nextLine();
        System.out.println("========================");
        System.out.println("write the price of your phone");
        int price = num.nextInt();
        System.out.println("========================");
        System.out.println("write the model of your phone");
        String model = read.nextLine();
        System.out.println("========================");
        System.out.println("write the ram of your phone");
        int ram = num.nextInt();
        System.out.println("========================");
        System.out.println("write the memory of your phone");
        int memory = num.nextInt();
        System.out.println("========================");
        int[] id = id();


        return new Movil(brand,price,model,ram,memory,id);
    }

    public int [] id() {

        Scanner num = new Scanner(System.in);
        int [] id = new int[7];
        boolean s;
        int j;

        do {
            System.out.println(" ");
            System.out.println("write the code of your phone, it must be  7 digits");
            j = num.nextInt();

            if (Integer.toString(j).length() != 7) {
                s = true;
                System.out.println("it must be 7 digits");
            } else {
                s = false;
            }

        } while (s);

        String jj = String.valueOf(j);
        for ( int i = 0; i < Integer.toString(j).length(); i++ ) {
            id [i] = Integer.parseInt(jj.substring(i,i+1));
        }
        return id;
    }
}
