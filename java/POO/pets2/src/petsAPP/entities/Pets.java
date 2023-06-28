package petsAPP.entities;

public class Pets {

    //attributes of the objet
    public String name;
    public String nickName;
    public String type;
    public String color;
    public int age;
    public boolean tail;
    public String race;

//implicit constructor
    //empty constructor
public Pets(){

}
    public Pets (boolean tail) {
        this.tail = tail;
    }
    // complete constructor with arguments
    public Pets(String name, String nickName, String type, String color, int age, String race) {
        //this.name reference to this class to the attribute name of this class | name make reference to the argument that is in the constructor
        this.name = name;
        this.nickName = nickName;
        this.type = type;
        this.color = color;
        this.age = age;
        this.race = race;
    }
}
