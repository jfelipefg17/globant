package entities;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private int id;
    private Pet pet;

    public Person () {

    }

    public Person(String name, String lastName, int age, int id, Pet pet) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", pet=" + pet +
                '}';
    }
}
