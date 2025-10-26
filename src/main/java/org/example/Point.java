package org.example;

// Клас Point, який реалізує інтерфейс Movable
public class Point implements Movable {

    private double x;
    private double y;

    // Конструктор за замовчуванням
    public Point() {
        this(0.0, 0.0);
    }

    // Конструктор з аргументами
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Реалізація методів інтерфейсу Movable

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Додатковий метод toString для зручності тестування
    @Override
    public String toString() {
        return String.format("Point (x=%.2f, y=%.2f)", x, y);
    }
}