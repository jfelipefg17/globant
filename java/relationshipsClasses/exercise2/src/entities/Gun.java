package entities;

import java.util.Arrays;

public class Gun {
    private int actualP;
    private int waterP;


    public Gun () {

    }

    public Gun(int actualP, int waterP) {
        this.actualP = actualP;
        this.waterP = waterP;
    }

    public int getActualP() {
        return actualP;
    }

    public void setActualP(int actualP) {
        this.actualP = actualP;
    }

    public int getWaterP() {
        return waterP;
    }

    public void setWaterP(int waterP) {
        this.waterP = waterP;
    }

    @Override
    public String toString() {
        return "Gun{" +
                ", actualP=" + actualP +
                ", waterP=" + waterP +
                '}';
    }
}
