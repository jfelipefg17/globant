package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceProduct {

    private Scanner read = new Scanner(System.in);
    private Scanner num = new Scanner(System.in);
    HashMap<String, Integer> listP = new HashMap<>();

    public void addProduct () {

        System.out.println("write the name of the product");
        String name = read.nextLine();
        System.out.println("write the price of the product");
        Integer price = num.nextInt();

    }

    public void modifyProduct () {

        showProduct();
        System.out.println("//////////////////////////////////////////");
        System.out.println("write the name of the product you want modify");
        String name = read.nextLine();


    }

    public void deleteProduct () {

        showProduct();
        System.out.println("//////////////////////////////////////////");
        System.out.println("write the name of the product you want delete");
        String name = read.nextLine();


    }

    public void showProduct () {
        for ( Map.Entry<String,Integer> entry : listP.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " Price: " + entry.getValue() );
        }
    }

}
