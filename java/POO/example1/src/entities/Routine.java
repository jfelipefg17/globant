package entities;

import java.time.LocalTime;

public class Routine {
    private int id;
    private String name;
    private LocalTime time;
    private int difficult;
    private String description;

    public Routine () {

    }

    public Routine(int id, String name, LocalTime time, int difficult, String description) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.difficult = difficult;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Routine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", difficult=" + difficult +
                ", description='" + description + '\'' +
                '}';
    }
}
