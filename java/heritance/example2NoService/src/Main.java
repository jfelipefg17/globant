import entities.WashingMachine;

public class Main {

    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine();

        w1.createWashingMachine();
        w1.finalPrice(w1);

        System.out.println(w1.toString());

    }
}