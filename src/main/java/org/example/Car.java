package org.example;

import java.lang.Comparable;

public class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower; // кінські сили

    // Конструктор з трьома аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери та сетери
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("Car (Price: %d, Year: %d, HP: %d)", price, year, horsePower);
    }

    @Override
    public int compareTo(Object o) {
        // Перевіряємо тип об'єкта
        if (!(o instanceof Car)) {
            throw new ClassCastException("Object must be of type Car for comparison.");
        }

        Car otherCar = (Car) o;

        // 1. Порівняння за ціною
        if (this.price != otherCar.price) {
            return otherCar.price - this.price;
        }

        // 2. Порівняння за роком
        if (this.year != otherCar.year) {
            return this.year - otherCar.year;
        }

        // 3. Порівняння за кінськими силами
        return this.horsePower - otherCar.horsePower;
    }
}