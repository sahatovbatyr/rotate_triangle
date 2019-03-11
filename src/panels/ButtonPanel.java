package panels;

import windowsFrames.MainForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sahatov Batyr on 09.03.2019.
 */
public class ButtonPanel extends JPanel  implements  ActionListener {
    private boolean isRotata;
    private MainForm mainForm;


    public boolean isRotata() {
        return isRotata;
    }

    public ButtonPanel (LayoutManager layout){
        JButton btnStopAndPlay = new JButton("Rotate");
        btnStopAndPlay.addActionListener(this);
        add(btnStopAndPlay);
        setLayout( layout);
    }

    public void setParent(MainForm mainForm)
    {
        this.mainForm = mainForm;
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        isRotata = !isRotata;


    }


}
