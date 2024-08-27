import entities.Hangman;
import services.HangmanServices;

public class Main {

    public static void main(String[] args) {

        Hangman g1 = new Hangman();
        HangmanServices s1 = new HangmanServices();

        g1 = s1.creatGame();

        boolean ss1;

            ss1 = s1.game(g1);
            if (ss1){
                System.out.println("/////////////////////////");
                System.out.println("YOU WINNNNN !!!!!!!");
                System.out.println("/////////////////////////");
            }else{
                System.out.println("/////////////////////////");
                System.out.println("sorry you dont win");
                System.out.println("/////////////////////////");
            }


    }
}