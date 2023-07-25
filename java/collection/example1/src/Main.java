import service.ServicioPerro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ServicioPerro sp = new ServicioPerro();

        int i = 1;
        while(i == 1) {
            System.out.println("1. para registrar perro");
            System.out.println("2. para salir");
            i = read.nextInt();

            if (i == 2) {
                break;
            }

            sp.nuevoPerro();
        }

        sp.imprimirLista();
    }

}