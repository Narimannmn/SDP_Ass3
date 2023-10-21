package org.example;

public class FarenheitToCelciusAdapter implements Temperature{
    private double temp;

    public FarenheitToCelciusAdapter(double temp) {
        this.temp = temp;
    }
    @Override
    public double getTemperature() {
        return ((temp-32)*5)/9;
    }
}
