package storeAPP.entities;

import java.util.Arrays;

public class Movil {

    private String brand;
    private int price;
    private String model;
    private int ram;
    private int memory;
    private int [] id;

    public  Movil() {

    }

    public Movil(String brand, int price, String model, int ram, int memory, int[] id) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
        this.id = id;
    }

    public String getBrand (){
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "brand= '" + brand + '\'' +
                ", price= " + price +
                ", model= '" + model + '\'' +
                ", ram= " + ram + "g" +
                ", memory= " + memory + "t" +
                ", id= " + Arrays.toString(id) +
                '}';
    }
}
