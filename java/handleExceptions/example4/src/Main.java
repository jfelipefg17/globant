// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException a ) {
            System.out.println("you cant div 0");
            System.out.println(a.getMessage());
        }catch (Exception a ){
            a.printStackTrace();
            System.out.println(a.getMessage());
        }
    }
}