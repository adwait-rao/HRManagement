package LoginPage.ADMINEMPLOYEES;

import javax.swing.*;
import java.awt.*;

public class AdminPage {

    public AdminPage() {

        JFrame window = new JFrame("Admin Dashboard");
        window.getContentPane().setBackground(Color.white);
        window.setSize(1280, 700);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon pfp = new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/blankpfp.png");
        
        JLabel name = new JLabel("Your Name");
        name.setIcon(pfp);
        name.setFont(new Font("Roboto", 10, 30));
        name.setHorizontalTextPosition(JLabel.RIGHT);
        name.setForeground(Color.WHITE);
        name.setBounds(0, 0, 350, 100);

        JPanel leftpanel = new JPanel();
        leftpanel.setBackground(Color.DARK_GRAY);
        leftpanel.setPreferredSize(new Dimension(250, 100));
        leftpanel.setLayout(new GridLayout(8, 1));
        
        JPanel toppanel = new JPanel();
        toppanel.setBackground(Color.black);
        toppanel.setPreferredSize(new Dimension(250, 100));
        //toppanel.setLayout(new GridLayout(1, 3, 20, 20));
        toppanel.setLayout(null);

        JButton addEmp = new JButton("Add Employee");
        addEmp.setContentAreaFilled(false); 
        addEmp.setBorderPainted(true);
        addEmp.setFocusPainted(true); 
        addEmp.setFocusable(false);
        addEmp.setOpaque(false);
        addEmp.setForeground(Color.WHITE);
        
        JButton remEmp = new JButton("Remove Employee");
        remEmp.setContentAreaFilled(false); 
        remEmp.setBorderPainted(true);
        remEmp.setFocusPainted(true); 
        remEmp.setFocusable(false);
        remEmp.setOpaque(false);
        remEmp.setForeground(Color.WHITE);

        JButton viewEmp = new JButton("View Employee");
        viewEmp.setContentAreaFilled(false); 
        viewEmp.setBorderPainted(true);
        viewEmp.setFocusPainted(true); 
        viewEmp.setFocusable(false);
        viewEmp.setOpaque(false);
        viewEmp.setForeground(Color.WHITE);

        JButton logout = new JButton("Log Out");
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(true);
        logout.setFocusPainted(true); 
        logout.setFocusable(false);
        logout.setOpaque(false);
        logout.setForeground(Color.WHITE);
        logout.setBounds(1100, 35, 150, 30);
        logout.setIcon(new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/logoutico.png"));
        
    

        window.add(toppanel, BorderLayout.NORTH);
        window.add(leftpanel, BorderLayout.WEST);
        
        //extra label to add space
        JLabel ext = new JLabel("Joined on 20");

        leftpanel.add(addEmp);
        leftpanel.add(remEmp);
        leftpanel.add(viewEmp);

        toppanel.add(name);
        toppanel.add(ext);
        toppanel.add(logout);
        
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage();
    }
}
