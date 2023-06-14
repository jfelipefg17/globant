package petsapp.entities;
import java.util.Date;
public class User {
    public String name;
    public String surName;
    public int dni;
    public Date birthday;
    public String country;
    public User() {
    }

    public User(String name, String surName, int dni, Date birthday, String country) {
        this.name = name;
        this.surName = surName;
        this.dni = dni;
        this.birthday = birthday;
        this.country = country;
    }
}
