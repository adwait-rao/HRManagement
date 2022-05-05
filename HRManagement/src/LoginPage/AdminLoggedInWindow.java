package LoginPage;

import javax.swing.*;
import java.awt.*;

public class AdminLoggedInWindow {
    JFrame frame;
    public AdminLoggedInWindow()
    {
        frame = new JFrame();

        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HR Management Login");
        frame.setSize(600, 600);
        frame.setResizable(true);
        frame.setLayout(null);
    }
}
