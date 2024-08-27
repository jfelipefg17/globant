package entities;

// final class because anyone extends of student
public final class Student extends Person {
    private final String grade;

    // inheritance constructor
    public Student ( String name, Integer age, Integer id, String grade ) {
        super(name, age, id);
        this.grade = grade;
    }

    // inheritance method and polymorphism
    @Override
    public void printToString() {
        System.out.println(this);
    }

    @Override
    public void println() {
        super.println();
        System.out.println("specially a student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
