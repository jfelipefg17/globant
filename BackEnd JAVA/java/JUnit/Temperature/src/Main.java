import entities.Temperature;
import service.ServiceTemperature;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Temperature t1;
        ServiceTemperature s1 = new ServiceTemperature();

        System.out.println("write temperature in fahrenheit: ");
        double far = num.nextDouble();

        t1 = new Temperature(far);

        System.out.println("in celsius is: " + s1.celsius(t1.getFar()));

        System.out.println("in kelvin is: " + s1.kelvin(t1.getFar()));
    }
}