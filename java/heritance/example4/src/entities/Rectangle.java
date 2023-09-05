package entities;

import interf.FormCalculator;

import javax.jws.soap.SOAPBinding;

public class Rectangle implements FormCalculator {
    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }


    @Override
    public void area() {
        System.out.println("THE AREA IS: " + base * height);
    }

    @Override
    public void perimeter() {
        System.out.println("THE PERIMETER IS: " + (base + height) * 2);
    }
}
