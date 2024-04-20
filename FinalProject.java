import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalProject {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                login();
            }
        });
    }

    public static void login() {
        JFrame frame = new JFrame("(っ ͡ ͡º - ͡ ͡º ς) ");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 1));
        JTextField userField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("LOG IN");
        JButton cancelButton = new JButton("CANCEL");

        inputPanel.add(new JLabel("                                                       LOG "));
        inputPanel.add(new JLabel("IN"));
        inputPanel.add(new JLabel("USERNAME"));
        inputPanel.add(userField);
        inputPanel.add(new JLabel("PASSWORD"));
        inputPanel.add(passwordField);
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());

        inputPanel.add(loginButton);
        inputPanel.add(cancelButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("beth") && password.equals("cuteko")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful", "ദ്ദി ˉ͈̀꒳ˉ͈́ )✧",
                            JOptionPane.INFORMATION_MESSAGE);
                    homePage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username/Password", "(╯°□°)╯",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void homePage() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}

class Main {
    private JFrame frame;
    private JPanel navigationPanel;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public Main() {
        frame = new JFrame("⌂♡ ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        navigationPanel = new JPanel(new GridLayout(2, 1));

        JButton mainPageButton = new JButton("Home Page");
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Home Page");
            }
        });

        JButton otherPageButton = new JButton("Other Page");
        otherPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "other");
            }
        });

        JButton signoutButton = new JButton("Sign Out");
        signoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        navigationPanel.add(mainPageButton);

        navigationPanel.add(signoutButton);

        mainPanel.add(createMainPage(), "Home Page");

        frame.add(navigationPanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createMainPage() {
        JPanel panel = new JPanel();

        JLabel bethLabel = new JLabel(
                "Ni hao, I'm Mary Beth but you can call me Beth for short, and this page is all about me");
        bethLabel.setFont(new Font("Jersey 15", Font.PLAIN, 20));
        JLabel introLabel = new JLabel("Nihao, and welcome to my page.");
        introLabel.setFont(new Font("Jersey 15", Font.BOLD, 20));
        JLabel introLabel2 = new JLabel(
                "I am Mary Beth Deniega Gracia, I'am 19 years of age, I'am pursuing a degree in Information Technology at Don Bosco Technical College Cebu-Inc.");               
        introLabel2.setFont(new Font("Jersey 15y", Font.BOLD, 20));
        JLabel introLabel3 = new JLabel(
                "ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧");

        introLabel3.setFont(new Font("Jersey 15", Font.BOLD, 20));
        panel.add(bethLabel);
        panel.add(introLabel);
        panel.add(introLabel2);
        panel.add(introLabel3);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}