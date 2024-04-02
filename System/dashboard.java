package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame implements ActionListener {

    JButton add , rec;
    dashboard(){
        super("Guest Experience Management Software");

        rec = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("tahoma" , Font.BOLD,15));
        rec.setBackground(new Color(255,100,0));
        rec.setForeground(Color.white);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("tahoma" , Font.BOLD,15));
        add.setBackground(new Color(255,100,0));
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        ImageIcon admin = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//boss.png"));
        Image i1 = admin.getImage().getScaledInstance(200,195 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i1);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(850,300,200,195);
        add(label1);

        ImageIcon recep = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//Reception.png"));
        Image i2 = recep.getImage().getScaledInstance(200,195 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(400,300,200,195);
        add(label2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//Dashboard2.gif"));
        Image i3 = imageIcon.getImage().getScaledInstance(1950,1090 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i3);
        JLabel label3 = new JLabel(imageIcon1);
        label3.setBounds(0,0,1950,1090);
        add(label3);


        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rec){
//            new Reception1();
        }
        else{
            new admin();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new dashboard();
    }
}
