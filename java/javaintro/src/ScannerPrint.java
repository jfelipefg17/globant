import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);

        int edad = 18;
        String nombre = "felipe";

        System.out.println(nombre + " cuando pasa de " + edad);
        String mes = leer.nextLine();
        System.out.println(nombre + mes + edad);

        }
    }