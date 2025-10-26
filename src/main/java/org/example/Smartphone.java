package org.example;

import java.util.Random;

// Клас Smartphone, що реалізує обидва інтерфейси: GPS та Cellular
public class Smartphone implements GPS, Cellular {

    private String model;
    private double currentLatitude;
    private double currentLongitude;

    public Smartphone(String model) {
        this.model = model;
        // Задаємо початкові координати (наприклад, для тестування)
        this.currentLatitude = 46.47;
        this.currentLongitude = 30.73;
    }

    // Реалізація інтерфейсу GPS
    @Override
    public double[] getCoordinates() {
        // Імітуємо невелике оновлення координат
        Random rand = new Random();
        this.currentLatitude += (rand.nextDouble() - 0.5) * 0.001;
        this.currentLongitude += (rand.nextDouble() - 0.5) * 0.001;

        return new double[]{currentLatitude, currentLongitude};
    }

    // Реалізація інтерфейсу Cellular
    @Override
    public void makeCall() {
        System.out.println(model + ": Making a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": Receiving an incoming call.");
    }

    public String getModel() {
        return model;
    }
}