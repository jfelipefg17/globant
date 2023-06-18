package petsapp.entities;

public class Pet {
    // all of this are objets
    private String name;
    private String nickName;
    private String type;
    private String color;
    private String race;
    private int age;
    private boolean tail;
    private String ownerName;
    private boolean owner;

    //default constructor
    public Pet(){

    }
    //constructor with parameters
    public Pet (String name, String nickName, String type){
            this.name = name;
            this.nickName = nickName;
            this.type = type;
    }
    // constructor with parameters
    public Pet(String name, String nickName, String type, String color, String race, int age, boolean tail) {
        // this. is for the name class , and name alone is for the parameter of the constructor
        this.name = name;
        this.nickName = nickName;
        this.type = type;
        this.color= color;
        this.race= race;
        this.age = age;
        this.tail = tail;

    }

    public Pet(String ownerName, boolean owner) {
        this.ownerName = ownerName;
        this.owner = owner;
    }

    public void setName (String name) {
        if (name.length() > 0) {
            this.name = name;
        }

    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getName(){
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public boolean isTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                ", ownerName=" + ownerName +
                ", owner=" + owner +
                '}';
    }
}
