import entities.Task;
import service.ServiceTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        ArrayList<Task> list = new ArrayList<>();
        ServiceTask s1 = new ServiceTask ();


        for( int i = 0; i < 3 ;i++ ){
            System.out.println("-------------");
            System.out.println("Write a task");
            String nnn = read.nextLine();
            s1.addTask(nnn, list);
        }
        System.out.println("===================");
        System.out.println("===================");
        s1.showTasks(list);
        System.out.println("write the number of the class you want change");
        int j = num.nextInt();
        System.out.println("-------------");
        System.out.println("Write a new task");
        String aaa = read.nextLine();
        s1.infoTask(j,aaa, list);
        System.out.println("===================");
        System.out.println("===================");
        s1.showTasks(list);
        System.out.println("write the number of the class you want delete");
        int h = num.nextInt();
        s1.deleteTask(h, list);
        System.out.println("===================");
        System.out.println("===================");
        s1.showTasks(list);
    }
}