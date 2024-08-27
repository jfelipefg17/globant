package service;

import entities.Birthdate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ServiceBirthdate {

    Scanner read = new Scanner(System.in);

    public Birthdate createBirth (String date) {

        LocalDate birthday = LocalDate.parse(date);
        return new Birthdate(birthday);
    }


    public int age (Birthdate b1) {
        LocalDate now = LocalDate.now();
        LocalDate birth = b1.getBirth();
        Period period = Period.between(birth,now);
        return period.getYears();
    }

    public boolean leapYear (int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
