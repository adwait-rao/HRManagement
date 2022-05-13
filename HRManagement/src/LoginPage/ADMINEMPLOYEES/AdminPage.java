package LoginPage.ADMINEMPLOYEES;

//import com.managementhr.loginPrompt;

import LoginPage.Admin_Employee_login;

import javax.swing.*;                               
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.*;

public class AdminPage implements ActionListener {

    ImageIcon pfp = new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/blankpfp.png");
    JFrame window = new JFrame("Admin Dashboard");
    JPanel leftpanel = new JPanel();
    JPanel toppanel = new JPanel();
    JPanel centerpanel = new JPanel();
    JButton addEmp = new JButton("Add Employee");
    JButton remEmp = new JButton("Remove Employee");
    JButton viewEmp = new JButton("View Employee");
    JButton aboutInfo = new JButton("About Admin");
    JButton logout = new JButton("Log Out");

    JLabel name = new JLabel();
    JLabel ID = new JLabel();
    JLabel JoinedDate = new JLabel();

    String AdminCsvPath = "HRManagement/src/LoginPage/ADMINEMPLOYEES/csvs/Admins.csv";

    public AdminPage(String AdminName) {

        
        //window
        window.getContentPane().setBackground(Color.white);
        window.setSize(1280, 700);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //leftpanel
        leftpanel.setBackground(Color.DARK_GRAY);
        leftpanel.setPreferredSize(new Dimension(250, 100));
        leftpanel.setLayout(new GridLayout(8, 1));
        
        
        //toppanel
        toppanel.setBackground(Color.black);
        toppanel.setPreferredSize(new Dimension(250, 100));
        toppanel.setLayout(null);

        
        //centerpanel
        centerpanel.setBackground(Color.white);
        centerpanel.setLayout(null);

        
        //add employee
        addEmp.setContentAreaFilled(false); 
        addEmp.setBorderPainted(true);
        addEmp.setFocusPainted(true); 
        addEmp.setFocusable(false);
        addEmp.setOpaque(false);
        addEmp.setForeground(Color.WHITE);
        
        
        //remove employee
        remEmp.setContentAreaFilled(false); 
        remEmp.setBorderPainted(true);
        remEmp.setFocusPainted(true); 
        remEmp.setFocusable(false);
        remEmp.setOpaque(false);
        remEmp.setForeground(Color.WHITE);

        
        //view employee
        viewEmp.setContentAreaFilled(false); 
        viewEmp.setBorderPainted(true);
        viewEmp.setFocusPainted(true); 
        viewEmp.setFocusable(false);
        viewEmp.setOpaque(false);
        viewEmp.setForeground(Color.WHITE);

        //aboutInfo
        aboutInfo.setContentAreaFilled(false); 
        aboutInfo.setBorderPainted(true);
        aboutInfo.setFocusPainted(true); 
        aboutInfo.setFocusable(false);
        aboutInfo.setOpaque(false);
        aboutInfo.setForeground(Color.WHITE);
        
        //logout button
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(true);
        logout.setFocusPainted(true); 
        logout.setFocusable(false);
        logout.setOpaque(false);
        logout.setForeground(Color.WHITE);
        logout.setBounds(1100, 35, 150, 30);
        logout.setIcon(new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/logoutico.png"));
        logout.addActionListener(this);
        

        window.add(toppanel, BorderLayout.NORTH);
        window.add(leftpanel, BorderLayout.WEST);
        window.add(centerpanel, BorderLayout.CENTER);
        
        showinfo(AdminName, AdminCsvPath);

        centerpanel.add(ID);
        centerpanel.add(JoinedDate);

        leftpanel.add(addEmp);
        leftpanel.add(remEmp);
        leftpanel.add(viewEmp);
        leftpanel.add(aboutInfo);

        toppanel.add(name);
        toppanel.add(logout);
        
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage("Dnyaneshwari Landge");
    }

    public void setLabels(String uname, String uid, String ujdate) {

        //****Name***** */
        name.setText(uname);
        name.setIcon(pfp);
        name.setFont(new Font("Roboto", Font.PLAIN, 30));
        name.setHorizontalTextPosition(JLabel.RIGHT);
        name.setForeground(Color.WHITE);
        name.setBounds(0, 0, 600, 100);

        ID.setText(uid);
        ID.setFont(new Font("Roboto", Font.PLAIN, 15));
        ID.setBounds(100, 100, 350, 30);

        JoinedDate.setText(ujdate);
        JoinedDate.setFont(new Font("Roboto", Font.PLAIN, 15));
        JoinedDate.setBounds(100, 140, 350, 30);
    }

    public void showinfo(String searchTerm, String csvPath) {
        boolean found = false;
        String uid = "", uname = "", ujdate = "";

        try {
            Scanner in = new Scanner(new File(csvPath));
            in.useDelimiter("[,\n]");
            
            while(in.hasNext() && !found) {
                uname = in.next();
                uid = in.next();
                ujdate = in.next();

                if(uname.equals(searchTerm)) {
                    found = true;
                }
            }

            if(found) {
                setLabels(uname, uid, ujdate);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Admin User not found!");
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logout) {
            window.dispose();
            new Admin_Employee_login();
        }
    }
}
