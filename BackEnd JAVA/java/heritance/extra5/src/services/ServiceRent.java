package services;

import entities.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServiceRent extends Boat {

    Scanner num = new Scanner(System.in);
    Scanner read = new Scanner(System.in);

    Rent [] rents = new Rent[10];


    public void createRent () {
        Rent a = new Rent("felipe",1001445250,LocalDate.of(2000,10,20),LocalDate.of(2000,10,20),0,new Motorboat(super.enrolled,super.length,super.year,200));
        Rent b = new Rent("felipe",1001445250,LocalDate.of(2000,10,20),LocalDate.of(2000,10,20),1,new Sailboat(super.enrolled,super.length,super.year,2));
        Rent c = new Rent("felipe",1001445250,LocalDate.of(2000,10,20),LocalDate.of(2000,10,20),2,new Yacht(super.enrolled,super.length,super.year,1800,6));
        Rent d = new Rent("felipe",1001445250,LocalDate.of(2000,10,20),LocalDate.of(2000,10,20),3,new Regular (super.enrolled,super.length,super.year));

        rents[0] = a;
        rents[1] = b;
        rents[2] = c;
        rents[3] = d;
        LocalDate dateStart;
        LocalDate dateFinish;
        int position = 0;


        System.out.println("================");
        System.out.println("name");
        String name = read.nextLine();
        System.out.println("================");
        System.out.println("id");
        int id = num.nextInt();
        System.out.println("================");
        System.out.println("write start date in this order (year-month-day)");
        System.out.println("                                 (0000-00-00)");
        dateStart = LocalDate.parse(read.nextLine());
        System.out.println("================");
        System.out.println("write finish date in this order (year-month-day)");
        System.out.println("                                 (0000-00-00)");
        dateFinish = LocalDate.parse(read.nextLine());
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] == null) {
                break;
            } else {
                position ++;
            }
        }
        System.out.println("================");
        System.out.println("position of the boat: " + position);
        System.out.println("================");
        System.out.println("what type of boat you have ?");
        System.out.println("1. MotorBoat");
        System.out.println("2. SailBoat");
        System.out.println("3. Yacht");
        System.out.println("4. other");
        System.out.println("answer in number: ");
        int boat = num.nextInt();

        switch (boat){
            case 1:
                super.creatBoat();

                System.out.println("==============");
                System.out.println("horse power");
                int hp = num.nextInt();

                Rent s1 = new Rent(name,id,dateStart,dateFinish,position,new Motorboat(super.enrolled,super.length,super.year,hp));

                rents[position] = s1;

                priceRent(s1);
                break;
            case 2:
                super.creatBoat();

                System.out.println("==============");
                System.out.println("number of chew: ");
                int chew = num.nextInt();
                System.out.println("==============");
                System.out.println();

                Rent s2 = new Rent(name,id,dateStart,dateFinish,position,new Sailboat(super.enrolled,super.length,super.year,chew));

                rents[position] = s2;

                priceRent(s2);
                break;
            case 3:
                super.creatBoat();

                System.out.println("==============");
                System.out.println("horse power");
                int hpw = num.nextInt();
                System.out.println("==============");
                System.out.println("number of cabins");
                int cabins = num.nextInt();

                Rent s3 = new Rent(name,id,dateStart,dateFinish,position,new Yacht(super.enrolled,super.length,super.year,hpw,cabins));

                rents[position] = s3;

                priceRent(s3);
                break;
            case 4 :
                super.creatBoat();
                Rent s4 = new Rent(name,id,dateStart,dateFinish,position,new Regular (super.enrolled,super.length,super.year));

                rents[position] = s4;
                priceRent(s4);

                break;
            default:

                System.out.println("you write wrong answer");
        }

    }


    public void priceRent (Rent r) {

        Boat b1 = r.getBoat();

        if(b1 instanceof Motorboat) {
            int mod = b1.getLength() * 10;
            mod = mod + ((Motorboat) b1).getPowerHP();
            int days = (int) ChronoUnit.DAYS.between(r.getStart(), r.getFinish());
            int result = mod + days;
            System.out.println("==============================");
            System.out.println("your rent price is: " + result);
            System.out.println("==============================");


        } else if (b1 instanceof  Sailboat) {
            int mod = b1.getLength() * 10;
            mod = mod + ((Sailboat) b1).getChews();
            int days = (int) ChronoUnit.DAYS.between(r.getStart(), r.getFinish());
            int result = mod + days;
            System.out.println("==============================");
            System.out.println("your rent price is: " + result);
            System.out.println("==============================");

        } else if (b1 instanceof Yacht){
            int mod = b1.getLength() * 10;
            mod = mod + ((Yacht) b1).getPowerHP() + ((Yacht) b1).getCabins();
            int days = (int) ChronoUnit.DAYS.between(r.getStart(), r.getFinish());
            int result = mod + days;
            System.out.println("==============================");
            System.out.println("your rent price is: " + result);
            System.out.println("==============================");

        } else {
            int mod = b1.getLength() * 10;
            int days = (int) ChronoUnit.DAYS.between(r.getStart(), r.getFinish());
            int result = mod + days;
            System.out.println("==============================");
            System.out.println("your rent price is: " + result);
            System.out.println("==============================");

        }
    }
    public void printRents () {
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println("position" + i + ": " + rents[i].toString());
            } else {
                break;
            }
        }
    }
}
