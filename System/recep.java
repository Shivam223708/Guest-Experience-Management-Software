import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public static class recep extends  JFrame{
    public recep(){

        setSize(1530,1090);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(280,5,1234,820);
        panel2.setBackground(new Color(3,45,48));
        add(panel2);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        JPanel panel3= new JPanel();
        panel3.setBounds(0,5,10,820);
        panel3.setBackground(Color.WHITE);
        panel2.add(panel3);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//recept.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(250,250 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(450,400,250,250);
        panel2.add(label1);


        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("Hotel_Management//icon//loginn.gif"));
        Image i2 = imageIcon2.getImage().getScaledInstance(250,250 , Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon3);
        label2.setBounds(5,530,250,250);
        panel1.add(label2);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnroom = new JButton("ROOM");
        btnroom.setBounds(30,75,200,30);
        btnroom.setBackground(Color.BLACK);
        btnroom.setForeground(Color.WHITE);
        panel1.add(btnroom);
        btnroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton btndepartment = new JButton("DEPARTMENT");
        btndepartment.setBounds(30,120,200,30);
        btndepartment.setBackground(Color.BLACK);
        btndepartment.setForeground(Color.WHITE);
        panel1.add(btndepartment);
        btndepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnallemployee = new JButton("ALL EMPLOYEE");
        btnallemployee.setBounds(30,165,200,30);
        btnallemployee.setBackground(Color.BLACK);
        btnallemployee.setForeground(Color.WHITE);
        panel1.add(btnallemployee);
        btnallemployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnCI = new JButton("CUSTOMER INFO");
        btnCI.setBounds(30,210,200,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnMI = new JButton("MANAGER INFO");
        btnMI.setBounds(30,255,200,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnCO = new JButton("CHECK OUT");
        btnCO.setBounds(30,300,200,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnUCD = new JButton("UPDATE CHECK-IN DETAILS");
        btnUCD.setBounds(30,345,200,30);
        btnUCD.setBackground(Color.BLACK);
        btnUCD.setForeground(Color.WHITE);
        panel1.add(btnUCD);
        btnUCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnURS = new JButton("UPDATE ROOM STATUS");
        btnURS.setBounds(30,390,200,30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnPS = new JButton("PICKUP SERVICE");
        btnPS.setBounds(30,435,200,30);
        btnPS.setBackground(Color.BLACK);
        btnPS.setForeground(Color.WHITE);
        panel1.add(btnPS);
        btnPS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnSR = new JButton("SEARCH ROOM");
        btnSR.setBounds(30,480,200,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
public static void main(String[] args) {
    new recep();

}
