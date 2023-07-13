import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        boolean bol = true;

        do {
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("1. create a movie");
            System.out.println(" ");
            System.out.println("2. rent");
            System.out.println(" ");
            System.out.println("3. list available movies");
            System.out.println(" ");
            System.out.println("4. search movie by tittle ");
            System.out.println(" ");
            System.out.println("5. search movie by genre ");
            System.out.println(" ");
            System.out.println("6. search movie by rent date ");
            System.out.println(" ");
            System.out.println("7. price of my rent ");
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