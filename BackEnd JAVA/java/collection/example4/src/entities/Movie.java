package entities;

import java.time.LocalTime;

public class Movie {
    private String tittle;
    private String director;
    private LocalTime duration;

    public Movie (){

    }

    public Movie(String tittle, String director, LocalTime duration) {
        this.tittle = tittle;
        this.director = director;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tittle='" + tittle + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                '}';
    }
}
