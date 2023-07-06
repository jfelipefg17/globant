package mathClassAPP;

import mathClassAPP.entities.MathX;
import mathClassAPP.service.MathXService;

import java.util.Random;

import static java.lang.Math.random;

/**
 * Perform a class called Mathematics that has as attributes two real
 * numbers with which different mathematical operations will be performed.
 * The class must have an empty, parameterized constructor and get and
 * set. In the main the object will be created and the Math.random will
 * be used to generate the two numbers and saved in the object with its
 * respective set. You must also implement the following methods:
 *
 * a) Return method Mayor() to return which of the two attributes has
 * the highest value
 *
 * b) Calculation method Power() to calculate the power of the highest
 * value of the class raised to the lowest number. Both values must
 * be rounded beforehand.
 *
 * c) Calculate method(), to calculate the square root of the lower
 * of the two values. Before calculating the square root one must
 * obtain the absolute value of the number.
 * */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        MathXService ms = new MathXService();
        MathX m1 = new MathX();

        m1.setNum1(random.nextInt(100));
        System.out.println(m1.getNum1());
        m1.setNum2(random.nextInt(100));
        System.out.println(m1.getNum2());

        System.out.println("the mayor number is " + ms.mayor(m1.getNum1(), m1.getNum2()));
        System.out.println("-----------------------------------------------------------");
        System.out.println("the mayor power the little is "+ ms.power(m1.getNum1(), m1.getNum2()));
        System.out.println("-----------------------------------------------------------");
        System.out.println("the square of little number is " + ms.square(m1.getNum1(), m1.getNum2()));
    }
}