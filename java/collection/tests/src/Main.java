import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd");

        while (date == null) {
            System.out.print("Enter the date (MM/dd): ");
            String userInput = scanner.nextLine();

            try {
                date = LocalDate.parse(userInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use MM/dd.");
            }
        }

        System.out.println("Entered date: " + date);
    }
}
