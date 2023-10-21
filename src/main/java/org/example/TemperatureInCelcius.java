package org.example;

public class TemperatureInCelcius implements Temperature{
    private double temp;

    public TemperatureInCelcius(double temp) {
        this.temp = temp;
    }

    @Override
    public double getTemperature() {
        return temp;
    }
}
