import entities.Animals;
import entities.Cat;
import entities.Dog;
import entities.Horse;

public class Main {
    public static void main(String[] args) {

        // Animals for polymorphism
        Animals dog1 = new Dog("copper","dogfood",10,"boston");
        dog1.printFood();

        Animals dog2 = new Dog("natacha","dogfood",9,"cocker");
        dog2.printFood();


        Animals cat1 = new Cat("susi","catfood",8,"persian");
        cat1.printFood();

        Animals horse1= new Horse("chepe","horsefood",13,"mustang");
        horse1.printFood();
    }
}