package basicJava.excerciseBasicJava;

import java.util.Scanner;

/**Perform a program that only allows you to enter only phrases or words 8
 *  long. If the user enters an 8-long phrase or word, a "OK" message must
 *  be printed on the screen, otherwise "WRONG" must be printed. Note:
 *  investigate the Lenght() function in Java.
 * */
public class LongWord {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean n = false;

        do {
            System.out.println("write a 8 long phrase: ");
            String phrase = read.nextLine();
            if (phrase.length() == 8 ) {
                n = true;
            }
            System.out.println("WRONG, try again");
            System.out.println("");
        }while(n == false);
        System.out.println("Ok");

    }
}
