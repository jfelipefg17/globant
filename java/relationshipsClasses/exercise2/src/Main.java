import entities.Game;
import entities.Gun;
import entities.Player;
import service.GameService;
import service.GunService;
import service.PlayerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PlayerService ps1 = new PlayerService();
        Game g1 = new Game();
        GameService gs1 = new GameService();

        Scanner num = new Scanner(System.in);

        System.out.println("how many player are going to play the game");
        int res = num.nextInt();



    }
}