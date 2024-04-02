package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adddriver extends JFrame implements ActionListener {

    JTextField nametext , agetext , carctext , carntext , locationtext , emailtext;
    JComboBox comboBox , comboBox1;
    JButton add,back;

    Adddriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,890,490);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        add(panel1);

        JLabel l1 = new JLabel("ADD DRIVERS");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Raleway", Font.BOLD , 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,70,102,22);
        name.setFont(new Font("serif" , Font.BOLD,14));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nametext = new JTextField();
        nametext.setBounds(230,70,156,20);
        nametext.setBackground(new Color(16,108,115));
        nametext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        nametext.setForeground(Color.WHITE);
        panel.add(nametext);


        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("serif" , Font.BOLD,14));
        age.setForeground(Color.WHITE);
        panel.add(age);

        agetext = new JTextField();
        agetext.setBounds(230,110,156,20);
        agetext.setBackground(new Color(16,108,115));
        agetext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        agetext.setForeground(Color.WHITE);
        panel.add(agetext);


        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("serif" , Font.BOLD,14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

       comboBox = new JComboBox(new String[]{"Male" , "Female"});
       comboBox.setBounds(230,150,154,20);
       comboBox.setForeground(Color.WHITE);
       comboBox.setBackground(new Color(16,108,115));
       comboBox.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        panel.add(comboBox);

        JLabel carc = new JLabel("CAR's COMPANY");
        carc.setBounds(64,190,125,22);
        carc.setFont(new Font("serif" , Font.BOLD,14));
        carc.setForeground(Color.WHITE);
        panel.add(carc);

        carctext = new JTextField();
        carctext.setBounds(230,190,156,20);
        carctext.setBackground(new Color(16,108,115));
        carctext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        carctext.setForeground(Color.WHITE);
        panel.add(carctext);

        JLabel carn = new JLabel("CAR's NAME");
        carn.setBounds(64,230,102,22);
        carn.setFont(new Font("serif" , Font.BOLD,14));
        carn.setForeground(Color.WHITE);
        panel.add(carn);

        carntext = new JTextField();
        carntext.setBounds(230,230,156,20);
        carntext.setBackground(new Color(16,108,115));
        carntext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        carntext.setForeground(Color.WHITE);
        panel.add(carntext);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64,270,102,22);
        available.setFont(new Font("serif" , Font.BOLD,14));
        available.setForeground(Color.WHITE);
        panel.add(available);

        comboBox1 = new JComboBox(new String[]{"YES" , "NO"});
        comboBox1.setBounds(230,270,154,20);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setBackground(new Color(16,108,115));
        comboBox1.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        panel.add(comboBox1);

        JLabel location = new JLabel("LOCATION");
        location.setBounds(64,310,102,22);
        location.setFont(new Font("serif" , Font.BOLD,14));
        location.setForeground(Color.WHITE);
        panel.add(location);

        locationtext = new JTextField();
        locationtext.setBounds(230,310,156,20);
        locationtext.setBackground(new Color(16,108,115));
        locationtext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        locationtext.setForeground(Color.WHITE);
        panel.add(locationtext);


        add = new JButton("ADD");
        add.setBounds(74,380,100,30);
        add.setBackground(Color.BLACK);
        add.setBackground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(220,380,100,30);
        back.setBackground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


//        setUndecorated(true);
        setSize(900,500);
        setVisible(true);
        setLayout(null);
        setLocation(200,160);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            try{

            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource()==back) {
            new admin();
        }

    }

    public static void main(String[] args) {
        new Adddriver();
    }
}
