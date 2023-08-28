package entities;

public class Dog extends Animals{
    public Dog(String name, String food, Integer age, String raza) {
        super(name, food, age, raza);
    }

    @Override
    public void printFood() {
        super.printFood();
        System.out.println(food);
    }
}
