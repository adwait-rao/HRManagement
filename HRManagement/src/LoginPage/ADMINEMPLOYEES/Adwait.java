package LoginPage.ADMINEMPLOYEES;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adwait implements ActionListener {
    JFrame frame;
    JPanel left;
    JPanel top;
    JLabel title1;

    public Adwait() {
        frame = new JFrame();

        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 232, 232));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(1550, 830);
        frame.setResizable(false);
        frame.setLayout(null);

        // --------------------------------------- Panels --------------------------------------------------------------
        left = new JPanel();
        left.setBackground(new Color(69, 65, 65));
        left.setBounds(0, 50, 200, 830);
        JLabel heading;
        heading = new JLabel();
        heading.setText("HR MANAGEMENT SYSTEM");
        heading.setFont(new Font("Noto Sans", Font.BOLD, 30));
        heading.setVisible(true);
        heading.setForeground(new Color(17, 17, 18));
        JButton button1 = new JButton("Add Employee");
        button1.addActionListener(this);
        button1.setBounds(1250,120,200,50);
        button1.setFocusable(false);
        button1.setFont(new Font("Comic Sans", Font.BOLD,18));
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color (3, 248, 252));
        heading.setBounds(450,0,750,50);
        // ImageIcon image = new ImageIcon("C:\\Java Project HR Management\\HRManagement\\HRManagement\\src\\LoginPage\\hrmgr2.png");

        //heading.setIcon(image);

        top = new JPanel();
        top.setBackground(Color.WHITE);
        top.setBounds(0, 0, 1550, 70);
        top.add(heading, BorderLayout.CENTER);
        //top.add(button1,BorderLayout.EAST);
        // LABELS (CENTER COMPONENTS)
        JLabel head;
        head = new JLabel();
        head.setText("ADMIN LOGIN");
        head.setFont(new Font("Noto Sans", Font.BOLD, 30));
        head.setVisible(true);
        head.setForeground(new Color(242, 250, 87));
        head.setBounds(750, 70, 250, 70);

        JLabel name;
        name = new JLabel();
        name.setText("NAME :- ");
        name.setFont(new Font("Noto Sans", Font.BOLD, 20));
        name.setVisible(true);
        name.setForeground(new Color(81, 77, 143));
        name.setBounds(270, 150, 250, 100);

        title1 = new JLabel();
        title1.setText("Adwait Rao");
        title1.setFont(new Font("Noto Sans", Font.BOLD, 25));
        title1.setVisible(true);
        title1.setForeground(new Color(245, 32, 71));
        title1.setBounds(600, 150, 250, 100);

        // Company
        JLabel comp;
        comp = new JLabel();
        comp.setText("ROLE IN COMPANY :- ");
        comp.setFont(new Font("Noto Sans", Font.BOLD, 20));
        comp.setVisible(true);
        comp.setForeground(new Color(81, 77, 143));
        comp.setBounds(270, 220, 250, 100);

        JLabel role;
        role = new JLabel();
        role.setText("Senior Manager In Marketing/Sales Team ");
        role.setFont(new Font("Noto Sans", Font.BOLD, 25));
        role.setVisible(true);
        role.setForeground(new Color(182, 59, 247));
        role.setBounds(600, 220, 550, 100);

        JLabel join;
        join = new JLabel();
        join.setText("JOINING DATE :- ");
        join.setFont(new Font("Noto Sans", Font.BOLD, 20));
        join.setVisible(true);
        join.setForeground(new Color(81, 77, 143));
        join.setBounds(270, 290, 250, 100);

        JLabel joindate;
        joindate = new JLabel();
        joindate.setText("20/10/2020");
        joindate.setFont(new Font("Noto Sans", Font.BOLD, 25));
        joindate.setVisible(true);
        joindate.setForeground(new Color(242, 139, 5));
        joindate.setBounds(600, 290, 250, 100);

        JLabel quali;
        quali = new JLabel();
        quali.setText("QUALITFICATIONS :- ");
        quali.setFont(new Font("Noto Sans", Font.BOLD, 20));
        quali.setVisible(true);
        quali.setForeground(new Color(81, 77, 143));
        quali.setBounds(270, 350, 250, 100);

        JLabel quali2;
        quali2 = new JLabel();
        quali2.setText("MBA In Marketing/Sales From IIM Ahmedabad");
        quali2.setFont(new Font("Noto Sans", Font.BOLD, 25));
        quali2.setVisible(true);
        quali2.setForeground(new Color(54, 51, 49));
        quali2.setBounds(600, 350, 750, 100);

        JLabel sal;
        sal = new JLabel();
        sal.setText("SALARY :- ");
        sal.setFont(new Font("Noto Sans", Font.BOLD, 20));
        sal.setVisible(true);
        sal.setForeground(new Color(81, 77, 143));
        sal.setBounds(270, 420, 250, 100);

        JLabel sal2;
        sal2 = new JLabel();
        sal2.setText("17 LPA");
        sal2.setFont(new Font("Noto Sans", Font.BOLD, 25));
        sal2.setVisible(true);
        sal2.setForeground(new Color(235, 26, 106));
        sal2.setBounds(600, 420, 750, 100);

        JLabel age;
        age = new JLabel();
        age.setText("AGE :- ");
        age.setFont(new Font("Noto Sans", Font.BOLD, 20));
        age.setVisible(true);
        age.setForeground(new Color(81, 77, 143));
        age.setBounds(270, 490, 250, 100);

        JLabel age2;
        age2 = new JLabel();
        age2.setText("18");
        age2.setFont(new Font("Noto Sans", Font.BOLD, 25));
        age2.setVisible(true);
        age2.setForeground(new Color(12, 167, 245));
        age2.setBounds(600, 490, 750, 100);

        JLabel con;
        con = new JLabel();
        con.setText("CONTACT NO :- ");
        con.setFont(new Font("Noto Sans", Font.BOLD, 20));
        con.setVisible(true);
        con.setForeground(new Color(81, 77, 143));
        con.setBounds(270, 550, 250, 100);

        JLabel con2;
        con2 = new JLabel();
        con2.setText("9878674533");
        con2.setFont(new Font("Noto Sans", Font.BOLD, 25));
        con2.setVisible(true);
        con2.setForeground(new Color(50, 168, 82));
        con2.setBounds(600, 550, 750, 100);

        JLabel add;
        add = new JLabel();
        add.setText("ADDRESS :- ");
        add.setFont(new Font("Noto Sans", Font.BOLD, 20));
        add.setVisible(true);
        add.setForeground(new Color(81, 77, 143));
        add.setBounds(270, 620, 250, 100);

        JLabel add2;
        add2 = new JLabel();
        add2.setText("Pethe Nagar, Nashik");
        add2.setFont(new Font("Noto Sans", Font.BOLD, 25));
        add2.setVisible(true);
        add2.setForeground(new Color(41, 122, 204));
        add2.setBounds(600, 620, 750, 100);

        // LABEL ENDS


        frame.add(name);
        frame.add(top);
        frame.add(left);
        frame.add(title1);
        frame.add(comp);
        frame.add(head);
        frame.add(role);
        frame.add(join);
        frame.add(joindate);
        frame.add(quali);
        frame.add(quali2);
        frame.add(sal);
        frame.add(sal2);
        frame.add(age);
        frame.add(age2);
        frame.add(con);
        frame.add(con2);
        frame.add(add);
        frame.add(add2);
        frame.add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
