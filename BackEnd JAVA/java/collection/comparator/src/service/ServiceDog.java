package service;

import entities.Dog;

import java.util.Comparator;

public class ServiceDog {

    public static Comparator<Dog> compAge = new Comparator<Dog>() {
        @Override
        public int compare(Dog d1, Dog d2) {
            return d2.getAge();
        }

    };

    public static Comparator<Dog> compName = new Comparator<Dog>() {
        @Override
        public int compare(Dog d1, Dog d2) {
            return d2.getName().compareTo(d1.getName());
        }

    };
}
