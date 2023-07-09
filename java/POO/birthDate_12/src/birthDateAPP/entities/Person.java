package birthDateAPP.entities;
import java.util.Date;

public class Person {

    private String name;
    private Date birth;
    private int age;

    public Person (){

    }
    public Person (String name, Date birth){
        this.name = name;
        this.birth = birth;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
