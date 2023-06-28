package petsAPP.entities;

import java.util.Date;

public class User {

    //attributes of the object
    public String name;
    public String lastName;
    public int dni;
    public Date birthDate;
    public String country;

        public User () {

        }

    public User(String name, String lastName, int dni, Date birthDate, String country) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDate = birthDate;
        this.country = country;
    }
}
