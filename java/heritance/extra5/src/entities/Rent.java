package entities;

import java.time.LocalDate;

public class Rent {
    private String name;
    private int id;
    private LocalDate start;
    private LocalDate finish;
    private int position;
    private Boat boat;

    public Rent() {

    }

    public Rent(String name, int id, LocalDate start, LocalDate finish, int position, Boat boat) {
        this.name = name;
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.position = position;
        this.boat = boat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getFinish() {
        return finish;
    }

    public void setFinish(LocalDate finish) {
        this.finish = finish;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

}
