package ui;

import javax.swing.*;
import java.awt.*;
import exception.LoginException;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Student Result Processing System - Login");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");
        JLabel message = new JLabel("");

        loginBtn.addActionListener(e -> {
            try {
                authenticate(idField.getText(), new String(passField.getPassword()));
                dispose();
                new DashboardFrame();
            } catch (LoginException ex) {
                message.setText(ex.getMessage());
                message.setForeground(Color.RED);
            }
        });

        panel.add(idLabel);
        panel.add(idField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginBtn);
        panel.add(message);

        add(panel);
        setVisible(true);
    }

    private void authenticate(String id, String pass) throws LoginException {
        if (!id.equals("purna27") || !pass.equals("passme!23")) {
            throw new LoginException("Invalid Login Credentials");
        }
    }
}