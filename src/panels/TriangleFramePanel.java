package panels;

import geometryObjects.Circle;
//import geometryObjects.Line;
import geometryObjects.Triangle;
import windowsFrames.MainForm;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sahatov Batyr on 07.03.2019.
 */
public class TriangleFramePanel extends JPanel implements Runnable{

    private Triangle triangle;
    private boolean isRotata;
    private MainForm mainForm;




    public  TriangleFramePanel(LayoutManager layout){
        setLayout( layout);

        triangle = new Triangle(110,110,190,210,350,155);
//        (new Thread(this)).start();

    }

    public void setParent(MainForm mainForm)
    {
        this.mainForm = mainForm;
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        if ( triangle.isExist()) {
            triangle.drawMe(g2);

            isRotata = mainForm.getButtonPanel().isRotata();
            if ( isRotata)triangle.rotata(g2);

            Circle circle = triangle.getCircumscribedCircle();
            g2.draw(circle);
            super.repaint();


        } else {
            String text = "there is no such triangle";
            g2.setColor(Color.black);
            g2.drawString(text,20,30);
        }

    }

    @Override
    public void run() {

        while (true){

            try {
//                triangle.goAhead();

                super.repaint();
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
//
    }


}
