package services;

import java.util.Scanner;
import entities.Person;


public class ServicePerson {

    private Scanner na = new Scanner(System.in);
    Person p4 = new Person();

    public void createPerson() {
        System.out.println("write name");
        p4.setName(na.next());
        System.out.println(p4.getName());
    }
}
