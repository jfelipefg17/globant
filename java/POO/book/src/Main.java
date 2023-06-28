import entities.Book;
import services.ServiceBook;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ServiceBook b = new ServiceBook();

        Book b1 = b.createBook();

        System.out.println(" ");
        System.out.println(b1);
        System.out.println("---------------------------");
        System.out.println(" ");

        b.showBook(b1.getISBN(),b1.getAuthor(),b1.getTittle(),b1.getNumberPages());

    }
}