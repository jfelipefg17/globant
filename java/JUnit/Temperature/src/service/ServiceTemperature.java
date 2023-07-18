package service;

public class ServiceTemperature {

    public double celsius (double far) {
        return Math.round((far - 32) / 1.8);
    }

    public double kelvin (double far) {
        return celsius(far) + 273.15;
    }

}