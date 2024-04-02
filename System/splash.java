package Hotel_Management.System;

import javax.swing.*;

public class splash extends JFrame {
    splash(){
        ImageIcon imageicon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//splash.gif"));
        JLabel label = new JLabel(imageicon);
        label.setBounds(0,0,858,680);
        add(label);


        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // use for time of frame
        try{
            Thread.sleep(2500);
            new login();
            setVisible(false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new splash();
    }
}
