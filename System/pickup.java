package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class pickup extends JFrame {
    pickup(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel pick = new JLabel("PICK-UP SERVICE");
        pick.setBounds(90,15,200,24);
        pick.setForeground(Color.WHITE);
        pick.setFont(new Font("Times New Roman" , Font.BOLD , 20));
        panel.add(pick);

        JLabel toc = new JLabel("Type of Car:");
        toc.setBounds(32,97,82,20);
        toc.setForeground(Color.WHITE);
        toc.setFont(new Font("Tahoma" , Font.PLAIN , 14));
        panel.add(toc);

        Choice choice = new Choice();
        choice.setBounds(130,96,150,22);
        choice.setBackground(new Color(3,45,48));
        choice.setForeground(Color.WHITE);
        choice.setFont(new Font("serif" , Font.PLAIN , 14));
        panel.add(choice);

        try{
            connection1 c = new connection1();
            String q = "select * from driver";
            ResultSet resultSet = c.statement.executeQuery(q);
            while(resultSet.next()){
                choice.add(resultSet.getString("car_name"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24, 208, 47, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(135, 208, 47, 20);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(250, 208, 70, 20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel company = new JLabel("Company");
        company.setBounds(365, 208, 70, 20);
        company.setForeground(Color.WHITE);
        company.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(company);

        JLabel carname = new JLabel("Car Name");
        carname.setBounds(476, 208, 100, 20);
        carname.setForeground(Color.WHITE);
        carname.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(carname);

        JLabel available = new JLabel("Available");
        available.setBounds(590, 208, 70, 20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(available);

        JLabel location = new JLabel("Location");
        location.setBounds(710, 208, 70, 14);
        location.setForeground(Color.WHITE);
        location.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(location);


        JTable table = new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("serif" , Font.PLAIN , 14));
        panel.add(table);

        try{
            connection1 c = new connection1();
            String q = "select * from driver";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        JButton display = new JButton("DISPLAY");
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        display.setBounds(250, 510, 120, 27);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where car_name = '"+choice.getSelectedItem()+"'";
                try{
                    connection1 c = new connection1();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(580, 510, 90, 27);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new reception();
            }
        });

//        setUndecorated(true);
        setLayout(null);
        setLocation(350, 150);
        setSize(900, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new pickup();
    }
}
