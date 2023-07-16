package service;

import entities.Client;

import java.util.Scanner;

public class ServiceClient {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Scanner dou = new Scanner(System.in);

    public Client registerClient() {

        System.out.println("write your id");
        int id = num.nextInt();
        System.out.println("write your name");
        String name = read.nextLine();
        System.out.println("write your age");
        int age = num.nextInt();
        System.out.println("write your height");
        double height = dou.nextDouble();
        System.out.println("write your weight");
        int weight = num.nextInt();
        System.out.println("write your objective");
        String obj = read.nextLine();

        return new Client(id,name,age,height,weight,obj);
    }

    public void clients () {
    // 0. to string
    // 1. to string
    }
    // number of client
    public void infoClient (int i) {

        System.out.println("/////////NEW DATA/////////");
        System.out.println("write your id");
        int id = num.nextInt();
        System.out.println("write your name");
        String name = read.nextLine();
        System.out.println("write your age");
        int age = num.nextInt();
        System.out.println("write your height");
        double height = dou.nextDouble();
        System.out.println("write your weight");
        int weight = num.nextInt();
        System.out.println("write your objective");
        String obj = read.nextLine();

        //how to send this new data to the arraylist
    }
    // number of client
    public void deleteClient (int h) {

    }
}
