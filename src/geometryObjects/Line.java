package geometryObjects;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Sahatov Batyr on 07.03.2019.
 */
public class Line extends Line2D {

    private Point point1;
    private Point point2;
    private double lenght;


    public Line(){
        point1 = new Point();
        point2 = new Point();

    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }





    public  Line (double x1, double y1, double x2, double y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);

    }

    public  Line (Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }

    public double getLenght() {

        lenght = Math.sqrt(
                (point2.getX() - point1.getX())*(point2.getX() - point1.getX()) +
                (point2.getY() - point1.getY())*(point2.getY() - point1.getY())
        );
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getX1() {
        return point1.getX();
    }

    @Override
    public double getY1() {
        return point1.getY();
    }

    @Override
    public Point2D getP1() {
        return null;
    }

    @Override
    public double getX2() {
        return point2.getX();
    }

    @Override
    public double getY2() {
        return point2.getY();
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override

    public Point2D getP2() {
        return null;
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {
        point1.setLocation(x1,y1);
        point2.setLocation(x2,y2);

    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
