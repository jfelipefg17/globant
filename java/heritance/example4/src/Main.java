import entities.Circle;
import entities.Rectangle;

import javax.jws.soap.SOAPBinding;


public class Main {

    public static void main(String[] args) {

        Circle s1 = new Circle(5,10);
        Rectangle r1 = new Rectangle(10,5 );

        System.out.println("circle");
        s1.area();
        s1.perimeter();
        System.out.println("======================");
        System.out.println("rectangle");
        r1.area();
        r1.perimeter();
    }
}