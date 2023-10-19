package market.entities;

public class Product {

    private int id;
    private String name;
    private double price;
    private int idManuf;

    public Product () {
    }

    public Product(int id, String name, double price, int idManuf) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.idManuf = idManuf;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdManuf() {
        return idManuf;
    }

    public void setIdManuf(int idManuf) {
        this.idManuf = idManuf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", idManuf=" + idManuf +
                '}';
    }
}
