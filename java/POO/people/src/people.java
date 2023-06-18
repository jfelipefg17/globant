import entities.Person;
import services.ServicePerson;

import java.util.Scanner;

public class People {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person("felipe");

        System.out.println("last name:");

        Person p3 = new Person("Felipe", read.next(), 14);

        System.out.println("last name:");

        p3.setLastName(read.next());


        System.out.println(p3.getLastName());
        System.out.println(p3.getAge());

        ServicePerson p = new ServicePerson();
        p.createPerson();

    }
}
