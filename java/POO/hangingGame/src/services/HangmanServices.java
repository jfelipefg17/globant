package services;

import entities.Hangman;

import java.util.Scanner;

public class HangmanServices {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    public Hangman creatGame () {
        System.out.println("write the word");
        String word = read.nextLine();
        System.out.println("----------------");
        System.out.println("max trys");
        int max = num.nextInt();
    }

    public void longWord () {

    }

    public boolean search (Hangman word) {
        //ricibe the objet
    }

    public boolean found (String l) {

    }

    public void trys (Hangman word) {

    }

    public void game () {

    }
}
