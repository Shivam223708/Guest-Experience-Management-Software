package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class checkout extends JFrame {
    checkout(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,440);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100,20,150,30);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel id = new JLabel("Customer ID");
        id.setBounds(30,80,170,15);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        id.setForeground(Color.WHITE);
        panel.add(id);

        Choice Customer = new Choice();
        Customer.setBounds(200,80,150,25);
        Customer.setBackground(new Color(3,5,48));
        Customer.setForeground(Color.WHITE);
        panel.add(Customer);

        JLabel room = new JLabel("Room Number");
        room.setBounds(30,130,170,20);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        room.setForeground(Color.WHITE);
        panel.add(room);

        JLabel labelroom = new JLabel();
        labelroom.setBounds(200,130,170,20);
        labelroom.setFont(new Font("Tahoma",Font.BOLD,14));
        labelroom.setForeground(Color.WHITE);
        panel.add(labelroom);

        JLabel checkin = new JLabel("Check-In Time");
        checkin.setBounds(30,180,170,20);
        checkin.setFont(new Font("Tahoma",Font.BOLD,14));
        checkin.setForeground(Color.WHITE);
        panel.add(checkin);

        JLabel labelcheckin = new JLabel();
        labelcheckin.setBounds(200,180,230,20);
        labelcheckin.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckin.setForeground(Color.WHITE);
        panel.add(labelcheckin);

        JLabel checkout = new JLabel("Check-Out Time");
        checkout.setBounds(30,230,170,20);
        checkout.setFont(new Font("Tahoma",Font.BOLD,14));
        checkout.setForeground(Color.WHITE);
        panel.add(checkout);

        Date date = new Date();

        JLabel labelcheckout = new JLabel(""+date);
        labelcheckout.setBounds(200,230,230,20);
        labelcheckout.setFont(new Font("Tahoma",Font.BOLD,14));
        labelcheckout.setForeground(Color.WHITE);
        panel.add(labelcheckout);

        try{
            connection1 c = new connection1();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while(resultSet.next()){
                Customer.add(resultSet.getString("number"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        JButton checkOut = new JButton("Check-Out");
        checkOut.setBounds(30,330,120,30);
        checkOut.setForeground(Color.WHITE);
        checkOut.setBackground(Color.BLACK);
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    connection1 cv = new connection1();
                    cv.statement.executeUpdate("delete from customer where number = '"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability = 'Available' where room_number = '"+labelroom.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300,330,120,30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connection1 c = new connection1();
                try{
                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '"+Customer.getSelectedItem()+"'");
                    while(resultSet.next()){
                        labelroom.setText(resultSet.getString("room"));
                        labelcheckin.setText(resultSet.getString("checkintime"));
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170,330,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new reception();
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(800,450);
        setLocation(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new checkout();
    }
}
