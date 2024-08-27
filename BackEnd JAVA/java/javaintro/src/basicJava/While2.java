package basicJava;
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String word = "";
        int cont = 0;

        while (!(word.equals("exit"))) {

            System.out.println("write a word: ");
            word = read.nextLine();
            cont ++;
        }
        System.out.println("you write " + cont + " times");
    }

}
