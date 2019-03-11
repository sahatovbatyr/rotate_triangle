package geometryObjects;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by Sahatov Batyr on 07.03.2019.
 */
public class Triangle extends Polygon {

    private Line line1;
    private Line line2;
    private Line line3;
    private boolean exist;
    private double angle;
    private Point circumscribedCenter;
    private double circumscribedRadius;
    private Circle circumscribedCircle;





    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Line getLine3() {
        return line3;
    }

    public Triangle(){
        line1 = new Line();
        line2 = new Line();
        line3 = new Line();

    }

    public Triangle( double x1, double y1, double x2, double y2, double x3, double y3 ){
        line1 = new Line(x1,y1, x2,y2);
        line2 = new Line(x1,y1, x3,y3);
        line3 = new Line(x2,y2, x3,y3);

        circumscribedCenter = getCircleCenter( x1,  y1,  x2,  y2,  x3,  y3);
        circumscribedRadius = getCircumscribedCenterRadius();
        circumscribedCircle = new Circle(circumscribedCenter, circumscribedRadius);



    }

    public boolean isExist() {

        double a=line1.getLenght();
        double b=line2.getLenght();
        double c=line3.getLenght();

        if ( a + b>c &&  a+c>b && b+c > a ){
            exist = true;
            return exist;
        }

        return false;
    }

    public void goAhead(){
        double dx =1;

        line1.setPoint1( new Point( line1.getX1()+dx, line1.getY1()));
        line1.setPoint2( new Point( line1.getX2()+dx, line1.getY2()));

        line2.setPoint1( new Point( line2.getX1()+dx, line2.getY1()));
        line2.setPoint2( new Point( line2.getX2()+dx, line2.getY2()));

        line3.setPoint1( new Point( line3.getX1()+dx, line3.getY1()));
        line3.setPoint2( new Point( line3.getX2()+dx, line3.getY2()));


    }

    public void  rotata( final Graphics2D g2 ) {

        //AffineTransform at =  AffineTransform.getTranslateInstance(100,100);

        final AffineTransform rotate = AffineTransform.getRotateInstance(
                angle, circumscribedCenter.getX(), circumscribedCenter.getY());
        g2.transform(rotate);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);

        angle+=0.005;
        if (angle > 360) { angle=0;}

    }

    private Point getCircleCenter(double x1, double y1, double x2, double y2, double x3, double y3){
        Point point = new Point();


        double x12=x1-x2;
        double x23=x2-x3;
        double x31=x3-x1;

        double y12=y1-y2;
        double y23=y2-y3;
        double y31=y3-y1;

        double z1=x1*x1+y1*y1;
        double z2=x2*x2+y2*y2;
        double z3=x3*x3+y3*y3;

        double x = -(y12*z3+y23*z1+y31*z2)/(2*(x12*y31-y12*x31));
        double y = (x12*z3+x23*z1+x31*z2)/(2*(x12*y31-y12*x31));


        point.setLocation(x,y);

        return point;

    }

    public double getCircumscribedCenterRadius(){

        Line radius = new Line( circumscribedCenter, line1.getPoint1());
        return  radius.getLenght();

    }

    public Circle getCircumscribedCircle(){
        return circumscribedCircle;

    }

    public Point getCircumscribedCenter() {
        return circumscribedCenter;
    }


    public void drawMe( Graphics2D g2 )
    {

        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
    }








}
