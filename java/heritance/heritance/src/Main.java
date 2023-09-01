import entities.Person;
import entities.Student;

public class Main {
    public static void main(String[] args) {

        // polymorphism
        Person s1 = new Student("felipe",18,1001445250,"eleven");

        s1.printToString();

        s1.println();

        // interface
        // for classes that all methods have some to do , because in abstract classes you can have methods with some thing to do but other abstract that the children classes define what to do white that methods
        s1.ageMaxPerson();

    }
}

