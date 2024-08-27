import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);


        System.out.println("enter a number");
        String n1 = num.nextLine();
        System.out.println("enter a number ");
        String n2 = num.nextLine();



        try {
            int n3 = parseInt(n1);
            int n4 = parseInt(n2);
            int div = n3 / n4;
            System.out.println("the division is: " + div);
        }catch (NumberFormatException a) {
            // this is for see all de collapsed mistakes a.printStackTrace();
            System.out.println("the string cant be converted to a int ");
            System.out.println(a.getMessage());
        }catch (Exception a) {
            a.printStackTrace();
            System.out.println(a.getMessage());
        }
    }
}