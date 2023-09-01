package entities;

import utilities.Colors;
import utilities.EnergyC;

import java.util.Scanner;

public abstract class Appliance {
    protected double price = 1000;
    protected String color;
    protected String energy;
    protected double weight;

    public Appliance() {
    }

    public Appliance(double price, String color, String energy, double weight) {
        this.price = price;
        this.color = color;
        this.energy = energy;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnergyC() {
        return energy;
    }

    public void setEnergyC(String energyC) {
        this.energy = energyC;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);

    public Boolean energyCheck (String letter) {
        for (EnergyC ce : EnergyC.values()) {
            if (ce.name().equals(letter)) {
                return true;
            }
        }
        return false;
    }

    public Boolean colorCheck (String color) {
        for ( Colors ce : Colors.values()) {
            if (ce.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public double finalPrice (String energy, double weight) {
        double finalPrice;

        double num1 = 0;
        double num2 = 0;

        switch (energy) {
            case "A":
                num1 = 1000;
                break;
            case "B":
                num1 = 800;
                break;
            case "C":
                num1 = 600;
                break;
            case "D":
                num1 = 500;
                break;
            case "E":
                num1 = 300;
                break;
            case "F":
                num1 = 100;
                break;
            default:
                System.out.println("wrong letter energy");
        }

        if (weight <= 20 && weight >= 1) {
            num2 = 100;
        } else if (weight > 20 && weight <=49) {
            num2 = 500;
        } else if (weight >49 && weight <= 79) {
            num2 = 800;
        } else if (weight > 79 ) {
            num2 = 1000;
        }

        finalPrice = num1 + num2;

        return finalPrice;
    }

    public void createAppliance () {

        boolean awsColor;
        boolean awsEnergy;

        System.out.println("====================");
        System.out.println("color of the appliance");
        color = read.nextLine();
        awsColor = colorCheck(color);
        if (!awsColor) {
            color = "white";
        }
        System.out.println("====================");
        System.out.println("energy of the appliance");
        energy = read.nextLine();
        energy = energy.toUpperCase();
        awsEnergy = energyCheck(energy);
        if (!awsEnergy) {
            energy = "F";
        }
        System.out.println("====================");
        System.out.println("weight of the appliance");
        weight = num.nextDouble();
        price = finalPrice(energy,weight);

        //return new Appliance(price,color,energy,weight);
    }
}
