package com.managementhr;

import LoginPage.ADMINEMPLOYEES.EmployeePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;

public class loginPromptEmployee implements ActionListener {
    String path = "employeenamepass.csv";
    JPasswordField passwd = new JPasswordField();
    JTextField text = new JTextField();
    JButton loginButton = new JButton("Login");
    JFrame frame;

    public loginPromptEmployee() {
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        label2.setText("Password: ");
        JLabel labeltitle = new JLabel("Employee Login");
        labeltitle.setFont(new Font("Roboto", Font.BOLD, 30));
        labeltitle.setVisible(true);
        labeltitle.setBounds(200, 0, 250, 80);
        labeltitle.setForeground(Color.WHITE);
        label1.setText("Username: ");
        label1.setFont(new Font("Roboto", Font.PLAIN, 20));

        label1.setForeground(new Color(0xFFFFFF));
        label1.setBounds(170, 180, 180, 80);
        /*
         * label1.setVerticalAlignment(JLabel.CENTER);
         * label1.setHorizontalAlignment(JLabel.CENTER);
         */

        label2.setForeground(new Color(0xFFFFFF));
        label2.setBounds(170, 260, 180, 80);
        label2.setFont(new Font("Roboto", Font.PLAIN, 20));

        frame = new JFrame();

        frame.setVisible(true);
        // lframe.getContentPane();
        // lframe.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(123, 50, 90));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(600, 600);
        frame.setResizable(true);
        frame.setLayout(null);

        // lframe.setLayout(null);
        text = new JTextField();
        text.setPreferredSize(new Dimension(200, 30));
        text.setBounds(280, 210, 180, 25);
        text.setFont(new Font("Roboto", Font.BOLD, 18));

        // passwordfield
        passwd.setBounds(280, 290, 180, 25);

        // login button
        loginButton.setBounds(260, 380, 100, 40);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Roboto", Font.BOLD, 18));
        loginButton.setForeground(Color.BLACK);
        loginButton.addActionListener(this);

        // add component
        frame.add(loginButton);
        frame.add(labeltitle);
        frame.add(label1);
        frame.add(label2);
        frame.add(passwd);
        frame.add(text);
    }

    // private void search(String uname, String pass)
    // {
    // int i = 0;
    // String uname1 = "", pass1 = "";
    //
    // try {
    // Scanner in = new Scanner(new File(path));
    // in.useDelimiter("[,\n]");
    // // JOptionPane.showMessageDialog(null, uname);
    // // JOptionPane.showMessageDialog(null, pass);
    // while (in.hasNext()) {
    // uname1 = in.next();
    // pass1 = in.next();
    // // JOptionPane.showMessageDialog(null, uname1);
    // // JOptionPane.showMessageDialog(null, pass1);
    // if (uname.equals(uname1) && pass.equals(pass1))
    // {
    // JOptionPane.showMessageDialog(null, uname);
    // i =1;
    // frame.dispose();
    // new EmployeePage(uname,pass);
    // }
    // ;
    // }
    // } catch (Exception g) {
    // JOptionPane.showMessageDialog(null, g);
    //
    // }
    // if(i==0)
    // {
    // JOptionPane.showMessageDialog(null, uname, "Enter Correct Username/Password",
    // JOptionPane.ERROR_MESSAGE);
    // }
    //
    // }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = text.getText();
            String password = String.valueOf(passwd.getPassword());
            // search(username,password);
            String uname1 = "", pass1 = "";

            try {
                Scanner in = new Scanner(new File(path));
                in.useDelimiter("[,\n]");

                while (in.hasNext()) {
                    uname1 = in.next();
                    pass1 = in.next();

                    if (username.equals(uname1) && password.equals(pass1)) {

                        // i =1;
                        frame.dispose();
                        new EmployeePage(username, password);
                    }
                }
            } catch (Exception g) {
                JOptionPane.showMessageDialog(null, g);

            }
        }
    }

}
