import entities.Movies;
import entities.Rent;
import service.MoviesService;
import service.RentService;


public class Main {
    public static void main(String[] args) {

        Movies[] listM = new Movies[5];
        MoviesService s1 = new MoviesService();
        Rent[] listR = new Rent[3];
        RentService r1 = new RentService();


        for ( int i = 0; i < listM.length; i++ ) {
            listM[i] = s1.creatMovie();
        }

        s1.listMoviesAvailable(listM,listR);



        boolean asw1 = s1.searchTittle(listM);
        if(asw1) {
            System.out.println("==============================");
            System.out.println("we have the movie");
        } else {
            System.out.println("==============================");
            System.out.println("we dont have the movie");
        }

        boolean asw2 = s1.searchGenre(listM);
        if(asw2) {
            System.out.println("==============================");
            System.out.println("we have the movie");
        } else {
            System.out.println("==============================");
            System.out.println("we dont have the movie");

        }
        r1.listMoviesRent(listR);

    }
}