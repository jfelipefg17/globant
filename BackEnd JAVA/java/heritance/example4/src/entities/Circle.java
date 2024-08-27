package entities;

import interf.FormCalculator;

public class Circle implements FormCalculator {
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public void area() {
        System.out.println("THE AREA IS: " + PI * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println("THE PERIMETER IS: " + PI * diameter);
    }
}
