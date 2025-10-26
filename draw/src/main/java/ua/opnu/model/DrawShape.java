package ua.opnu.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;

public abstract class DrawShape implements Serializable {

    // Існуючі константи фігур
    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2; // Додано в ЛР5

    protected Point startDrag;
    protected Point endDrag;
    protected Color color;

    public DrawShape() {
        this.color = Color.BLACK;
    }

    public DrawShape(Color color) {
        this.color = color;
    }

    public static DrawShape newInstance(int shapeType) {
        DrawShape shape = null;
        if (shapeType == DrawShape.SHAPE_RECTANGLE) {
            shape = new Rectangle();
        } else if (shapeType == DrawShape.SHAPE_ROUNDED_RECT) {
            shape = new RoundedRectangle();
        } else if (shapeType == DrawShape.SHAPE_ELLIPSE) {
            shape = new Ellipse();
        }
        return shape;
    }

    // Зроблено абстрактним для Завдання 5
    public abstract Shape getShape(Point startPoint, Point endPoint);

    // Метод використовує координати полів startDrag та endDrag
    public Shape getShape() {
        return getShape(startDrag, endDrag);
    }

    public void setShapeCoordinates(Point startPoint, Point endPoint) {
        this.startDrag = startPoint;
        this.endDrag = endPoint;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics2D g2) {
        if (startDrag != null && endDrag != null) {
            g2.setColor(color);
            Shape shape = getShape();
            g2.draw(shape);
        }
    }
}