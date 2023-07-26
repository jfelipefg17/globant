package service;

import entities.Dog;

import java.util.Comparator;

public class ServiceDog {

    public static Comparator<Dog> comp = new Comparator<Dog>() {
        @Override
        public int compare(Dog d1, Dog d2) {
            return d2.getAge().compareTo(d1.getAge());
        }

    };
}
