package entities;

public class Students {
    private String fullName;

    public Students () {

    }

    public Students(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
