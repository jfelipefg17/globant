package birthDateAPP.service;

import birthDateAPP.entities.Person;

import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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


        // how to write the date
        Date birth = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(birth);
        cal.set(year,month,day);

        System.out.println(" / " + cal.get(Calendar.DATE) + " / " + cal.get(Calendar.MONTH) + " / " + cal.get(Calendar.YEAR) + " / " );

        return new Person(name,birth);
    }

    public int calculateDate (Date birth){

        Date actualDate = new Date();
        Calendar cal2 = new GregorianCalendar();
        cal2.setTime(actualDate);

        //Period age = Period.between(birth,actualDate);
        System.out.println(" / " + cal2.get(Calendar.DATE) + " / " + cal2.get(Calendar.MONTH) + " / " + cal2.get(Calendar.YEAR) + " / " );


        int age = 0;
        return age;
    }

    public boolean littleThan (int age) {
        System.out.println("writhe an age");
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
