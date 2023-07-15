import entities.Movies;
import entities.Rent;
import service.MoviesService;
import service.RentService;

import java.util.Scanner;

public class Main {
    Scanner read= new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    public static void main(String[] args) {




        Movies [] listM = new Movies[5];
        MoviesService s1 = new MoviesService();
        RentService r1 = new RentService();



        for ( int i = 0; i < 5; i++ ){
            listM [i] = s1.creatMovie();
        }

        for ( int i = 0; i < 3; i++ ) {
            r1.creatRent(listM);
        }
        s1.listMoviesAvailable(listM);
        s1.searchTittle(listM);
        s1.searchGenre(listM);

    }
}