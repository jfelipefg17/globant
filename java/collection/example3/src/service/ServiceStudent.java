package service;

import entities.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceStudent {

    ArrayList<Student> listS = new ArrayList<>();
    private final Scanner read = new Scanner(System.in);
    private final Scanner num = new Scanner(System.in);

    public void creatStudent () {

        double[] array = new double [3];

        System.out.println("write the name of the student");
        String name = read.nextLine();

        for ( int i = 0; i < 3; i ++ ) {
            System.out.println("write grade");
            array [i] = num.nextDouble();
        }

        listS.add(new Student(name,array));
    }

    public void finalGrade () {
        System.out.println("write the name of the student you want to see");
        String n = read.nextLine();
        double sum = 0;
        for ( Student var : listS) {
            if (n.equals(var.getName())) {
                double [] array = var.getGrades();
                for ( int j = 0; j < listS.size(); j ++ ) {
                    sum += array[j];
                }
                break;
            }

        }
        if (sum > 0) {
            System.out.println("your final grade = " + (sum / 3 ));
        }else {
            System.out.println("the name is not on the list");
        }



    }
}
