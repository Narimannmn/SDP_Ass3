package org.example;

public class TemperatureInFarenheit implements Temperature{

    private double temp;

    public TemperatureInFarenheit(double temp) {
        this.temp = temp;
    }

    @Override
    public double getTemperature() {
        return temp;
    }
}
