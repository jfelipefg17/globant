import entities.Person;

import java.sql.SQLOutput;
import java.util.Scanner;

public class People {

    @Override
    public String toString() {
        return "People{}";
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person("felipe");

        System.out.println("last name:");

        Person p3 = new Person("Felipe", read.next(), 14);

        System.out.println("last name:");

        p3.setLastName(read.next());

        System.out.println(p2.name);
        System.out.println(p3.getLastName());
        System.out.println(p3.getAge());
    }
}
