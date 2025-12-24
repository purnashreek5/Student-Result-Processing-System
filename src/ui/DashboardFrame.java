package ui;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Dashboard");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton addStudent = new JButton("Add Student");
        JButton viewDatabase = new JButton("View Database");
        JButton logout = new JButton("Logout");

        addStudent.addActionListener(e -> {
            new AddStudentFrame();
            dispose();
        });

        viewDatabase.addActionListener(e -> {
            new DatabaseFrame();
            dispose();
        });

        logout.addActionListener(e -> {
            new LoginFrame();
            dispose();
        });

        JPanel panel = new JPanel(new GridLayout(1, 3, 20, 20));
        panel.add(addStudent);
        panel.add(viewDatabase);
        panel.add(logout);

        add(panel);
        setVisible(true);
    }
}