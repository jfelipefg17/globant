package service;

import entities.Game;
import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class GameService {

    Game g1 = new Game();

    public void addPlayer (int n) {

        Scanner num = new Scanner(System.in);

        if (n >= 1 && n <= 6) {
            for ( int j = 1; j <= n; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;

                ArrayList<Player> list = g1.getPlayerList();

                list.add(new Player(id, user, false));
            }
        } else {
            for ( int j = 1; j <= 6; j++ ) {
                System.out.println("write your id");
                int id = num.nextInt();
                String h = String.valueOf(id);
                String user = "user" + h;

                ArrayList<Player> list = g1.getPlayerList();

                list.add(new Player(id, user, false));

            }
        }

        round(g1);
    }

    public void round (Game game) {

//        cada ronda consiste en un jugador que se apunta con el revolver de agua y
//        aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//        moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//        mojar. Al final del juego, se debe mostrar que jugador se mojó.
//        Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
        

    }

}
