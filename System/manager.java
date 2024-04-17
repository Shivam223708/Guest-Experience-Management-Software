package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.jar.JarFile;

public class manager extends JFrame {
    manager(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,46 ,964,450);
        table.setForeground(Color.WHITE);
        table.setFont(new Font("serif" , Font.PLAIN , 15));
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            connection1 con = new connection1();
            String q = "select * from employee where  job = 'Manager'";
            ResultSet resultSet = con.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(740,500,120,35);
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


        JLabel name = new JLabel("Name");
        name.setBounds(31,11,70,20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(156,11,70,20);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(260,11,70,20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(390,11,70,20);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(500,11,70,20);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(salary);

        JLabel phno = new JLabel("Phone");
        phno.setBounds(620,11,70,20);
        phno.setForeground(Color.WHITE);
        phno.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(phno);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(740,11,70,20);
        aadhar.setForeground(Color.WHITE);
        aadhar.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(aadhar);

        JLabel email = new JLabel("Email");
        email.setBounds(870,11,70,20);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Tahoma" , Font.BOLD , 14));
        panel.add(email);

        setUndecorated(true);
        setLayout(null);
        setLocation(320,120);
        setSize(1000,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new manager();
    }
}
