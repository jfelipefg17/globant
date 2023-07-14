import entities.Movies;
import service.MoviesService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        boolean bol = true;

        Movies [] listM = new Movies[5];
        MoviesService s1 = new MoviesService();


        for ( int i = 0; i < 5; i++ ){
            System.out.println("---------------------");
            System.out.println("add movie a movie");
            System.out.println(" ");
            listM [i] = s1.creatMovie();
        }

        do {
            System.out.println("-------------------------------- ");
            System.out.println("1. rent");
            System.out.println("-------------------------------- ");
            System.out.println("2. list available movies");
            System.out.println("-------------------------------- ");
            System.out.println("3. search movie by tittle ");
            System.out.println("-------------------------------- ");
            System.out.println("4. search movie by genre ");
            System.out.println("-------------------------------- ");
            System.out.println("5. search movie by rent date ");
            System.out.println("-------------------------------- ");
            System.out.println("6. price of my rent ");
            System.out.println("-------------------------------- ");
            System.out.println("7. exit");
            int opt = num.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------");
                    s1.listMoviesAvailable(listM);
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