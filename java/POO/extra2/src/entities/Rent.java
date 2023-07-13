package entities;

import java.time.LocalDate;

public class Rent {

    private String tittle;
    private LocalDate DateStart;
    private LocalDate DateFinish;
    private int price;

    public Rent() {
    }

    public Rent(String tittle, LocalDate dateStart, LocalDate dateFinish, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
