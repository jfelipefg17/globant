package services;


public class ServiceCalculator {

    public double discount10 (double n) {
        n -= (n * 10) / 100;
        return n;


    }

    public double maxDiscount (double n) {
        n -= (n*30) / 100;
        return n;
    }
}
