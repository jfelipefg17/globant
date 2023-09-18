import java.lang.reflect.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] array = new int [5];

        try {
            for ( int i = 1; i <= 10; i++ ) {

                array[i] = i;

            }
        }catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("sorry array out of bounds");
            System.out.println("the lenght of the array is: " + array.length);
            System.out.println(a.getMessage());
        }catch (Exception a){
            System.out.println(a.getMessage());
        }


    }
}