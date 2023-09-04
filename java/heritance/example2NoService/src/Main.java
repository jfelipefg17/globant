import entities.Tv;
import entities.WashingMachine;

public class Main {

    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine();
        Tv tv1 = new Tv();

        w1.createWashingMachine();
        w1.finalPrice(w1);

        tv1.createTv();
        tv1.finalPrice(tv1);

        System.out.println(w1.toString());
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println(tv1.toString());

    }
}