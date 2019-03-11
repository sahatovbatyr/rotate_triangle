package windowsFrames;

import labels.ButtonPanel;
import labels.TriangleFramePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sahatov Batyr on 07.03.2019.
 */
public class MainForm extends JFrame  {

    private boolean isRotata;
    TriangleFramePanel panelCircle;
    ButtonPanel buttonPanel;


   public MainForm(){
       setTitle("MainForm");
       setSize(600,600);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setLocation(400, 400);
       setLayout(new BorderLayout());

        panelCircle = new TriangleFramePanel(new GridLayout(2, 0));
        buttonPanel = new ButtonPanel(new FlowLayout());

       buttonPanel.setParent(this);
       panelCircle.setParent(this);

       add(buttonPanel, BorderLayout.WEST);
       add(panelCircle, BorderLayout.CENTER);



   }

    public TriangleFramePanel getPanelCircle() {
        return panelCircle;
    }

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
}
