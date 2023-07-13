package entities;

import java.time.LocalTime;

public class Movies {
    private String tittle;
    private String genre;
    private int year;
    private LocalTime duration;
    private boolean available;

    public Movies () {

    }

    public Movies(String tittle, String genre, int year, LocalTime duration, boolean available) {
        this.tittle = tittle;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.available = available;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
