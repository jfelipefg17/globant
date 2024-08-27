package entities;

public class Sailboat extends Boat{
    protected int chews;

    public Sailboat(String enrolled, int length, int year, int chews) {
        super(enrolled, length, year);
        this.chews = chews;
    }

    public int getChews() {
        return chews;
    }

    public void setChews(int chews) {
        this.chews = chews;
    }

    @Override
    public String toString() {
        return "Sailboat{" +
                "chews=" + chews +
                ", enrolled='" + enrolled + '\'' +
                ", length=" + length +
                ", year=" + year +
                '}';
    }
}
