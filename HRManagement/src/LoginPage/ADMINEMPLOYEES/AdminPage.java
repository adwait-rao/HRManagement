package LoginPage.ADMINEMPLOYEES;

//import com.managementhr.loginPrompt;

import LoginPage.Admin_Employee_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.*;
import java.util.Vector;

public class AdminPage implements ActionListener {

    ImageIcon pfp = new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/blankpfp.png");
    JFrame window = new JFrame("Admin Dashboard");
    JPanel leftpanel = new JPanel();
    JPanel toppanel = new JPanel();
    JPanel centerpanel = new JPanel();
    JButton addEmp = new JButton("Add Employee");
    JButton Submit = new JButton("Submit");
    JButton remEmp = new JButton("Remove Employee");
    JButton viewEmp = new JButton("View Employee");
    JButton aboutInfo = new JButton("About Admin");
    JButton logout = new JButton("Log Out");
    String a;
    JLabel name = new JLabel();
    JLabel ID = new JLabel();
    JLabel JoinedDate = new JLabel();
    JLabel Role = new JLabel();
    JLabel Sal = new JLabel();
    JLabel ConNo = new JLabel();
    JLabel a1;
    JLabel a2;
    JLabel a3;
    JLabel a4;
    JLabel a5;
    JTextField name1;
    JTextField joindate;
    JTextField role1;
    JTextField age1;
    JTextField sal1;
    JTextField password;
    JTextField quali;
    JTextField contact;
    String AdminCsvPath = "HRManagement/src/LoginPage/ADMINEMPLOYEES/csvs/Admins.csv";

