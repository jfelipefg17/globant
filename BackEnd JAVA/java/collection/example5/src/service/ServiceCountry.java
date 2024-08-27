package service;

import javax.jnlp.ClipboardService;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ServiceCountry {

    HashSet<String> country = new HashSet<>();
    public Scanner read = new Scanner(System.in);
    public void addCountry () {
        System.out.println("write the country");
        String count = read.nextLine();

        country.add(count);
    }

    public void printCountry () {
        for ( String var : country ) {
            System.out.println(var);
        }
    }

    public void orderAZ () {
        ArrayList<String> list = new ArrayList<>(country);
        Collections.sort(list);
        for ( String var : list ) {
            System.out.println(var);
        }
    }
    public void deleteCountry () {
        System.out.println("write the name of the country you want delete");
        String ss = read.nextLine();
        boolean aa = true;
        for ( String var : country ) {
            if (var.equals(ss)) {
                country.remove(var);
                aa = false;
                break;
            }
        }
        if (aa) {
            System.out.println("the country is not on the list");
        } else {
            System.out.println("country delete");
        }
    }
}
