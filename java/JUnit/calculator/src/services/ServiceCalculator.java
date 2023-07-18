package services;


public class ServiceCalculator {

    public double discount10 (double n) {
        n -= (n * 10) / 100;
        return n;

    }
}
