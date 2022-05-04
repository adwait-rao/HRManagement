package com.managementhr;

import javax.swing.*;
import java.awt.*;

public class loginPrompt {
    JPasswordField passwd = new JPasswordField();
    public loginPrompt() {
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        label2.setText("Password: ");
        JLabel labeltitle = new JLabel("Admin Login");
        labeltitle.setFont(new Font("Roboto",Font.BOLD,30));
        labeltitle.setVisible(true);
        labeltitle.setBounds(220, 0, 180, 80);
        labeltitle.setForeground(Color.WHITE);
        label1.setText("Username: ");
        label1.setFont(new Font("Roboto", Font.PLAIN, 20));


        label1.setForeground(new Color(0xFFFFFF));
        label1.setBounds(170,180,180,80);
//        label1.setVerticalAlignment(JLabel.CENTER);
//        label1.setHorizontalAlignment(JLabel.CENTER);

        label2.setForeground(new Color(0xFFFFFF));
        label2.setBounds(170, 260, 180, 80);
        label2.setFont(new Font("Roboto", Font.PLAIN, 20));

        JFrame frame = new JFrame();

        frame.setVisible(true);
        //lframe.getContentPane();
        //lframe.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(600, 600);
        frame.setResizable(true);
        frame.setLayout(null);

        //lframe.setLayout(null);
        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(200,30));
        text.setBounds(280,200,180,40);


        //passwordfield
        passwd.setBounds(280,280,180,40);

        //add component
        frame.add(labeltitle);
        frame.add(label1);
        frame.add(label2);
        frame.add(passwd);
        frame.add(text);
    }
}
