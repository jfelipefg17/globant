package entities;

import interf.learnInterfaceUse;

public abstract class Person implements learnInterfaceUse {
    protected String name;
    protected Integer age;
    protected Integer id;

    public Person (String name, Integer age, Integer id) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    // polymorphism
    public abstract void printToString();

    // polymorphism
    public void println () {
        System.out.println("Im a person");
    }

    // alll of this can be get bit setters and getter , but the family inheritance can get without setters or getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    final void nothing () {
        // this method cant be access to any subclass
        //and if put final in a class is the same
    }

    // interface
    @Override
    public void ageMaxPerson() {
        System.out.println("the max age that a person can life is: " + MY_CONSTANT);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}



