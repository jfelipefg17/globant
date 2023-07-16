package service;

import entities.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceClient {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Scanner dou = new Scanner(System.in);

    List<Client> listC = new ArrayList<Client>();

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

        listC.add(new Client(id,name,age,height,weight,obj));

        return new Client(id,name,age,height,weight,obj);
    }

    public void clients () {
        for ( int i = 0; i < listC.size();i++ ) {
            System.out.println(i+" "+listC.get(i).toString());
        }
    // 0. to string
    // 1. to string
    }
    // number of client
    public void infoClient (int i) {

        System.out.println("/////////NEW DATA/////////");
        System.out.println("write your id");
        int id = num.nextInt();
        listC.get(i).setId(id);
        System.out.println("write your name");
        String name = read.nextLine();
        listC.get(i).setName(name);
        System.out.println("write your age");
        int age = num.nextInt();
        listC.get(i).setAge(age);
        System.out.println("write your height");
        double height = dou.nextDouble();
        listC.get(i).setHeight(height);
        System.out.println("write your weight");
        int weight = num.nextInt();
        listC.get(i).setWeight(weight);
        System.out.println("write your objective");
        String obj = read.nextLine();
        listC.get(i).setObjective(obj);

        //how to send this new data to the arraylist
    }
    // number of client
    public void deleteClient (int h) {
        listC.remove(h);
    }
}
