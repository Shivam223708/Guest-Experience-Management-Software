package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addroom extends JFrame implements ActionListener {

    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    Addroom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,875,490);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        add(panel1);

        JLabel l1 = new JLabel("ADD ROOMS");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma", Font.BOLD , 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD , 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(240,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN , 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3 = new JLabel("IS AVAILABLE");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma",Font.BOLD , 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 = new JComboBox(new String[]{"Available" , "Occupied"});
        t3.setBounds(240,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN , 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l4 = new JLabel("PRICE");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD , 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(240,150,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN , 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);


        JLabel l5 = new JLabel("CLEANING STATUS");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD , 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 = new JComboBox(new String[]{"Cleaned" , "Dirty"});
        t5.setBounds(240,190,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN , 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel l6 = new JLabel("BED TYPE");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD , 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6 = new JComboBox(new String[]{"Single Bed" , "Double Bed" , "Triple Bed" , "Family Suite"});
        t6.setBounds(240,230,156,20);
        t6.setFont(new Font("Tahoma",Font.PLAIN , 14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        b1 = new JButton("ADD");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(200,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


        setUndecorated(true);
        setSize(885,500);
        setVisible(true);
        setLayout(null);
        setLocation(200,160);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{
                connection1 c = new connection1();
                String room = t2.getText();
                String available = (String) t3.getSelectedItem();
                String status = (String) t5.getSelectedItem();
                String price = t4.getText();
                String type = (String) t6.getSelectedItem();

                String q = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully added");
                setVisible(false);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource()==b2) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Addroom();
    }

}
