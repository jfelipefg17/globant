import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        System.out.println("write how many members have the teamL ");
        int members = num.nextInt();

        String[] array = new String[members];

        for (int i = 0; i <= members -1; i++) {
            System.out.println("name of a member: ");
            String name = read.nextLine();
            array[i] = name;
        }
        for (int i = 0; i <= members -1; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

}
