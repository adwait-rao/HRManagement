package com.managementhr;

import LoginPage.ADMINEMPLOYEES.AdminPage;
// import LoginPage.ADMINEMPLOYEES.Adwait;
// import LoginPage.ADMINEMPLOYEES.Dnyaneshwari;
// import LoginPage.ADMINEMPLOYEES.Heramb;
import LoginPage.AdminAndEmployeeIDPASS.AdminIDPass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class loginPrompt implements ActionListener {
    JPasswordField passwd = new JPasswordField();
    JTextField text;
    JButton loginButton = new JButton("Login");
    JFrame frame;
    HashMap loginInfo = new HashMap<String, String>();

    public loginPrompt() {

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        label2.setText("Password: ");
        JLabel labeltitle = new JLabel("Admin Login");
        labeltitle.setFont(new Font("Roboto", Font.BOLD, 30));
        labeltitle.setVisible(true);
        labeltitle.setBounds(220, 0, 180, 80);
        labeltitle.setForeground(Color.WHITE);
        label1.setText("Username: ");
        label1.setFont(new Font("Roboto", Font.PLAIN, 20));

        label1.setForeground(new Color(0xFFFFFF));
        label1.setBounds(170, 180, 180, 80);
        // label1.setVerticalAlignment(JLabel.CENTER);
        // label1.setHorizontalAlignment(JLabel.CENTER);

        label2.setForeground(new Color(0xFFFFFF));
        label2.setBounds(170, 260, 180, 80);
        label2.setFont(new Font("Roboto", Font.PLAIN, 20));

        frame = new JFrame();

        frame.setVisible(true);
        // lframe.getContentPane();
        // lframe.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLayout(null);

        // lframe.setLayout(null);
        text = new JTextField();
        text.setPreferredSize(new Dimension(200, 30));
        text.setBounds(280, 210, 180, 25);
        text.setFont(new Font("Roboto", Font.BOLD, 15));
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userID = text.getText();
            String password = String.valueOf(passwd.getPassword());
            AdminIDPass a1 = new AdminIDPass();
            loginInfo = a1.getlogininfo();
            
            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                   /* if (userID.equals("Heramb")) {
                        new Heramb();
                        frame.dispose();
                    } else if (userID.equals("Adwait")) {
                        new Adwait();
                        frame.dispose();
                    } else {
                        new Dnyaneshwari();
                        frame.dispose();
                    }*/

                    new AdminPage(userID);
                    frame.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password ", "Enter Correct Password",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong ID ", "Enter Correct ID", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
