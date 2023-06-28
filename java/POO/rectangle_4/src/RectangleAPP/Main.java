package RectangleAPP;

import RectangleAPP.entities.Rectangle;
import RectangleAPP.services.RectangleService;

/**
 * Create a Rectangle class that models rectangles using a private
 * base attribute and a private height attribute.
 *
 * The class will include a method for creating the rectangle
 * with the Rectangle data given by the user. It will also include
 * a method for calculating the area of the rectangle and a method
 * for calculating the perimeter of the rectangle. Finally, we will
 * have a method that will draw the rectangle using asterisks using
 * the base and height.
 *
 * The corresponding getter, setter and constructor methods must also
 * be defined.
 *
 * Surface = base * height
 *
 * Perimeter = (base + height) * 2.
 */

public class Main {
    public static void main(String[] args) {

        RectangleService rs = new RectangleService();
        Rectangle r1 = rs.createR();


        r1.setSurface(rs.surface(r1.getBase(), r1.getHeight()));
        r1.setPerimeter(rs.perimeter(r1.getBase(), r1.getHeight()));


        System.out.println(r1);

        rs.draw(r1.getBase(), r1.getHeight());




    }


}