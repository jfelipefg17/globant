package entities;

public abstract class Animals {
    protected String name;
    protected String food;
    protected Integer age;
    protected String raza;

    public Animals(String name, String food, Integer age, String raza) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.raza = raza;
    }

    // real use with protected
    public void printFood () {

    }
}
