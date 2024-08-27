import entities.Dog;
import enumeration.Family;
import enumeration.RaceType;


public class Main {

    public static void main(String[] args) {

        // constant list
        for ( RaceType aux : RaceType.values() ) {
            System.out.println(aux.ordinal() + " " + aux);
        }

        String nn = "BOSTON";

        for ( RaceType aux : RaceType.values()) {
            if (aux.toString().equals(nn)) {
                System.out.println("the race " + nn + " is on the list");
            }

        }

        // another way to add attributes to a constant in an enum
        System.out.println(Family.MAMA.getName());


        // generics


        Dog<RaceType> d1 = new Dog<>("ramona",RaceType.COCKER);

        System.out.println(d1.toString());

        Dog<RaceType> d2 = new Dog<>("copper",RaceType.BOSTON);

        System.out.println(d2.toString());

        // both at  the same time (race and family)

        Dog d3 = new Dog<>("pepe", RaceType.BOSTON, Family.PAPA.getName());

        System.out.println(d3.toString());
    }
}