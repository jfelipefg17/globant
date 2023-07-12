package birthDateAPP.service;

import birthDateAPP.entities.Person;

import java.time.LocalDate;

import java.time.Period;
import java.util.Scanner;

public class PersonService {

        Scanner read = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

    public Person creatPerson () {

        System.out.println("write your name: ");
        String name = read.nextLine();

        System.out.println("write your birth day: ");
        int day = num.nextInt();
        System.out.println("write your birth month: ");
        int month = num.nextInt();
        System.out.println("write your birth year: ");
        int year = num.nextInt();

        LocalDate birth =   LocalDate.of(year,month,day);

        System.out.println( birth.getDayOfMonth() + "/" + birth.getMonth() + "/" + birth.getYear());


        return new Person(name,birth);
    }

    public int calculateDate (Person p1){

        LocalDate today = LocalDate.now();
        Period age2 = Period.between(p1.getBirth(),today);
        int age = age2.getYears();

        return age;
    }

    public boolean littleThan (int age) {
        System.out.println("write an age");
        int age2 = num.nextInt();

        if (age > age2){
            return true;
        }else {
            return false;
        }

    }
    public void showingPerson(Person p1) {


        System.out.println("------");
        System.out.println("------");
        System.out.println(p1.getName());
        System.out.println("------");
        System.out.println("------");
        System.out.println(p1.getBirth());
        System.out.println("------");
        System.out.println("------");
        System.out.println(p1.getAge());


        //toString use ?
    }
}
