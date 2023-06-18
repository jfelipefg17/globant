package petsapp.entities;

public class Pet {
    private String name;
    private String nickName;
    private String type;
    private String color;
    private String race;
    private int age;
    private boolean tail;

    public Pet(){

    }

    public Pet (String name, String nickName, String type){
            this.name = name;
            this.nickName = nickName;
            this.type = type;
    }

    public Pet(String name, String nickName, String type, String color, String race, int age, boolean tail) {
        this.name = name;
        this.nickName = nickName;
        this.type = type;
        this.color= color;
        this.race= race;
        this.age = age;
        this.tail = tail;
    }

    public void setName (String name) {
        if (name.length() > 0) {
            this.name = name;
        }

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


}
