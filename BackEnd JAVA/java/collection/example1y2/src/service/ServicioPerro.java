package service;

import entities.Perro;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<Perro> lista = new ArrayList<>();



    public void nuevoPerro (){

        Perro s1 = new Perro();

        System.out.println("nombre del perro");
        s1.setNombre(leer.nextLine());
        System.out.println("raza del perro");
        s1.setRaza(leer.nextLine());

        lista.add(s1);

    }

    public void imprimirLista () {
        for ( Perro var : lista ) {
            System.out.println(var.toString());
        }
    }

    public void deletePet (String name) {

        Iterator<Perro> it = lista.iterator();

        while (it.hasNext()) {
            if (it.next().getNombre().equals(name)) {
                it.remove();
                System.out.println("you delete the dog");
                break;
            }else {
                System.out.println("the pet is not on the list");
                break;
            }
        }

    }

}
