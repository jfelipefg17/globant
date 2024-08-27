import entities.Person;
import entities.Pet;

public class Main {
    public static void main(String[] args) {
        Pet p1 = new Pet("copper","boston",8,50);
        Pet p2= new Pet("ramona","cocker",6,55);
        Person per1 = new Person("felipe","florez",19,1001445250,p1);
        Person per2 = new Person("julio","florez",48,15437946,p2);

        System.out.println(per1);
        System.out.println(per2);
    }
}