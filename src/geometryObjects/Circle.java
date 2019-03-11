package geometryObjects;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Sahatov Batyr on 09.03.2019.
 */
public class Circle extends Ellipse2D {

    private Point center;
    private double radius;

    public Circle ( ){

    }



    public  Circle( Point center, double radius) {
        this.center = new Point(center.getX()-radius, center.getY()-radius);
        this.radius = radius;
    }

    public Point getPoint() {
        return center;
    }

    public void setPoint(Point point) {
        this.center = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getX() {
        return center.getX();
    }

    @Override
    public double getY() {
        return center.getY();
    }

    @Override
    public double getWidth() {
        return radius*2;
    }

    @Override
    public double getHeight() {
        return radius*2;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double width, double height) {
//        center.setLocation(x, y);
//        this.width = width;
//        this.height = height;


    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
