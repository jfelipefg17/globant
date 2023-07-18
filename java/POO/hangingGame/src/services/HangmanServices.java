package services;

import entities.Hangman;

import java.util.Scanner;

public class HangmanServices {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    
    public Hangman creatGame () {

        System.out.println("write the word");
        String word = read.nextLine();
        int n = word.length();

        String [] array = new String[n];

        for ( int i = 0 ; i < array.length; i ++ ) {
            array[i] = word.substring(i,i+1);
        }

        System.out.println("----------------");
        System.out.println("max trys");
        int max = num.nextInt();

        return new Hangman(array,n,max);
    }

    public void longWord (int longW) {
        System.out.println("the long of the word is :" + longW);
    }

    public boolean search (String letter,Hangman word) {

            boolean ss = true;
            String [] array = word.getWord();
            for ( int i = 0; i < word.getLongW(); i++ ) {
                if (letter.equals(array[i])) {
                    ss = true;
                    break;
                }else {
                    ss = false;
                }
            }
            return ss;
        }



    public boolean game (Hangman word) {

        boolean asw = false;
        int fe = word.getLongW();
        int fo = 0;
        int trys = word.getMax();

        do {

            System.out.println("-------------------");
            System.out.println("write a letter");
            String letter = read.nextLine();
            System.out.println("-------------------");
            System.out.println(letter);
            System.out.println("-------------------");
            longWord(word.getLongW());
            System.out.println("-------------------");
            boolean ss = search(letter, word);
            if (ss) {
                System.out.println("the letter IS in the word");
                System.out.println("---------------------");
                fo++;
                fe--;
                System.out.println("number of letter(founded / to found) are: (" + fo + " / " + fe + ")");
                System.out.println("---------------------");
                System.out.println("you have " + trys +" trys");
            }else {
                System.out.println("the letter IS NOT in the word");
                System.out.println("---------------------");
                System.out.println("number of letter(founded / to found) are: (" + fo + " / " + fe + ")");
                System.out.println("---------------------");
                trys = trys -1;
                System.out.println("you have " + trys +" trys");

            }

            if(fo == word.getLongW() ) {
                asw = true;
                break;
            }
            System.out.println(" ");

        }while(trys != 0);
        return asw;
    }

}
