import service.ServiceClient;
import service.ServiceRoutine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        ServiceRoutine r1 = new ServiceRoutine();
        ServiceClient c1 = new ServiceClient();

                        //  3
        for( int i = 0; i < 2 ;i++ ){
            c1.registerClient();
        }
                        //  3
        for( int i = 0; i < 2 ;i++ ){
            r1.registerRoutine();
        }
        /*
        add the clients and routines to the arraylists
        */
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        //print all clients
        c1.clients();
        System.out.println("write number of the client you want a change info");
        int i = num.nextInt();
        c1.infoClient(i);
        //print all clients with changes
        c1.clients();

        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        //print all routines
        r1.routines();
        System.out.println("write number of the routine you want a change info");
        int j = num.nextInt();
        r1.infoRoutine(j);
        //print all routines with changes
        r1.routines();

        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        //print all clients
        c1.clients();
        System.out.println("write number of the client you want to delete");
        int h = num.nextInt();
        c1.deleteClient(h);
        //print all clients with changes
        c1.clients();

        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        //print all routines
        r1.routines();
        System.out.println("write number of the routine you want to delete");
        int k = num.nextInt();
        r1.deleteRoutine(k);
        //print all routines with changes
        r1.routines();

    }
}