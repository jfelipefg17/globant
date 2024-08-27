import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Sort
        // Hashset and maps cant be sort because they are sort until creation

        /////////////////////////////////////////////////////////////////////
        // Hashset have to be changed to arraylist

        ArrayList<Integer> num = new ArrayList<>();
        Collections.sort(num);

        HashSet<Integer> numSet = new HashSet<>();
        // changed to a list
        ArrayList<Integer> numList = new ArrayList<>(numSet);
        Collections.sort(numList);


        /////////////////////////////////////////////////////////////////////
        // maps have to be changed as a tree map

        HashMap<Integer, String> student = new HashMap<>();
        // change to a treeMap
        TreeMap<Integer, String > studentTree = new TreeMap<>();


        /////////////////////////////////////////////////////////////////
        // order and object collection  DO NOT USE SORT !!!!
        // comparator folder







    }
}