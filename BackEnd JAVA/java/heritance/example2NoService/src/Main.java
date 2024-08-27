import entities.Appliance;
import entities.Tv;
import entities.WashingMachine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        WashingMachine w1 = new WashingMachine(1000,"red","A",40,20);
        WashingMachine w2 = new WashingMachine(1000,"blue","C",59,70);
        Tv tv1 = new Tv(1000,"blue","D",30,27,true);
        Tv tv2 = new Tv(1000,"grey","D",81,67,false);

        ArrayList<Appliance> appliances = new ArrayList<>();

        appliances.add(w1);
        appliances.add(w2);
        appliances.add(tv1);
        appliances.add(tv2);

        int j = 0;
        for ( Appliance aux : appliances ) {
            j ++;
            System.out.println( "Appliance " + j + ": " + aux.getPrice() );
            aux.finalPrice(aux);
        }

        double totalAdd = 0;
        int i = 0;
        for ( Appliance aux : appliances ) {
            i ++;
            System.out.println( "Appliance " + i + ": " + aux.getPrice() );
            totalAdd = totalAdd + aux.getPrice();
        }

        System.out.println("===================");
        System.out.println("TOTAL ADD: " + totalAdd);
        System.out.println("===================");


    }
}