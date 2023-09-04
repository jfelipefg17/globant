package entities;

import java.util.Scanner;

public class Tv extends Appliance{
    protected int resolution;
    protected boolean tdt;

    public Tv() {
    }

    public Tv(double price, String color, String energy, double weight, int resolution, boolean tdt) {
        super(price, color, energy, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    public boolean isTdt() {
        return tdt;
    }
    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    private final Scanner num = new Scanner(System.in);
    private final Scanner bol = new Scanner(System.in);

    public void createTv () {
        super.createAppliance();
        System.out.println("==============");
        System.out.println("write resolution");
        resolution = num.nextInt();
        System.out.println("have tdt (true/false)");
        tdt = bol.nextBoolean();

        new Tv (super.price, super.color, super.energy, super.weight, resolution, tdt);
    }

    @Override
    public void finalPrice(Appliance tv1) {
        super.finalPrice(tv1);

        if (resolution > 40) {
            tv1.price = tv1.getPrice() * 1.3;
        }
        if (tdt) {
            tv1.price = tv1.price + 500;
        }
    }

    @Override
    public String toString() {
        return "Tv{" +
                "resolution=" + resolution +
                ", tdt=" + tdt +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", energy='" + energy + '\'' +
                ", weight=" + weight + "kg" +
                '}';
    }
}


