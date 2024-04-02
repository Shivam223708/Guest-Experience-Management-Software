package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee , add_Room , add_Drivers , logout , back;
    admin(){

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma" , Font.BOLD , 15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(250,390,200,30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma" , Font.BOLD , 15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers = new JButton("ADD DRIVER");
        add_Drivers.setBounds(250,550,200,30);
        add_Drivers.setBackground(Color.WHITE);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("Tahoma" , Font.BOLD , 15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        logout = new JButton("LOGOUT");
        logout.setBounds(130,690,110,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma" , Font.BOLD , 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("BACK");
        back.setBounds(280,690,110,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.BOLD , 15));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//employees.png"));
        Image i11 = i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//room.png"));
        Image i12 = i2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i12);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//driver.png"));
        Image i13 = i3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i13);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//Logo1.gif"));
        Image i14 = i4.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i14);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(672,192,600,600);
        add(label3);

        JLabel title1 = new JLabel("WELCOME  TO  KANHAIYA ");
        JLabel title2 = new JLabel("THE  LUXURY  STAY  YOU'll  EXPERIENCE");
        title1.setBounds(700,16,1000,100);
        title1.setFont(new Font("TIMES NEW ROMAN" , Font.BOLD,35));
        title1.setBackground(new Color(3,45,48));
        title1.setForeground(Color.WHITE);
        add(title1);

        title2.setBounds(570,66,1000,100);
        title2.setFont(new Font("TIMES NEW ROMAN" , Font.BOLD,35));
        title2.setBackground(new Color(3,45,48));
        title2.setForeground(Color.WHITE);
        add(title2);

        ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//t3.png"));
        Image i5 = t1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon t2 = new ImageIcon(i5);
        JLabel label4 = new JLabel(t2);
        label4.setBounds(470, 60, 120, 120);
        label4.setBackground(null);
        add(label4);

        ImageIcon t3 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//t4.png"));
        Image i6 = t3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon t4 = new ImageIcon(i6);
        JLabel label5 = new JLabel(t4);
        label5.setBounds(1280, 60, 120, 120);
        add(label5);


        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1530,1090);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add_Employee){
            new Addemployee();
        }
        else if (e.getSource()==add_Room) {
            new Addroom();
        }
        else if (e.getSource()==add_Drivers) {
            new Adddriver();
            setVisible(false);
        }
        else if (e.getSource()==logout) {
            System.exit(120);
        }
        else if (e.getSource()==back) {
            new dashboard();
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new admin();
    }

}
