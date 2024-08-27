package basicJava.excerciseBasicJava;
import java.util.Scanner;

/**
 * Write a program that asks for a phrase and shows it all in upper case and
 * then all in lower case. Note: investigate the toUpperCase() and
 * toLowerCase() function in Java.
 */
public class CaseUpperLower {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("write a phrase: ");
        String phrase = read.nextLine();

        String result = upper(phrase);
        System.out.println(result);
        lower(result);
    }

    public static String upper(String phrase) {
        String newphrase = phrase.toUpperCase();
        return newphrase;
    }

    public static void lower(String newphrase) {
        String phrase = newphrase.toLowerCase();
        System.out.println(phrase);
    }
}
