package entities;

public class Motorboat extends Boat{
    protected int powerHP;


    public Motorboat(String enrolled, int length, int year, int powerHP) {
        super(enrolled, length, year);
        this.powerHP = powerHP;
    }

    public int getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(int powerHP) {
        this.powerHP = powerHP;
    }

    @Override
    public String toString() {
        return "Motorboat{" +
                "powerHP=" + powerHP +
                ", enrolled='" + enrolled + '\'' +
                ", length=" + length +
                ", year=" + year +
                '}';
    }
}
