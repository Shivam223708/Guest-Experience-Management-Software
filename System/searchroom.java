package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class searchroom extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JTable table;
    Choice choice;
    JButton add,back;
    searchroom() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel labelname = new JLabel("Search For Room");
        labelname.setBounds(306, 6, 260, 41);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 21));
        panel.add(labelname);

        JLabel bedtype = new JLabel("Room Bed Type:");
        bedtype.setBounds(30, 73, 123, 20);
        bedtype.setForeground(Color.WHITE);
        bedtype.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(bedtype);

        JLabel roomno = new JLabel("Room Number");
        roomno.setBounds(20, 162, 140, 20);
        roomno.setForeground(Color.WHITE);
        roomno.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(roomno);

        JLabel available = new JLabel("Availability");
        available.setBounds(170, 162, 140, 20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(available);

        JLabel status = new JLabel("Cleaning Status");
        status.setBounds(301, 162, 140, 20);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(status);

        JLabel price = new JLabel("Price");
        price.setBounds(450, 162, 140, 20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(price);

        JLabel bt = new JLabel("Bed Type");
        bt.setBounds(580, 162, 140, 20);
        bt.setForeground(Color.WHITE);
        bt.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(bt);


        checkBox = new JCheckBox("Only Show Available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single bed");
        choice.add("Double bed");
        choice.add("Triple bed");
        choice.add("Family Suite");
        choice.setBounds(153,72,120,20);
        choice.setBackground(new Color(3,45,48));
        choice.setForeground(Color.WHITE);
        choice.setFont(new Font("serif" , Font.PLAIN ,14));
        panel.add(choice);

        table = new JTable();
        table.setBounds(10,187,700,150);;
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            connection1 c = new connection1();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200,400,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(300, 150);
        setSize(850, 550);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String q = "select * from Room where bed_type = '"+choice.getSelectedItem()+"'";
            String q1 = "select * from Room where availability = 'Available' and bed_type = '"+choice.getSelectedItem()+"'";
            try{
                connection1 c = new connection1();
                ResultSet resultSet = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if(checkBox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else {
            setVisible(false);
            new reception();
        }

    }


    public static void main(String[] args) {
        new searchroom();
    }

}

