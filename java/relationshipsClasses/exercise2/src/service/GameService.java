package service;

import entities.Game;
import entities.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GameService {

    Game g1 = new Game();

    public void addPlayer (int n) {

        Scanner num = new Scanner(System.in);

        if (n >= 1 && n <= 6) {
            for ( int j = 0; j <= n; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;

                ArrayList<Player> list = g1.getPlayerList();

                list.add(new Player(id, user, false));
            }
        } else {
            for ( int j = 0; j <= 6; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;

                ArrayList<Player> list = g1.getPlayerList();

                list.add(new Player(id, user, false));

            }
        }
    }

    public void round (Game game) {



    }
    
}
