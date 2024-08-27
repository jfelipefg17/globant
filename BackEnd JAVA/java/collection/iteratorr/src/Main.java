import java.util.ArrayList;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

         //create the iterator
        Iterator<String> it = list.iterator();
        System.out.println("elements in list");


         // hasnext return ture , that means you have to work with loop while
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }

        System.out.println(" ");
        it = list.iterator();

         // delete while you loop the list
        while (it.hasNext()) {
            if (it.next().equals("B")) {
                it.remove();}
        }

        System.out.println(" ");
        it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }

        System.out.println(" ");
    }
}