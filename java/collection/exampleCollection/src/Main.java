import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ///////////////////////////////////////////////////////////////////////////////////////
        // LIST

        ArrayList<Integer> numbers1 = new ArrayList<>();
        for ( int i = 0; i < 3; i++ ){
            int j = 234 * i+1;
            numbers1.add(j);
        }
        numbers1.remove(0);

        // PRINT !!!!!!!!!

        for ( Integer var : numbers1) {
            System.out.println(var);
        }

        LinkedList<Integer> numbers2 = new LinkedList<>();

        //////////////////////////////////////////////////////////////////////////////////
        //SET

        HashSet<String> names = new HashSet<>();
        for ( int i = 0; i < 3; i++ ){
            System.out.println("write name");
            String name = read.nextLine();
            names.add(name);

        }
        names.remove("felipe");

        // PRINT !!!!!!!!!
        for ( String var : names) {
            System.out.println(var);
        }


        TreeSet<Integer> numbers3 = new TreeSet<>();

        LinkedHashSet<String> phrases = new LinkedHashSet<>();

        ///////////////////////////////////////////////////////////////////////////////////////
        // MAPS

        HashMap<Integer,String> people1 = new HashMap<>();

        for ( int i = 0; i < 3; i++ ){
            int j = 234 * i+1;
            System.out.println("write name");
            String name = read.nextLine();
            people1.put(j,name);

        }
        people1.remove(235);

        // PRINT !!!!!!!!!

        for (Map.Entry<Integer, String> var : people1.entrySet()) {
            System.out.println("document: " + var.getKey() + ", name: " + var.getValue());
        }

        TreeMap<Integer,String> people2 = new TreeMap<>();

        LinkedHashMap<Integer,String> people3 = new LinkedHashMap<>();


        ////////////////////////////////////////////////////////////////////////////////////////////

        // SORT
    }


}