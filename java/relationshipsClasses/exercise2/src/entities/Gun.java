package entities;


public class Gun {
    private int actualP;
    private int actualPP;
    private int waterP;


    public Gun () {

    }

    public Gun(int actualP, int waterP,int actualPP) {
        this.actualP = actualP;
        this.actualPP = actualPP;
        this.waterP = waterP;
    }

    public int getActualP() {
        return actualP;
    }

    public void setActualP(int actualP) {
        this.actualP = actualP;
    }

    public int getActualPP() {
        return actualPP;
    }

    public void setActualPP(int actualPP) {
        this.actualPP = actualPP;
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
                "actualP=" + actualP +
                ", actualPP=" + actualPP +
                ", waterP=" + waterP +
                '}';
    }
}
