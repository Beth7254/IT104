import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FinalProject2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                login();
            }
        });
    }

    public static void login() {
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 1));
        JTextField userField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        inputPanel.add(new JLabel("                                                       LOG "));
        inputPanel.add(new JLabel("IN"));
        inputPanel.add(new JLabel("Username:"));
        inputPanel.add(userField);
        inputPanel.add(new JLabel("Password:"));
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
                if (username.equals("beth") && password.equals("7777")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    homePage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username/Password", "Error Message",
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
    private JTextField l;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
    private String s0 = "", s1 = "", s2 = "";

    public Main() {
        frame = new JFrame("Home Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        navigationPanel = new JPanel(new GridLayout(3, 1));

        JButton mainPageButton = new JButton("<html>WELCOME TO MY PAGE,<br> I'm Mary Beth Gracia💜<html>");
        mainPageButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "main");
            }
        });

        JButton otherPageButton = new JButton("CALCULATOR");
        otherPageButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        otherPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "other");
            }
        });

        JButton signoutButton = new JButton("Sign Out");
        signoutButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        signoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        navigationPanel.add(mainPageButton);
        navigationPanel.add(otherPageButton);
        navigationPanel.add(signoutButton);

        mainPanel.add(createMainPage(), "main");
        mainPanel.add(createOtherPage(), "other");

        frame.add(navigationPanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createMainPage() {
        JPanel panel = new JPanel();

        JLabel bethLabel = new JLabel("<html> <br> Ni hao, I'm I am Mary Beth Deniega Gracia, but you can call me Beth for short, and this page is all about me.<br> I' am 19 years of age. Don't talk about my relationship because it's complicated but I love who I ' am now <br> I' am a freshman student, pursuing a degree in Information Technology (BSIT) at Don Bosco Technical College Cebu-Inc. <br> I love pets, cute stuffs, foodies, and etc, that's make me happy. I want to travel other countries especially Japan, Switzerland, <br> Italy and many more.<br>  I' am a simple girl who's living in this world that's full of surprise.  <html>\"");
        bethLabel.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        panel.add(bethLabel);

        ImageIcon imageIcon = new ImageIcon("C:/Users/Student/Documents/IT104/pics/HI.png");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel);

        panel.add(imageLabel);
        return panel;
    }

    private JPanel createOtherPage() {

        JPanel panel = new JPanel();
        l = new JTextField(16);
        l.setEditable(false);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        beq1 = new JButton("=");

        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
        be = new JButton(".");

        panel.add(l);
        panel.add(ba);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bs);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bm);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bd);
        panel.add(be);
        panel.add(b0);
        panel.add(beq);
        panel.add(beq1);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("0");
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("1");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("2");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("3");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("4");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("5");
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("6");
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("7");
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("8");
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("9");
            }
        });

        be.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(".");
            }
        });

        ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("+");
            }
        });

        bs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("-");
            }
        });

        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("*");
            }
        });

        bd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("/");
            }
        });

        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClearClick();
            }
        });

        beq1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEqualsClick();
            }
        });

        return panel;
    }

    private void handleButtonClick(String digit) {
        if (!s1.equals("")) {
            s2 += digit;
        } else {
            s0 += digit;
        }
        l.setText(s0 + s1 + s2);
    }

    private void handleOperatorClick(String operator) {
        if (!s1.equals("")) {
            handleEqualsClick();
        }
        s1 = operator;
        l.setText(s0 + s1 + s2);
    }

    private void handleClearClick() {
        s0 = s1 = s2 = "";
        l.setText(s0 + s1 + s2);
    }

    private void handleEqualsClick() {
        double result;
        if (s1.equals("+")) {
            result = Double.parseDouble(s0) + Double.parseDouble(s2);
        } else if (s1.equals("-")) {
            result = Double.parseDouble(s0) - Double.parseDouble(s2);
        } else if (s1.equals("*")) {
            result = Double.parseDouble(s0) * Double.parseDouble(s2);
        } else {
            result = Double.parseDouble(s0) / Double.parseDouble(s2);
        }
        s0 = Double.toString(result);
        s1 = "";
        s2 = "";
        l.setText(s0 + s1 + s2);
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
