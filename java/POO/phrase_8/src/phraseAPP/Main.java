package phraseAPP;

import phraseAPP.entities.String;
import phraseAPP.services.StringService;

import java.util.Scanner;

/**
 * 8
 * Perform a class called String that has as attributes a phrase
 * (of type of String) and its length. In the main the object will
 * be created and the user will be asked to enter a phrase that can
 * be a word or several words separated by a blank space and through
 * the methods set, the phrase and length will be saved automatically
 * according to the length of the entered phrase. You must also
 * implement the following methods:

 * a) Display method Vocales(), you must count the number of vowels
 * the entered phrase has.

 * b) InvertirFrase() method, you must reverse the entered phrase
 * and display it per screen. For example: Input: "white house",
 * Output: "acnalb asac".
 * c) Method vecesRepetido(String letter), you will receive a
 * character entered by the user and count how many times the character
 * is repeated in the phrase, for example:

 * d) Input: phrase = "white house". Output: The character 'a' is
 * repeated 4 times.

 * e) Method to compare Length(String phrase), you must compare the
 * length of the phrase that makes up the class with another new
 * phrase entered by the user.

 * f) Join Phrases(String phrase) method, you must join the phrase
 * contained in the String class with a new phrase entered by the
 * user and display the resulting phrase.

 * g) Replace method(String letter), you must replace all letters
 * "a" found in the sentence with some other character selected by
 * the user and show the resulting phrase.

 * h) Method contains(String letter), you should check if the phrase
 * contains a letter that the user enters and return true if it
 * contains it and false if not.
 * */

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        boolean bol = true;

        StringService serv = new StringService();
        String str = new String();

        System.out.println("write a new phrase");
        java.lang.String phrase = read.nextLine();
        int longP = phrase.length();

        do {
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("1. full fill coffee maker");
            System.out.println(" ");
            System.out.println("2. fill coffee maker");
            System.out.println(" ");
            System.out.println("3. empty coffee maker");
            System.out.println(" ");
            System.out.println("4. serve cup");
            System.out.println(" ");
            System.out.println("5. exit");
            int opt = num.nextInt();

            switch (opt) {
                case 1:
                        str.getLongPhrase();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
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