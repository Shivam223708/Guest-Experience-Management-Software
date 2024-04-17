package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class room extends JFrame {

    JTable table;
    JButton back;

    room(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);


        table = new JTable();
        table.setBounds(10,40,540,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            connection1 c = new connection1();
            String roominfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(600,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==back){
                    new reception();
                    setVisible(false);
                }
            }
        });


        JLabel roomno = new JLabel("Room No.");
        roomno.setBounds(12,15,100,19);
        roomno.setForeground(Color.WHITE);
        roomno.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(roomno);

        JLabel availability = new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(availability);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(230,15,150,19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(338,15,80,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(445,15,80,19);
        bed.setForeground(Color.WHITE);
        bed.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(bed);


        setUndecorated(true);
        setLayout(null);
        setLocation(340,100);
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new room();
    }
}
