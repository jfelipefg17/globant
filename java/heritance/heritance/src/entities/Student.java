package entities;

public class Student extends Person {
    private String grade;

    // inheritance constructor
    public Student (String grade, String name, Integer age, Integer id ) {
        super(name, age, id);
        this.grade = grade;
    }

    // inheritance method and polymorphism
    @Override
    public void print() {
        super.print();
        // polymorphism
        System.out.println(" GRADE: "+ grade);
    }


}
