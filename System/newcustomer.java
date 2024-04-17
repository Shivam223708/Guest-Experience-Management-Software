package Hotel_Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class newcustomer extends JFrame implements ActionListener{

    JComboBox comboBox;
    JTextField numbertextfield , nametextfield , countrytextfield ,deposittextfield;
    JRadioButton male , female , others;
    Choice c1;
    JLabel date;
    JButton add,back;

    newcustomer() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//customer.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);


        JLabel labelname = new JLabel("New Customer Form");
        labelname.setBounds(72, 6, 260, 53);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(labelname);

        JLabel id = new JLabel("ID:");
        id.setBounds(35, 76, 30, 18);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(id);

        comboBox = new JComboBox(new String[] {"PASSPORT" , "AADHAR CARD" , "VOTER CARD" , "DRIVING LICENSE"});
        comboBox.setBounds(241,73,150,20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(comboBox);

        JLabel phno = new JLabel("Number:");
        phno.setBounds(35, 111, 150, 20);
        phno.setForeground(Color.WHITE);
        phno.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(phno);

        numbertextfield = new JTextField();
        numbertextfield.setBounds(241,151,150,20);
        numbertextfield.setBackground(new Color(3,45,48));
        numbertextfield.setForeground(Color.WHITE);
        panel.add(numbertextfield);

        JLabel name = new JLabel("Name:");
        name.setBounds(35, 151, 70, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        nametextfield = new JTextField();
        nametextfield.setBounds(241,111,150,20);
        nametextfield.setBackground(new Color(3,45,48));
        nametextfield.setForeground(Color.WHITE);
        panel.add(nametextfield);


        JLabel gender = new JLabel("Gender:");
        gender.setBounds(35, 191, 70, 20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        male = new JRadioButton("MALE");
        male.setBounds(220,194,70,20);
        male.setBackground(new Color(3,45,48));
        male.setFont(new Font("Tahoma" , Font.PLAIN , 14));
        male.setForeground(Color.WHITE);
        panel.add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(310,194,90,20);
        female.setBackground(new Color(3,45,48));
        female.setFont(new Font("Tahoma" , Font.PLAIN , 14));
        female.setForeground(Color.WHITE);
        panel.add(female);

        others = new JRadioButton("OTHERS");
        others.setBounds(400,194,90,20);
        others.setBackground(new Color(3,45,48));
        others.setFont(new Font("Tahoma" , Font.PLAIN , 14));
        others.setForeground(Color.WHITE);
        panel.add(others);

        JLabel country = new JLabel("Country :");
        country.setBounds(35, 231, 200, 20);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(country);

        countrytextfield = new JTextField();
        countrytextfield.setBounds(241,235,150,20);
        countrytextfield.setBackground(new Color(3,45,48));
        countrytextfield.setForeground(Color.WHITE);
        panel.add(countrytextfield);

        JLabel room = new JLabel("Allocated Room No. :");
        room.setBounds(35, 274, 160, 20);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        c1 = new Choice();
        try {
            connection1 c = new connection1();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("room_number"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        c1.setBounds(241,274,150,16);
        c1.setFont(new Font("Tahoma" , Font.PLAIN , 14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);


        JLabel checkin = new JLabel("Checked-In :");
        checkin.setBounds(35, 316, 160, 20);
        checkin.setForeground(Color.WHITE);
        checkin.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(checkin);

        Date date1 = new Date();

        date =  new JLabel(""+ date1);
        date.setBounds(241, 316, 200, 20);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(date);


        JLabel deposit = new JLabel("Deposited Amount :");
        deposit.setBounds(35, 359, 200, 20);
        deposit.setForeground(Color.WHITE);
        deposit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(deposit);

        deposittextfield = new JTextField();
        deposittextfield.setBounds(241,359,150,20);
        deposittextfield.setBackground(new Color(3,45,48));
        deposittextfield.setForeground(Color.WHITE);
        panel.add(deposittextfield);


        add = new JButton("ADD");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(100, 430, 90, 27);
        add.addActionListener(this);
        panel.add(add);


        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(260, 430, 90, 27);
        panel.add(back);
        back.addActionListener(this);

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
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }
            else if (female.isSelected()) {
                gender = "Female";
            }
            else if (others.isSelected()) {
                gender = "Others";
            }

            String s1 = (String)comboBox.getSelectedItem();
            String s2 = numbertextfield.getText();
            String s3 =nametextfield.getText();
            String s4 = gender;
            String s5 = countrytextfield.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = deposittextfield.getText();

            try{
                connection1 c = new connection1();
                String q = "insert into customer values('"+s1+"','"+s3+"','"+s2+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"') ";
                String q1 = "update room set availability = 'Occupied' where room_number = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null ,"Customer Added Successfully");
                new newcustomer();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==back){
            new reception();
        }

    }
    public static void main(String[] args) {
        new newcustomer();
    }

}
