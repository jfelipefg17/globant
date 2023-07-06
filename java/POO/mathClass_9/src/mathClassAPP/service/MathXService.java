package mathClassAPP.service;

public class MathXService {

    public int mayor (int num1, int num2) {

        if (num1 > num2) {
            return num1;
        }else {
            return num2;
        }
    }

    public double power (int num1, int num2) {
        int mayor;
        int little;
        if (num1 > num2) {
            mayor = num1;
            little= num2;
        }else {
            mayor = num2;
            little= num1;
        }
        return Math.pow(mayor,little);

    }

    public double square (int num1, int num2) {
        int little = Math.min(num1,num2);

        return Math.sqrt(little);
    }
}
