import entities.Birthdate;
import service.ServiceBirthdate;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        Birthdate b1;
        ServiceBirthdate s1 = new ServiceBirthdate();

        System.out.println("writhe your birth date yy-mm-dd");
        String date = read.nextLine();
        b1 = s1.createBirth(date);
        int age = s1.age(b1);
        System.out.println(age);

        System.out.println("write a year");
        int year = num.nextInt();

        System.out.println("is " + s1.leapYear(year) + " the year leap Year ");
    }
}