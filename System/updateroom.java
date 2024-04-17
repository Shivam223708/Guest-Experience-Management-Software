package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateroom extends JFrame {
    updateroom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update Room Status");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma" , Font.BOLD , 20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("ID :");
        label2.setBounds(44,88,46,14);
        label2.setFont(new Font("Tahoma" , Font.BOLD , 14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248,85,140,20);
        c.setBackground(new Color(3,45,48));
        c.setForeground(Color.WHITE);
        panel.add(c);

        try{
            connection1 con = new connection1();
            ResultSet resultSet = con.statement.executeQuery("select * from customer");
            while(resultSet.next()){
                c.add((resultSet.getString("number")));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number :");
        label3.setBounds(44,129,127,14);
        label3.setFont(new Font("Tahoma" , Font.BOLD , 14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(248,129,140,20);
        textField3.setBackground(new Color(3,45,48));
        textField3.setForeground(Color.WHITE);
        panel.add(textField3);

        JLabel label4 = new JLabel("Availability :");
        label4.setBounds(44,174,87,14);
        label4.setFont(new Font("Tahoma" , Font.BOLD , 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField textField4 = new JTextField();
        textField4.setBounds(248,174,140,20);
        textField4.setBackground(new Color(3,45,48));
        textField4.setForeground(Color.WHITE);
        panel.add(textField4);

        JLabel label5 = new JLabel("Cleaning Status :");
        label5.setBounds(44,216,150,20);
        label5.setFont(new Font("Tahoma" , Font.BOLD , 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField textField5 = new JTextField();
        textField5.setBounds(248,216,140,20);
        textField5.setBackground(new Color(3,45,48));
        textField5.setForeground(Color.WHITE);
        panel.add(textField5);


        JButton update = new JButton("Update");
        update.setBounds(115,330,89,23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    connection1 con = new connection1();
                    String status = textField5.getText();
                    con.statement.executeUpdate("update room set cleaning_status = '"+status+"' where room_number = " + textField3.getText());

                    JOptionPane.showMessageDialog(null,"Update successfully");
                    setVisible(false);
                    new updateroom();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(223,330,89,23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new reception();
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(180,300,89,23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c.getSelectedItem();
                String q = "select * from customer where number = '"+id+"'";
                try{
                    connection1 c = new connection1();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    while(resultSet.next()){
                        textField3.setText(resultSet.getString("room"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where room_number = '"+textField3.getText()+"'");

                    while(resultSet1.next()){
                        textField4.setText(resultSet1.getString("availability"));
                        textField5.setText(resultSet1.getString("cleaning_status"));
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        setLayout(null);
        setSize(950,450);
        setLocation(300,200);
        setVisible(true);
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new updateroom();
    }
}
