package entities;

public class Yacht extends Boat{
    protected int powerHP;
    protected int cabins;

    public Yacht(String enrolled, int length, int year, int powerHP) {
        super(enrolled, length, year);
        this.powerHP = powerHP;
    }

    public int getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(int powerHP) {
        this.powerHP = powerHP;
    }

    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "powerHP=" + powerHP +
                ", cabins=" + cabins +
                ", enrolled='" + enrolled + '\'' +
                ", length=" + length +
                ", year=" + year +
                '}';
    }
}
