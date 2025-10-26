package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class RoundedRectangle extends DrawShape {

    public RoundedRectangle() {
        super();
    }


    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        double x = Math.min(startPoint.getX(), endPoint.getX());
        double y = Math.min(startPoint.getY(), endPoint.getY());
        double width = Math.abs(startPoint.getX() - endPoint.getX());
        double height = Math.abs(startPoint.getY() - endPoint.getY());

        return new RoundRectangle2D.Double(x, y, width, height, 55.0, 55.0);
    }
}
