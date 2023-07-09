package birthDateAPP.service;

import birthDateAPP.entities.Person;

import java.util.Date;
import java.util.Scanner;

public class PersonService {

        Scanner read = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

    public Person creatPerson () {

        System.out.println("write your name: ");
        String name = read.nextLine();

        System.out.println("write your birth date: ");
        // how to write the date
        Date birth = null;

        return new Person(name,birth);
    }

    public int calculateDate (Date birth){
        int age = 0;
        return age;
    }

    public boolean littleThan (int age) {
        System.out.println("writhe another date");
        int age2 = num.nextInt();

        if (age > age2){
            return true;
        }else {
            return false;
        }

    }
    public void showingPerson(Person p1) {
        //toString use ?
    }
}
