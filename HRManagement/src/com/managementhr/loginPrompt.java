package com.managementhr;

import javax.swing.*;
import java.awt.*;

public class loginPrompt {
    loginPrompt() {
        JLabel label1 = new JLabel();
        label1.setText("Username: ");
        label1.setFont(new Font("Roboto", Font.PLAIN, 20));
        label1.setForeground(new Color(0xFFFFFF));
        label1.setBounds(0,0,180,80);
        // label1.setVerticalAlignment(JLabel.CENTER);
        // label1.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();

        frame.setVisible(true);
        //lframe.getContentPane();
        //lframe.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(420, 420);
        frame.setResizable(true);
        frame.setLayout(null);

        //lframe.setLayout(null);


        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(250,40));
        text.setBounds(100,40,180,40);

        //add component
        frame.add(label1);
        frame.add(text);
    }
}
