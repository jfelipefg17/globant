package birthDateAPP;

import birthDateAPP.entities.Person;
import birthDateAPP.service.PersonService;

/***
 *Implement the Person class. A person has a name and a date of birth
 *  (Type Date), empty constructor, parameterized constructor, get
 *  and set. And the following methods:
 *
 * Add an object creation method that respects the following signature:
 * crearPersona(). This method fills the object using a scanner and
 * asks the user the name and date of birth of the person to create,
 * remember that the birth date must be saved in a Date and saved
 * in the object.
 *
 * Write a method to calculate Age() from the date of birth entered.
 * Keep in mind that to know the age of the person must also know
 * the current date.
 *
 * Add to the class the method menorQue(int age) that receives as
 * parameter another age and returns true in case the recipient is
 * younger than the person received as parameter, or false if not.
 *
 * Method Showing Person(): This method shows the person created in
 * the previous method.
 */

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        PersonService s1 = new PersonService();

        s1 .creatPerson();
        p1.setAge(s1.calculateDate(p1.getBirth()));

        System.out.println("it is " + s1.littleThan(p1.getAge())+" you are mayor");

        s1.showingPerson(p1);

    }
}