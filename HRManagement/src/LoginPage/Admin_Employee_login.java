package LoginPage;

import javax.swing.*;
import java.awt.*;

public class Admin_Employee_login {
    ImageIcon image = new ImageIcon("HLogo.png");
    public Admin_Employee_login()
    {
        // ----------------JLable ---------------------------
        JLabel label = new JLabel("HR Management Software");
        label.setBounds(200,0,400,150);
        label.setFont(new Font(null,Font.BOLD,30));
        label.setForeground(Color.BLACK);
        label.setIcon(image);
        // ----------------JLable ---------------------------

        // ----------------Buttons ---------------------------
        JButton admin = new JButton("Admin Login");
        JButton Employee = new JButton("Employee Login");
        admin.setBounds(300,250,200,50);
        Employee.setBounds(300,400,200,50);
        admin.setFocusable(false);
        Employee.setFocusable(false);
        admin.setFont(new Font("Comic Sans", Font.BOLD,18));
        Employee.setFont(new Font("Comic Sans", Font.BOLD,18));
        admin.setForeground(Color.BLACK);
        Employee.setForeground(Color.BLACK);
        admin.setBackground(Color.LIGHT_GRAY);
        Employee.setBackground(Color.LIGHT_GRAY);
        // ----------------Buttons ---------------------------

        // ----------------Frames---------------------------
        JFrame frame = new JFrame("HR MANAGEMENT ");
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.add(admin);
        frame.add(Employee);
        frame.add(label);

        // ----------------Frames ---------------------------
    }
    public void paint(Graphics g)
    {
        g.drawLine(220,20,400,80);
    }
}
