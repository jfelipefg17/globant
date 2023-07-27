import service.ServiceMovies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        ServiceMovies s1 = new ServiceMovies();
        boolean anw;


        do {
            s1.creatMovie();
            System.out.println("u want add another movie yes/not");
            String ss = num.nextLine();
            anw = ss.equals("yes");
        }while (anw);

        s1.printList();
    }
}