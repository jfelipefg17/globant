package entities;

import java.util.Scanner;

public abstract class Boat {
    protected String enrolled;
    protected int length;
    protected int year;

    public Boat () {

    }


    public Boat(String enrolled, int length, int year) {
        this.enrolled = enrolled;
        this.length = length;
        this.year = year;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(String enrolled) {
        this.enrolled = enrolled;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Scanner num = new Scanner(System.in);
    Scanner read = new Scanner(System.in);

    public void creatBoat () {
        System.out.println("================");
        System.out.println("enrolled");
        enrolled = read.nextLine();
        System.out.println("================");
        System.out.println("length in mt");
        length = num.nextInt();
        System.out.println("================");
        System.out.println("year");
        year = num.nextInt();
        System.out.println("================");

    }
}
