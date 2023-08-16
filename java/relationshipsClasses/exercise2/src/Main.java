
import service.GameService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameService gs1 = new GameService();

        Scanner num = new Scanner(System.in);

        System.out.println("how many player are going to play the game");
        int res = num.nextInt();

        gs1.addPlayer(res);



    }
}