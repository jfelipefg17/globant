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
        int price = num.nextInt();
        listP.put(name,price);

    }

    public void modifyProduct () {

        boolean ss = true;
        showProduct();
        System.out.println("//////////////////////////////////////////");
        System.out.println("write the name of the product you want modify");
        String name = read.nextLine();

        for ( Map.Entry<String,Integer> entry : listP.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("write the price of the product");
                int price = num.nextInt();
                entry.setValue(price);
                ss = false;
                break;
            }
        }
        if (ss) {
            System.out.println("THE PRODUCT IS NOT O0N THE LIST");
        } else {
            System.out.println("THE PRODUCT WAS MODIFY");
        }

    }

    public void deleteProduct () {

        showProduct();
        System.out.println("//////////////////////////////////////////");
        System.out.println("write the name of the product you want delete");
        String name = read.nextLine();
        int a1 = listP.size();
        listP.remove(name);
        int a2 = listP.size();
            if (a1 == a2 ) {
                System.out.println("THE PRODUCT IS NOT IN THE LIST");
            } else {
                System.out.println("THE PRODUCT WAS DELETE");
            }

    }

    public void showProduct () {
        for ( Map.Entry<String,Integer> entry : listP.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " Price: " + entry.getValue() );
        }
    }

}
