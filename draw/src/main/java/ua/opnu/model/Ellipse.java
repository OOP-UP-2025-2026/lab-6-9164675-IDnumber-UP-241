package ua.opnu.model;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    public Ellipse() {
        super();
    }

    // Перевизначення поліморфного методу для малювання еліпса
    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        // Визначення координат та розмірів для Ellipse2D.Double
        int x = Math.min(startPoint.x, endPoint.x);
        int y = Math.min(startPoint.y, endPoint.y);
        int width = Math.abs(startPoint.x - endPoint.x);
        int height = Math.abs(startPoint.y - endPoint.y);

        return new Ellipse2D.Double(x, y, width, height);
    }

    // Перевизначення методу без параметрів, щоб він викликав логіку нащадка
    @Override
    public Shape getShape() {
        return super.getShape();
    }
}