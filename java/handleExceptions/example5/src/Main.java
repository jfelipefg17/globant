import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean ss = true;
        int con = 1;
        int num;

        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        int alt = rand.nextInt(500) + 1;

        do {

            try {
                System.out.println("Write a number between 1-500: ");
                System.out.println("attempt number : " + con);
                con ++;
                num = read.nextInt();

                if (num > alt){
                    System.out.println("==============");
                    System.out.println("the number is smaller than: " + num);
                    System.out.println("==============");
                }else if (num < alt){
                    System.out.println("==============");
                    System.out.println("the number is bigger than: " + num);
                    System.out.println("==============");
                } else {
                    System.out.println("==============");
                    System.out.println("YOU GOT IT , THE NUMBER WAS: " + alt);
                    System.out.println("==============");
                    ss = false;
                }
            }catch (InputMismatchException a) {
                System.out.println("you have to write numbers");
                System.out.println(a.getMessage());
                //sin esto se queda infinito , explicacion , Para solucionar este problema, puedes agregar
                // una llamada adicional al método next() para descartar el valor incorrecto después de manejar la excepción
                read.nextLine();

            }catch (Exception a){
                a.printStackTrace();
                System.out.println(a.getMessage());
                System.out.println("error, try again ");
                read.nextLine();
            }



        }while (ss);
    }
}