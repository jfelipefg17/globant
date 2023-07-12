import java.time.LocalTime;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);


        boolean bol = true;
        

        do {
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("1. shows vowels");
            System.out.println(" ");
            System.out.println("2. invert phrase");
            System.out.println(" ");
            System.out.println("3. letters repeats");
            System.out.println(" ");
            System.out.println("4. compare length");
            System.out.println(" ");
            System.out.println("5. unify phrase");
            System.out.println(" ");
            System.out.println("6. replace a in the phrase for any character you want");
            System.out.println(" ");
            System.out.println("7. check a letter in the phrase");
            System.out.println(" ");
            System.out.println("8. exit");
            int opt = num.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 8:
                    bol = false;
                    break;
                default:
                    System.out.println("you type a rong number");
                    System.out.println("do it again");
                    System.out.println(" ");
            }
        }while(bol);
    }
}