import java.util.Scanner;

public class Switch2 {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ride your gender");
        String gender = read.nextLine();

        switch (gender) {
            case "M":
                System.out.println("You are a male");
                break;
            case "F":
                System.out.println("You are a female");
                break;
            default:
                System.out.println("You write wrong answer");
                break;
        }
    }
}
