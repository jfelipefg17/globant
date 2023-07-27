import service.ServiceStudent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        ServiceStudent s1 = new ServiceStudent();
        boolean anw;


        do {
            s1.creatStudent();
            System.out.println("u want add another student yes/not");
            String ss = num.nextLine();
            anw = ss.equals("yes");
        }while (anw);


        do {
            s1.finalGrade();
            System.out.println("u want see another student yes/not");
            String ss = num.nextLine();
            anw = ss.equals("yes");
        }while (anw);

    }
}