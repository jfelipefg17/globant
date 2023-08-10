package entities;

public class Dog <T>{

    private String name;
    private T race;
    private T owner;

    public Dog(String name, T race) {
        this.name = name;
        this.race = race;

    }

    public Dog(String name, T race, T owner) {
        this.name = name;
        this.race = race;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getRace() {
        return race;
    }

    public void setRace(T race) {
        this.race = race;
    }

    public T getOwner() {
        return owner;
    }

    public void setOwner(T owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", owner=" + owner +
                '}';
    }
}
