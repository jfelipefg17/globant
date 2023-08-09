import entities.Course;
import entities.Students;
import entities.Teacher;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        Teacher t1 = new Teacher();
        Course c1 = new Course();

        System.out.println("||||||||||||||||||||||||");
        System.out.println("one by one association ");

        t1.setName("felipe");
        t1.setLastName("florez");

        c1.setYear(2000);
        c1.setLevel('c');
        c1.setTeacher(t1);

        System.out.println(c1);

        System.out.println("chance name teacher");
        String newName = read.nextLine();

        t1.setName(newName);

        System.out.println(c1);

        System.out.println("||||||||||||||||||||||||");
        System.out.println("one by many composition ");

        LinkedList<Students> studentsList = new LinkedList<>();

        studentsList.add(new Students("Julian Toro"));
        studentsList.add(new Students("Andrea Florez"));
        studentsList.add(new Students("Sofia perez"));

        c1.setStudentsList(studentsList);

        for ( Students entry : studentsList ) {
            System.out.println(entry.getFullName());
        }
    }

}