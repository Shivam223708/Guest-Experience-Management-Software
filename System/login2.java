package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login2 extends JFrame implements ActionListener {

    JTextField nametextfield ;
    JTextField passwordtextfield;
    JButton login,cancel;

    login2(){

        JLabel name = new JLabel("Username");
        name.setBounds(40,20,100,30);
        name.setFont(new Font("Tahoma" ,Font.BOLD,18));
        name.setForeground(Color.white);
        add(name);

        nametextfield = new JTextField();
        nametextfield.setBounds(150,20,150,30);
        nametextfield.setForeground(Color.WHITE);
        nametextfield.setFont(new Font("Raleway",Font.PLAIN,15));
        nametextfield.setBackground(new Color(3,45,48));
        add(nametextfield);


        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        password.setFont(new Font("Tahoma" ,Font.BOLD,18));
        password.setForeground(Color.white);
        add(password);

        passwordtextfield = new JPasswordField();
        passwordtextfield.setBounds(150,70,150,30);
        passwordtextfield.setFont(new Font("Raleway",Font.PLAIN,18));
        passwordtextfield.setForeground(Color.white);
        passwordtextfield.setBackground(new Color(3,45,48));
        add(passwordtextfield);


        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setFont(new Font("serif",Font.BOLD,15));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);


        cancel = new JButton("Cancel");
        cancel.setBounds(181,140,120,30);
        cancel.setFont(new Font("serif",Font.BOLD,15));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//loginn.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(210,250,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(320,14,210,280);
        add(label);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            try {
                connection1 c = new connection1();
                String user = nametextfield.getText();
                String pass = passwordtextfield.getText();

                String q = "select * from login2 where username = '"+user+"' and password = '"+pass+"' ";
                ResultSet rs = c.statement.executeQuery(q);
                if(rs.next()){
                    new admin();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong Credentials");
                    setVisible(false);
                    System.exit(102);
                }

            }

            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource() == cancel){
            new dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new login2();
    }

}
