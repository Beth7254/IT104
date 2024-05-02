import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



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
        loginButton.setFont(new Font("Wide Heavy", Font.BOLD, 18)); 
        JButton cancelButton = new JButton("CANCEL");
        cancelButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));

        inputPanel.add(new JLabel("                                                       LOG "));
        inputPanel.add(new JLabel("IN"));
        inputPanel.add(new JLabel("USERNAME"));
        inputPanel.add(userField);
        inputPanel.add(new JLabel("PASSWORD"));
        inputPanel.add(passwordField);
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());
        inputPanel.setFont(new Font("Wide Heavy", Font.BOLD, 18)); 

       
        
        
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

        navigationPanel = new JPanel(new GridLayout(3, 1));

        JButton welcomeButton = new JButton("<html>WELCOME TO MY PAGE,<br> I'm Mary Beth Gracia💜<html>");
        welcomeButton.setFont(new Font("Wide Heavy", Font.BOLD, 18)); 
       
        welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "WELCOME");
            }
        });

        JButton mainPageButton = new JButton("CALCULATOR");
        mainPageButton.setFont(new Font("Wide Heavy", Font.BOLD, 20));
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "CALCULATOR");
               
            }
        });

        JButton otherPageButton = new JButton("Other Page");
        otherPageButton.setFont(new Font("Wide Heavy", Font.BOLD, 20));
        otherPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "other");
            }
        });

        JButton signoutButton = new JButton("Sign Out");
        signoutButton.setFont(new Font("Wide Heavy", Font.BOLD, 20));
        signoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        navigationPanel.add(welcomeButton);
        navigationPanel.add(mainPageButton);
        navigationPanel.add(signoutButton);


        mainPanel.add(createMainPage(), " Welcome Button");
        mainPanel.add(createMainPage(), "Home Page");

        frame.add(navigationPanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createMainPage() {
        JPanel panel = new JPanel();

        JLabel bethLabel = new JLabel(
                "<html>Ni hao, I'm I am Mary Beth Deniega Gracia, but you can call me Beth for short, and this page is all about me.<br> I' am 19 years of age. Don't talk about my relationship because it's complicated but I love who I ' am now <br> I' am a freshman student, pursuing a degree in Information Technology (BSIT) at Don Bosco Technical College Cebu-Inc. <br> I love pets, cute stuffs, foodies, and etc, that's make me happy. I want to travel other countries especially Japan, Switzerland, <br> Italy and many more.<br>  I' am a simple girl who's living in this world that's full of surprise.  <html>");
             bethLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));  
             panel.add(bethLabel);

             ImageIcon imageIcon = new ImageIcon ("C:/Users/Student/Documents/IT104/pics/HI.png");
             imageIcon.setImage(imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
             JLabel imageLabel = new JLabel(imageIcon);
             panel.add(imageLabel);

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