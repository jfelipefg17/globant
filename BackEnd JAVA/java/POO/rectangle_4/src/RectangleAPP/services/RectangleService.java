package RectangleAPP.services;

import RectangleAPP.entities.Rectangle;

import java.util.Scanner;

public class RectangleService {
    Scanner num = new Scanner(System.in);

    public Rectangle createR (){
        System.out.println("write the base of the rectangle");
        int base = num.nextInt();
        System.out.println("write the height of the rectangle");
        int height = num.nextInt();
        return new Rectangle(base,height);
    }

    public int surface(int base, int height) {
        return base * height;
    }

    public int perimeter(int base, int height) {
        return (base + height) * 2;
    }

    public void draw (int base, int height) {
    for ( int i = 0; i < height; i++ ) {
        for ( int j =0; j < base; j++ ) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    }
}
