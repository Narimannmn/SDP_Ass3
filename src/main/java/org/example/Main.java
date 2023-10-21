package org.example;

public class Main {
    public static void main(String[] args) {
        Temperature tempcel = new TemperatureInCelcius(25.0);
        Temperature tempfar = new FarenheitToCelciusAdapter(new TemperatureInFarenheit(77.0).getTemperature());
        System.out.println(tempfar.getTemperature());
    }
}