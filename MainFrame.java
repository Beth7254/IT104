import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Baskerville", Font.BOLD, 14);
    JTextField tfUsername, tfPassword;
    JLabel lbFinalProject;

    public void initialize() {

        // Form Panel //
        JLabel lbUsername = new JLabel("Username");
        lbUsername.setFont(mainFont);

        tfUsername = new JTextField();
        tfUsername.setFont(mainFont);

        JLabel lbPassword = new JLabel("Password");
        lbPassword.setFont(mainFont);

        tfPassword = new JTextField();
        tfPassword.setFont(mainFont);

        JPanel formpanel = new JPanel();
        formpanel.setLayout(new GridLayout(2, 2, 5, 5));
        formpanel.add(lbUsername);
        formpanel.add(tfUsername);
        formpanel.add(lbPassword);
        formpanel.add(tfPassword);

        lbFinalProject = new JLabel();
        lbFinalProject.setFont(mainFont);

        JButton btnLogIn = new JButton("Log In");
        btnLogIn.setFont(mainFont);
        btnLogIn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfUsername.getText();
                String password = tfPassword.getText();
                lbFinalProject.setText("Hello" + username + " " + password);
            }

        });

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(mainFont);
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfUsername.setText("");
                tfPassword.setText("");
                lbFinalProject.setText("");
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnLogIn);
        buttonsPanel.add(btnCancel);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 128));
        mainPanel.add(formpanel, BorderLayout.NORTH);
        mainPanel.add(lbFinalProject, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Final Project");
        setSize(500, 300);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        MainFrame myframe = new MainFrame();
        myframe.initialize();
    }

}