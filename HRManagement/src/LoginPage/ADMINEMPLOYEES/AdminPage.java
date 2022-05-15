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
    JLabel Role = new JLabel();
    JLabel Sal = new JLabel();
    JLabel ConNo = new JLabel();
    String AdminCsvPath = "HRManagement/src/LoginPage/ADMINEMPLOYEES/csvs/Admins.csv";
    String AdminNameGlobal;

    public AdminPage(String AdminName) {

        AdminNameGlobal = AdminName;

        // window
        window.getContentPane().setBackground(Color.white);
        window.setSize(1280, 700);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // leftpanel
        leftpanel.setBackground(Color.DARK_GRAY);
        leftpanel.setPreferredSize(new Dimension(250, 100));
        leftpanel.setLayout(new GridLayout(8, 1));

        // toppanel
        toppanel.setBackground(Color.black);
        toppanel.setPreferredSize(new Dimension(250, 100));
        toppanel.setLayout(null);

        // centerpanel
        centerpanel.setBackground(Color.white);
        centerpanel.setLayout(null);

        // add employee
        addEmp.setContentAreaFilled(false);
        addEmp.setBorderPainted(true);
        addEmp.setFocusPainted(true);
        addEmp.setFocusable(false);
        addEmp.setOpaque(false);
        addEmp.setForeground(Color.WHITE);
        addEmp.setFont(new Font("Roboto", Font.BOLD ,17));

        // remove employee
        remEmp.setContentAreaFilled(false);
        remEmp.setBorderPainted(true);
        remEmp.setFocusPainted(true);
        remEmp.setFocusable(false);
        remEmp.setOpaque(false);
        remEmp.setForeground(Color.WHITE);
        remEmp.setFont(new Font("Roboto", Font.BOLD ,17));

        // view employee
        viewEmp.setContentAreaFilled(false);
        viewEmp.setBorderPainted(true);
        viewEmp.setFocusPainted(true);
        viewEmp.setFocusable(false);
        viewEmp.setOpaque(false);
        viewEmp.setForeground(Color.WHITE);
        viewEmp.setFont(new Font("Roboto", Font.BOLD ,17));

        // aboutInfo
        aboutInfo.setContentAreaFilled(false);
        aboutInfo.setBorderPainted(true);
        aboutInfo.setFocusPainted(true);
        aboutInfo.setFocusable(false);
        aboutInfo.setOpaque(false);
        aboutInfo.setForeground(Color.WHITE);
        aboutInfo.setFont(new Font("Roboto", Font.BOLD ,17));
        aboutInfo.addActionListener(this);

        // logout button
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
        centerpanel.add(Role);
        centerpanel.add(Sal);
        centerpanel.add(ConNo);

        leftpanel.add(addEmp);
        leftpanel.add(remEmp);
        leftpanel.add(viewEmp);
        leftpanel.add(aboutInfo);

        toppanel.add(name);
        toppanel.add(logout);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage("Heramb Bhoodhar");
    }

    public void setLabels(String uname, String uid, String ujdate,String role,String sal,String con) {

        // ****Name***** */
        JLabel a1 = new JLabel(uid);
        a1.setFont(new Font("Roboto", Font.BOLD ,25));
        a1.setBounds(370, 100, 350, 30);

        JLabel a2 = new JLabel(ujdate);
        a2.setFont(new Font("Roboto", Font.BOLD ,25));
        a2.setBounds(370, 170, 350, 30);

        JLabel a3 = new JLabel(role);
        a3.setFont(new Font("Roboto", Font.BOLD, 25));
        a3.setBounds(370, 230, 750, 50);

        JLabel a4 = new JLabel(sal);
        a4.setFont(new Font("Roboto", Font.BOLD, 25));
        a4.setBounds(370, 300, 750, 50);

        JLabel a5 = new JLabel(con);
        a5.setFont(new Font("Roboto", Font.BOLD, 25));
        a5.setBounds(370, 370, 750, 50);

        centerpanel.add(a1);
        centerpanel.add(a2);
        centerpanel.add(a3);
        centerpanel.add(a4);
        centerpanel.add(a5);

        name.setText(uname);
        name.setIcon(pfp);
        name.setFont(new Font("Noto Sans", Font.BOLD, 30));
        name.setHorizontalTextPosition(JLabel.RIGHT);
        name.setForeground(Color.WHITE);
        name.setBounds(0, 0, 600, 100);

        ID.setText("ID : ");
        ID.setFont(new Font("Roboto", Font.BOLD ,25));
        ID.setBounds(100, 100, 350, 30);

        JoinedDate.setText("Joined Date : ");
        JoinedDate.setFont(new Font("Roboto", Font.BOLD, 25));
        JoinedDate.setBounds(100, 170, 350, 30);

        Role.setText("Role : " );
        Role.setFont(new Font("Roboto", Font.BOLD, 25));
        Role.setBounds(100, 230, 350, 50);

        Sal.setText("Salary : ");
        Sal.setFont(new Font("Roboto", Font.BOLD, 25));
        Sal.setBounds(100, 300, 350, 50);

        ConNo.setText("Contact No : ");
        ConNo.setFont(new Font("Roboto", Font.BOLD, 25));
        ConNo.setBounds(100, 370, 350, 50);
    }

    public void showinfo(String searchTerm, String csvPath) {
        boolean found = false;
        String uid = "", uname = "", ujdate = "",role = " ",sal=" ",con= " ";

        try {
            Scanner in = new Scanner(new File(csvPath));
            in.useDelimiter("[,\n]");

            while (in.hasNext() && !found) {
                uname = in.next();
                uid = in.next();
                ujdate = in.next();
                role = in.next();
                sal = in.next();
                con = in.next();
                if (uname.equals(searchTerm)) {
                    found = true;
                }
            }

            if (found) {
                setLabels(uname, uid, ujdate , role, sal , con);
            } else {
                throw new Exception("Admin User Not Found!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            window.dispose();
            new Admin_Employee_login();
        }

        if (e.getSource() == aboutInfo) 
        {
            showinfo(AdminNameGlobal, AdminCsvPath);
            
        }


    }
}
