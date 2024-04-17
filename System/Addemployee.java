package Hotel_Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addemployee extends JFrame implements ActionListener {

    JTextField nametext , agetext , salarytext , phonetext , aadhartext , emailtext;
        JRadioButton male,female;
        JComboBox jobcb;
        JButton add,back;

    Addemployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,875,490);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);
        add(panel1);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS ");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma" , Font.BOLD,31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);


        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif" , Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nametext = new JTextField();
        nametext.setBounds(200,30,150,27);
        nametext.setBackground(new Color(16,108,115));
        nametext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        nametext.setForeground(Color.WHITE);
        panel.add(nametext);


        JLabel age = new JLabel("AGE");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif" , Font.BOLD,17));
        age.setForeground(Color.WHITE);
        panel.add(age);

        agetext = new JTextField();
        agetext.setBounds(200,80,150,27);
        agetext.setBackground(new Color(16,108,115));
        agetext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        agetext.setForeground(Color.WHITE);
        panel.add(agetext);


        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,130,150,27);
        gender.setFont(new Font("serif" , Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        male = new JRadioButton("MALE");
        male.setBounds(200,130,70,27);
        male.setBackground(new Color(3,45,48));
        male.setFont(new Font("Tahoma" , Font.BOLD , 14));
        male.setForeground(Color.WHITE);
        panel.add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(290,130,90,27);
        female.setBackground(new Color(3,45,48));
        female.setFont(new Font("Tahoma" , Font.BOLD , 14));
        female.setForeground(Color.WHITE);
        panel.add(female);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,180,150,27);
        job.setFont(new Font("serif" , Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        jobcb = new JComboBox(new String[]{"Front Desk" , "House keeping" , "Kitchen Staff" , "Room Service" , "Manager" , "Accountant" , "Chef"});
        jobcb.setBackground(new Color(16,108,115));
        jobcb.setBounds(200,180,150,30);
        jobcb.setFont(new Font("Tahoma" , Font.BOLD , 14));
        jobcb.setForeground(Color.WHITE);
        panel.add(jobcb);


        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,230,150,27);
        salary.setFont(new Font("serif" , Font.BOLD,17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);

        salarytext = new JTextField();
        salarytext.setBounds(200,230,150,27);
        salarytext.setBackground(new Color(16,108,115));
        salarytext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        salarytext.setForeground(Color.WHITE);
        panel.add(salarytext);


        JLabel phone = new JLabel("PHONE NUM.");
        phone.setBounds(60,280,150,27);
        phone.setFont(new Font("serif" , Font.BOLD,17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);

        phonetext = new JTextField();
        phonetext.setBounds(200,280,150,27);
        phonetext.setBackground(new Color(16,108,115));
        phonetext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        phonetext.setForeground(Color.WHITE);
        panel.add(phonetext);

        JLabel aadhar = new JLabel("AADHAR NUM.");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif" , Font.BOLD,17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);

        aadhartext = new JTextField();
        aadhartext.setBounds(200,320,150,27);
        aadhartext.setBackground(new Color(16,108,115));
        aadhartext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        aadhartext.setForeground(Color.WHITE);
        panel.add(aadhartext);

        JLabel email = new JLabel("EMAIL ID");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif" , Font.BOLD,17));
        email.setForeground(Color.WHITE);
        panel.add(email);

        emailtext = new JTextField();
        emailtext.setBounds(200,370,150,27);
        emailtext.setBackground(new Color(16,108,115));
        emailtext.setFont(new Font("Tahoma" , Font.BOLD  ,14));
        emailtext.setForeground(Color.WHITE);
        panel.add(emailtext);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.BLACK);
        add.setBackground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(200,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name = nametext.getText();
            String age = agetext.getText();
            String salary =salarytext.getText();
            String phone = phonetext.getText();
            String aadhar = aadhartext.getText();
            String email = emailtext.getText();
            String job = (String) jobcb.getSelectedItem();
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }
            else if (female.isSelected()) {
                gender = "Female";
            }

            try{
                connection1 c = new connection1();
                String q = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"') ";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null ,"Employee Added");
                new Addemployee();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else if(e.getSource()==back){
            new admin();
        }

    }

    public static void main(String[] args) {
        new Addemployee();
    }
}
