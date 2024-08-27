package entities;

import java.time.LocalDate;

public class Birthdate {
    private LocalDate birth;

    public Birthdate () {

    }

    public Birthdate (LocalDate birth) {
        this.birth = birth;
    }


    public LocalDate getBirth () {
        return birth;
    }

    public void setBirth (LocalDate birth) {
        this.birth = birth;
    }
}
