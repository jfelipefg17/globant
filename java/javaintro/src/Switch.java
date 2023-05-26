import java.util.Scanner;
public class Switch {
    public static void main(String [] args) {
        String motor = "";
        Scanner mt = new Scanner(System.in);

        System.out.println("ingrese la clase de motor");
        motor = mt.nextLine();

        switch (motor) {
            case "felipe" :
                System.out.println("La bomba es una bomba de agua");
                break;
            case "andres":
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case "pedro":
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case "andrea":
                System.out.println("La bomba es una bomba de alimentica");
                break;
            default:
                System.out.println("numero mayor a 4");
        }
    }

}