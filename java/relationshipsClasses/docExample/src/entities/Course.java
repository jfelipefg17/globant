package entities;

import java.util.LinkedList;

public class Course {
    private int year;
    private char level;
    private Teacher teacher;
    private LinkedList<Students> studentsList;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LinkedList<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(LinkedList<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "year=" + year +
                ", level=" + level +
                ", teacher=" + teacher +
                '}';
    }
}


