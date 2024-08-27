package soccerapp;
import soccerapp.entities.Player;
import soccerapp.services.ServicePlayer;
import java.util.Scanner;
public class SoccerAPP {

    Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        ServicePlayer pl = new ServicePlayer();

        Player p1 = pl.createPlayer();

        System.out.println(p1f);

    }
}