package entities;

import java.util.Scanner;

public class WashingMachine extends Appliance{
    private double load;

    public WashingMachine () {

    }

    public WashingMachine (double price, String color, String energyC, double weight, double load) {
        super(price, color, energyC, weight);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    private final Scanner read = new Scanner(System.in);

    public void createWashingMachine () {
        super.createAppliance();
        System.out.println("write the load ");
        load = read.nextDouble();

        new WashingMachine(super.price,super.color,super.energy,super.weight,load);
    }


    @Override
    public void finalPrice(WashingMachine w1) {
        super.finalPrice(w1);
        if (w1.load > 30) {
            w1.price = w1.getPrice() + 500;
        }
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load=" + load +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", energy='" + energy + '\'' +
                ", weight=" + weight + " kg" +
                '}';
    }
}
