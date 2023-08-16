package service;

import entities.Game;
import entities.Gun;
import entities.Player;

import java.util.Scanner;

public class GameService {

    Game g1;
    Gun gun1 = new Gun();
    GunService gs1 = new GunService();
    Player [] ArrayP;

    PlayerService ps1 = new PlayerService();

    public void addPlayer (int n) {

        Scanner num = new Scanner(System.in);

        ArrayP = new Player[n];

        if (n >= 1 && n < 6) {



            for ( int j = 0; j < n; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;
                ArrayP[j] = new Player(id, user, false);


            }
        } else {
            for ( int j = 0; j < 6; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;

                ArrayP[j] = new Player(id, user, false);

            }
        }

        g1 = new Game(ArrayP,gun1);

        gs1.randomPosition(gun1,g1);
        System.out.println(gun1.getActualP());
        System.out.println(gun1.getWaterP());
        System.out.println(g1.toString());
        round(g1);
    }

    public void round (Game game) {

        boolean ss;
        boolean ss2 = true;

        do {


            ss = ps1.shot(gun1, gs1, g1);

            if (ss) {

                System.out.println(" ");
                System.out.println("someone was wet");
                Player [] ArrayP = g1.getArrayP();
                Player h = ArrayP [gun1.getActualPP()];
                h.setWed(true);
                System.out.println("the user was ");
                System.out.println(h.toString());
                break;
            } else {
                System.out.println("no one was wet");
                gs1.print(gun1);
                gs1.nextShot(gun1,g1);
            }
        } while (ss2);

    }

}
