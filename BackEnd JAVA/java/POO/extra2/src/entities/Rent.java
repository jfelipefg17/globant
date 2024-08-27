package entities;

import java.time.LocalDate;

public class Rent {

    private String tittle;
    private LocalDate DateStart;
    private LocalDate DateFinish;
    private double price;

    public Rent() {
    }

    public Rent(String tittle, LocalDate dateStart, LocalDate dateFinish, double price) {
        this.tittle = tittle;
        DateStart = dateStart;
        DateFinish = dateFinish;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public LocalDate getDateStart() {
        return DateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        DateStart = dateStart;
    }

    public LocalDate getDateFinish() {
        return DateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        DateFinish = dateFinish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "tittle='" + tittle + '\'' +
                ", DateStart=" + DateStart +
                ", DateFinish=" + DateFinish +
                ", price=" + price +
                '}';
    }
}
