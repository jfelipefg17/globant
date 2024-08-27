package birthDateAPP.entities;
import java.time.LocalDate;


public class Person {

    private String name;
    private LocalDate birth;
    private int age;

    public Person (){

    }
    public Person (String name, LocalDate birth){
        this.name = name;
        this.birth = birth;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
