package soccerapp.services;
import soccerapp.entities.Player;
import java.util.Scanner;
public class ServicePlayer {

    Scanner read = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    public Player createPlayer() {

        System.out.println("name");
        String name = read.nextLine();
        System.out.println("position you play");
        String posit = read.nextLine();
        System.out.println("number of goals you make lsat season");
        int goals = num.nextInt();

        return new Player(name, posit, goals);
    }
}