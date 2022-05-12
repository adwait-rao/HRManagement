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
        name.setHorizontalTextPosition(JLabel.RIGHT);
        name.setForeground(Color.WHITE);

        JPanel leftpanel = new JPanel();
        leftpanel.setBackground(Color.DARK_GRAY);
        leftpanel.setPreferredSize(new Dimension(250, 100));
        leftpanel.setLayout(new GridLayout(8, 1));

        JPanel toppanel = new JPanel();
        toppanel.setBackground(Color.black);
        toppanel.setPreferredSize(new Dimension(250, 100));
        toppanel.setLayout(new GridLayout(1, 2));

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


        window.add(toppanel, BorderLayout.NORTH);
        window.add(leftpanel, BorderLayout.WEST);
        
        leftpanel.add(addEmp);
        leftpanel.add(remEmp);
        toppanel.add(name);
        

        window.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage();
    }
}
