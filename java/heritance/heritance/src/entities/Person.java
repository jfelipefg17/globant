package entities;

public abstract class Person {
    protected String name;
    protected Integer age;
    protected Integer id;

    public Person (String name, Integer age, Integer id) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    protected void print () {
        System.out.print("NAME: "+ name + " AGE: " + age + " ID: " + id);
    }

    final void nothing () {
        // this method cant be access to any subclass
        //and if put final in a class is the same
    }
}



