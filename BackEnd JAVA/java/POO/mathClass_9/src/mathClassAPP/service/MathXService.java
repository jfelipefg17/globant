package mathClassAPP.service;

public class MathXService {

    public int mayor (int num1, int num2) {

        int may = Math.max(num1,num2);
        return may;
    }

    public int power (int num1, int num2) {
        int mayor = Math.max(num1,num2);
        int little = Math.min(num1,num2);
        return (int )Math.pow(mayor,little);

    }

    public double square (int num1, int num2) {
        int little = Math.min(num1,num2);

        return Math.sqrt(little);
    }
}
