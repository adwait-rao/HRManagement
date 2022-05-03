package com.managementhr;

import javax.swing.*;
import java.awt.*;

public class loginPrompt {
    loginPrompt() {
        JLabel label1 = new JLabel();
        label1.setText("Username: ");
        label1.setFont(new Font("Roboto", Font.PLAIN, 20));
        label1.setForeground(new Color(0xFFFFFF));
        // label1.setVerticalAlignment(JLabel.CENTER);
        // label1.setHorizontalAlignment(JLabel.CENTER);

        JFrame lframe = new JFrame();

        lframe.setVisible(true);
        //lframe.getContentPane();
        //lframe.setBackground(Color.BLACK);
        lframe.getContentPane().setBackground(new Color(123, 50, 250));
        lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lframe.setTitle("HR Management Login");
        lframe.setSize(420, 420);
        lframe.setResizable(true);
        lframe.setLayout(new FlowLayout());

        //lframe.setLayout(null);


        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(250,40));


        //add component
        lframe.add(label1);
        lframe.add(text);
    }
}
