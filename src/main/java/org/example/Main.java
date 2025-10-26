package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik");
        Cat murzik = new Cat("Murzik");

        System.out.println("\n Завдання 1:");
        System.out.println(bobik.getName() + " says: " + bobik.makeSound());
        System.out.println(murzik.getName() + " says: " + murzik.makeSound());

        System.out.println("\n Завдання 2:");

        Point p = new Point(10.5, 20.3);
        System.out.println("Початкова точка: " + p);

        p.setX(15.0);
        p.setY(5.0);
        System.out.println("Після setX/setY: " + p);

        p.moveTo(100.0, 50.0);
        System.out.println("Після moveTo: " + p);

        System.out.println("\n Завдання 3:");

        Smartphone samsung = new Smartphone("Samsung S23");

        samsung.makeCall();
        samsung.receiveCall();

        double[] coords1 = samsung.getCoordinates();
        System.out.printf("%s coordinates 1: [%.4f, %.4f]\n", samsung.getModel(), coords1[0], coords1[1]);

        double[] coords2 = samsung.getCoordinates();
        System.out.printf("%s coordinates 2: [%.4f, %.4f]\n", samsung.getModel(), coords2[0], coords2[1]);

        System.out.println("\n Завдання 4. Інтерфейс Comparable (Car):");

        Car[] cars = new Car[] {
                new Car(30000, 2020, 150),
                new Car(25000, 2018, 180),
                new Car(30000, 2022, 120),
                new Car(30000, 2022, 200)
        };

        System.out.println("До сортування:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Сортування масиву. Arrays.sort() використовує метод compareTo()
        Arrays.sort(cars);

        System.out.println("\nПісля сортування (за ціною, роком, HP):");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

