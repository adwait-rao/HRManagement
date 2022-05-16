package LoginPage.ADMINEMPLOYEES;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class EmployeePage {
    ImageIcon pfp = new ImageIcon("HRManagement/src/LoginPage/ADMINEMPLOYEES/images/blankpfp.png");
    JFrame window = new JFrame("Employee DashBoard");
    JPanel toppanel = new JPanel();
    JPanel leftpanel = new JPanel();
    // JPanel rightpanel = new JPanel();
    JPanel centerpanel = new JPanel();
    JLabel name = new JLabel();
    String path = "employees.csv";

    JLabel JoinedDate = new JLabel();
    JLabel Role = new JLabel();
    JLabel Sal = new JLabel();
    JLabel ConNo = new JLabel();
    JLabel quali = new JLabel();
    JLabel age = new JLabel();

    public EmployeePage(String uname, String pass) {
        // name.setText("Heramb Bhoodhar");
        name.setIcon(pfp);
        name.setFont(new Font("Noto Sans", Font.BOLD, 30));
        name.setHorizontalTextPosition(JLabel.RIGHT);

        name.setForeground(Color.BLACK);
        name.setBounds(0, 0, 600, 100);
        window.getContentPane().setBackground(Color.white);
        window.setSize(1280, 700);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search(uname, pass);
        toppanel.setBackground(new Color(124, 190, 207));
        toppanel.setPreferredSize(new Dimension(250, 100));
        toppanel.setLayout(null);

        leftpanel.setBackground(new Color(120, 171, 235));
        leftpanel.setPreferredSize(new Dimension(50, 250));
        leftpanel.setLayout(null);

        // rightpanel.setBackground(new Color(78, 245, 66));
        // rightpanel.setPreferredSize(new Dimension(50, 250));
        // rightpanel.setLayout(null);

        centerpanel.setBackground(Color.white);
        centerpanel.setLayout(null);

        window.add(toppanel, BorderLayout.NORTH);
        window.add(centerpanel, BorderLayout.CENTER);
        window.add(leftpanel, BorderLayout.WEST);
        // window.add(rightpanel, BorderLayout.EAST);
        toppanel.add(name);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeePage("Hi", "helo");
    }

    private void setlabels(String uname, String ujdate, String role, String sal, String con, String qual, String age1) {

        centerpanel.revalidate();
        centerpanel.repaint();
        centerpanel.removeAll();

        JLabel a2 = new JLabel(ujdate);
        a2.setFont(new Font("Roboto", Font.BOLD, 25));
        a2.setBounds(370, 100, 350, 30);

        JLabel a3 = new JLabel(role);
        a3.setFont(new Font("Roboto", Font.BOLD, 25));
        a3.setBounds(370, 170, 750, 50);

        JLabel a4 = new JLabel(age1);
        a4.setFont(new Font("Roboto", Font.BOLD, 25));
        a4.setBounds(370, 240, 750, 50);

        JLabel a7 = new JLabel(sal);
        a7.setFont(new Font("Roboto", Font.BOLD, 25));
        a7.setBounds(370, 310, 750, 50);

        JLabel a5 = new JLabel(con);
        a5.setFont(new Font("Roboto", Font.BOLD, 25));
        a5.setBounds(370, 370, 750, 50);

        JLabel a6 = new JLabel(qual);
        a6.setFont(new Font("Roboto", Font.BOLD, 25));
        a6.setBounds(370, 440, 750, 50);

        name.setText(uname);
        name.setIcon(pfp);
        name.setFont(new Font("Noto Sans", Font.BOLD, 30));
        name.setHorizontalTextPosition(JLabel.RIGHT);
        name.setForeground(Color.WHITE);
        name.setBounds(0, 0, 600, 100);

        JoinedDate.setText("Joined Date : ");
        JoinedDate.setFont(new Font("Roboto", Font.BOLD, 25));
        JoinedDate.setBounds(100, 100, 350, 30);

        Role.setText("Role : ");
        Role.setFont(new Font("Roboto", Font.BOLD, 25));
        Role.setBounds(100, 170, 350, 50);

        age.setText("Age : ");
        age.setFont(new Font("Roboto", Font.BOLD, 25));
        age.setBounds(100, 240, 350, 50);

        Sal.setText("Salary : ");
        Sal.setFont(new Font("Roboto", Font.BOLD, 25));
        Sal.setBounds(100, 310, 350, 50);

        ConNo.setText("Contact No : ");
        ConNo.setFont(new Font("Roboto", Font.BOLD, 25));
        ConNo.setBounds(100, 380, 350, 50);

        quali.setText("Qualificcation : ");
        quali.setFont(new Font("Roboto", Font.BOLD, 25));
        quali.setBounds(100, 450, 350, 50);

        centerpanel.add(a2);
        centerpanel.add(a3);
        centerpanel.add(a4);
        centerpanel.add(a5);
        centerpanel.add(a6);
        centerpanel.add(a7);

        centerpanel.add(JoinedDate);
        centerpanel.add(Role);
        centerpanel.add(Sal);
        centerpanel.add(ConNo);
        centerpanel.add(quali);
        centerpanel.add(age);
    }

    private void search(String uname, String pass) {
        boolean found = false;
        String uname1 = "", pass1 = "", joindate = "", sal = "", age = "", contact = "", quali = "", role = "";

        try {
            Scanner in = new Scanner(new File(path));
            in.useDelimiter("[,\n]");

            while (in.hasNext() && !found) {
                uname1 = in.next();
                pass1 = in.next();
                joindate = in.next();
                sal = in.next();
                age = in.next();
                contact = in.next();
                quali = in.next();
                role = in.next();
                setlabels(uname1, joindate, sal, age, contact, quali, role);
                if (uname.equals(uname1)) {
                    found = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }
}
