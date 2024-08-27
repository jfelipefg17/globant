package NespressoAPP.entities;

public class CoffeeMaker {
    private int capMax ;
    private int capActual;

    public CoffeeMaker (){

    }

    public CoffeeMaker(int capMax, int capActual) {
        this.capMax = capMax;
        this.capActual = capActual;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }

}
