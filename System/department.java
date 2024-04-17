package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class department extends JFrame {

    department() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,690,490);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        add(panel1);


        JTable table = new JTable();
        table.setBounds(10,60,670,350);
        table.setBackground(new Color(3,45,48));
        table.setFont(new Font("serif" , Font.PLAIN , 15));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            connection1 c = new connection1();
            String departmentinfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(departmentinfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(500,410,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==back){
                    setVisible(false);
                    new reception();
                }
            }
        });

        JLabel department = new JLabel("Department");
        department.setBounds(100,15,105,20);
        department.setForeground(Color.WHITE);
        department.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(department);


        JLabel budget = new JLabel("Budget");
        budget.setBounds(460,15,80,19);
        budget.setForeground(Color.WHITE);
        budget.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(budget);



        setUndecorated(true);
        setLayout(null);
        setLocation(340, 100);
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new department();
    }
}
