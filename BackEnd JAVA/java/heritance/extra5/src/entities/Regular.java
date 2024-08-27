package entities;

public class Regular extends Boat{

    public Regular() {
    }

    public Regular(String enrolled, int length, int year) {
        super(enrolled, length, year);
    }

    @Override
    public String toString() {
        return "Regular{" +
                "enrolled='" + enrolled + '\'' +
                ", length=" + length +
                ", year=" + year +
                ", num=" + num +
                ", read=" + read +
                '}';
    }
}
