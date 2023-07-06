package phraseAPP;

import phraseAPP.entities.Phrase;
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
        Phrase str = new Phrase();

        System.out.println("write a new phrase");
        String phr = read.nextLine();
        str.setPhrase(phr);
        int longP = phr.length();
        str.setLongPhrase(longP);

        do {
            System.out.println("MENU");
            System.out.println(" ");
            System.out.println("1. shows vowels");
            System.out.println(" ");
            System.out.println("2. invert phrase");
            System.out.println(" ");
            System.out.println("3. empty letters repeats");
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
                    System.out.println("the phrase has vawels" + serv.vowels(phr, longP));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("the invert phrase is " + serv.invertPhrase(phr, longP));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("the letter is in the phrase " + serv.lettersRep( phr, longP));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("is " + serv.compareLong(longP) + " that the phrase 1 is longer than phrase 2");
                    System.out.println("-----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("the new phrase is " + serv.joinPhrase(phr));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("the new phrase is  " + serv.replaceA(phr, longP));
                    System.out.println("-----------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("is" + serv.letterInPhrase(phr) );
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