    public AdminPage(String AdminName,int b) {
        a = AdminName;
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
        addEmp.addActionListener(this);
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
        if(b==1){

            addcentralpanel();
        }else{
            addemployee();
        }


        leftpanel.add(addEmp);
        leftpanel.add(remEmp);
        leftpanel.add(viewEmp);
        leftpanel.add(aboutInfo);

        toppanel.add(name);
        toppanel.add(logout);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPage("Heramb Bhoodhar",1);
    }
    //central panel add function
    // ---------------------------------------------CENTRAL PANEL ADDDING ------------------------------------------------
    public void addcentralpanel()
    {
        centerpanel.add(ID);
        centerpanel.add(JoinedDate);
        centerpanel.add(Role);
        centerpanel.add(Sal);
        centerpanel.add(ConNo);
        centerpanel.add(a1);
        centerpanel.add(a2);
        centerpanel.add(a3);
        centerpanel.add(a4);
        centerpanel.add(a5);
    }
    //setting lables
    // ---------------------------------------------ABOUT ADMIN ------------------------------------------------
    public void setLabels(String uname, String uid, String ujdate,String role,String sal,String con)
    {
        // ****Name***** */
        a1 = new JLabel(uid);
        a1.setFont(new Font("Roboto", Font.BOLD ,25));
        a1.setBounds(370, 100, 350, 30);

         a2 = new JLabel(ujdate);
        a2.setFont(new Font("Roboto", Font.BOLD ,25));
        a2.setBounds(370, 170, 350, 30);

         a3 = new JLabel(role);
        a3.setFont(new Font("Roboto", Font.BOLD, 25));
        a3.setBounds(370, 230, 750, 50);

         a4 = new JLabel(sal);
        a4.setFont(new Font("Roboto", Font.BOLD, 25));
        a4.setBounds(370, 300, 750, 50);

         a5 = new JLabel(con);
        a5.setFont(new Font("Roboto", Font.BOLD, 25));
        a5.setBounds(370, 370, 750, 50);


       // centerpanel.removeAll();
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
    // ---------------------------------------------FILE HANDLING------------------------------------------------
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
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Admin User not found!");
        }

    }
    // ---------------------------------------------EMPLOYEEE ADDDITION------------------------------------------------
    public void addemployee()
    {
        ID.setText("Full Name :- ");
        ID.setBounds(10, 50, 350, 30);
        ID.setFont(new Font("Roboto", Font.BOLD ,20));
        name1 = new JTextField();
        name1.setBounds(180, 50, 300, 30);
        JoinedDate.setText("Joining Date :- ");
        JoinedDate.setBounds(10, 120, 350, 30);
        JoinedDate.setFont(new Font("Roboto", Font.BOLD ,20));
        joindate = new JTextField();
        joindate.setBounds(180, 120, 300, 30);

        Role.setText("Role :- " );
        Role.setFont(new Font("Roboto", Font.BOLD, 20));
        Role.setBounds(40, 180, 350, 50);
        role1 = new JTextField();
        role1.setBounds(180, 190, 300, 30);

        a1 = new JLabel("Age :- ");
        a1.setFont(new Font("Roboto", Font.BOLD ,20));
        a1.setBounds(40, 260, 350, 30);
        age1= new JTextField();
        age1.setBounds(180, 260, 300, 30);

        Sal.setText("Salary :- ");
        Sal.setFont(new Font("Roboto", Font.BOLD, 20));
        Sal.setBounds(40, 320, 350, 50);
        sal1= new JTextField();
        sal1.setBounds(180, 330, 300, 30);

        ConNo.setText("Password :- ");
        ConNo.setFont(new Font("Roboto", Font.BOLD, 20));
        ConNo.setBounds(5, 390, 350, 50);
        password = new JTextField();
        password.setBounds(180, 400, 300, 30);

        a2 = new JLabel("Qualtifications :-" );
        a2.setFont(new Font("Roboto", Font.BOLD ,20));
        a2.setBounds(520, 50, 350, 30);
        quali = new JTextField();
        quali.setBounds(700, 50, 300, 30);

        a3 = new JLabel("Contact No :-" );
        a3.setFont(new Font("Roboto", Font.BOLD ,20));
        a3.setBounds(540, 120, 350, 30);
        contact = new JTextField();
        contact.setBounds(700, 120, 300, 30);

        Submit.setText("SUBMIT");
        Submit.setFocusable(false);
        Submit.setForeground(Color.BLACK);
        Submit.setBackground(new Color(228, 240, 65));
        Submit.setFont(new Font("Roboto", Font.BOLD ,17));
        Submit.addActionListener(this);
        Submit.setBounds(480, 480, 150, 50);

        centerpanel.add(ID);
        centerpanel.add(name1);
        centerpanel.add(JoinedDate);
        centerpanel.add(joindate);
        centerpanel.add(Role);
        centerpanel.add(role1);
        centerpanel.add(a1);
        centerpanel.add(age1);
        centerpanel.add(Sal);
        centerpanel.add(sal1);
        centerpanel.add(ConNo);
        centerpanel.add(password);
        centerpanel.add(a2);
        centerpanel.add(quali);
        centerpanel.add(a3);
        centerpanel.add(contact);
        centerpanel.add(Submit);
    }
    //----------------------------------------------EMPLOYEE STORAGE-----------------------------------------------
    void employeedatastorage()
    {

    }
    // ---------------------------------------------ACTION PERFORMED -----------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            window.dispose();
            new Admin_Employee_login();
        }
        if(e.getSource() == addEmp)
        {
            window.dispose();
            new AdminPage(a,2);
        }
        if(e.getSource() == Submit)
        {
            Vector<String> a1 = new Vector<>();
            if
            (
            name1.getText().equals("")||joindate.getText().equals("")
            ||role1.getText().equals("")||age1.getText().equals("")
            ||sal1.getText().equals("")||password.getText().equals("")
            ||quali.getText().equals("") ||contact.getText().equals("")
            )
            {
                JOptionPane.showMessageDialog(null, " TEXT FIELD CANNOT BE EMPTY", "ENTER DATA",
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                int a = JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Submit This Data?" ,"ADMIN LOGIN",JOptionPane.YES_NO_OPTION);

                if(a==0)
                {
                    employeedatastorage();
                }
            }


        }
    }
}
