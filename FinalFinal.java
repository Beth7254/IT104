import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FinalFinal {
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
                if (username.equals("beth") && password.equals("2525")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    homePage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username/Password", "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                }
                loginButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
            }

        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainPanel.add(inputPanel, BorderLayout.NORTH);
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
    private JTextField Output;
    private String s0 = "", s1 = "", s2 = "";

    public Main() {
        frame = new JFrame("Home Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        navigationPanel = new JPanel(new GridLayout(4, 1));

        JButton mainPageButton = new JButton("Welcome Page");
        mainPageButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "main");
            }
        });

        JButton otherPageButton = new JButton("Profile");
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

        JButton calculatorButton = new JButton("Calculator");
        calculatorButton.setFont(new Font("Wide Heavy", Font.BOLD, 18));
        calculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                calculator();
            }
        });

        navigationPanel.add(mainPageButton);
        navigationPanel.add(otherPageButton);
        navigationPanel.add(calculatorButton);
        navigationPanel.add(signoutButton);

        mainPanel.add(createMainPage(), "main");
        mainPanel.add(createOtherPage(), "other");

        frame.add(navigationPanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JPanel createMainPage() {
        JPanel panel = new JPanel();

        JLabel BethLabel = new JLabel(
                "<html> Hi, I'm Mary Beth Gracia,<br> and this page is <br> all about myself💜 <html>");
        BethLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
        panel.add(BethLabel, BorderLayout.CENTER);

        ImageIcon imageIcon = new ImageIcon("C:/Users/Student/Documents/IT104/pics/Cutie.png");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(imageIcon);
        
        panel.add(imageLabel);
        return panel;
    }

    private JPanel createOtherPage() {
        JPanel panel = new JPanel();

        JLabel bethLabel = new JLabel(
                "<html> <br> Ni hao, I am Mary Beth Deniega Gracia, but you can call me Beth for short. I' am 19 years of age. <br> I' am a freshman student, pursuing a degree in Information Technology (BSIT) and <br> also I'am scholar student in Don Bosco Technical College Cebu-Inc. <br> I love pets, cute stuffs, foodies, and etc, that's make me happy. I want to travel other countries especially Japan and Switzerland. <br> I' am a simple girl who's living in this world that's full of surprise.  <html>\"");
        bethLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
        panel.add(bethLabel);

        ImageIcon imageIcon = new ImageIcon("C:/Users/Student/Documents/IT104/pics/HI.png");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel);
        return panel;

    }

    public void calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 5));
        JPanel Operations = new JPanel(new GridLayout(5, 5));
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JTextField Output = new JTextField(16);
        Output.setEditable(false);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton EqualsButton = new JButton("=");
        JButton CancelButton = new JButton("C");
        JButton PeriodButton = new JButton(".");

        JButton number0 = new JButton("0");
        JButton number1 = new JButton("1");
        JButton number2 = new JButton("2");
        JButton number3 = new JButton("3");
        JButton number4 = new JButton("4");
        JButton number5 = new JButton("5");
        JButton number6 = new JButton("6");
        JButton number7 = new JButton("7");
        JButton number8 = new JButton("8");
        JButton number9 = new JButton("9");

        inputPanel.add(Output);
        Operations.add(addButton);
        Operations.add(number1);
        Operations.add(number2);
        Operations.add(number3);
        Operations.add(subtractButton);
        Operations.add(number4);
        Operations.add(number5);
        Operations.add(number6);
        Operations.add(multiplyButton);
        Operations.add(number7);
        Operations.add(number8);
        Operations.add(number9);
        Operations.add(divideButton);
        Operations.add(PeriodButton);
        Operations.add(number0);
        Operations.add(CancelButton);
        Operations.add(label1);
        Operations.add(label2);
        Operations.add(label3);
        Operations.add(EqualsButton);

        number0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("0");
            }
        });
        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("1");
            }
        });

        number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("2");
            }
        });

        number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("3");
            }
        });

        number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("4");
            }
        });

        number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("5");
            }
        });

        number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("6");
            }
        });

        number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("7");
            }
        });

        number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("8");
            }
        });

        number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick("9");
            }
        });

        PeriodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(".");
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("+");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("-");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("*");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOperatorClick("/");
            }
        });

        CancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClearClick();
            }
        });

        EqualsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEqualsClick();
            }
        });

        mainPanel.add(Operations, BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void handleButtonClick(String digit) {
        if (!s1.equals("")) {
            s2 += digit;
        } else {
            s0 += digit;
        }
        Output.setText(s0 + s1 + s2);
    }

    private void handleOperatorClick(String operator) {
        if (!s1.equals("")) {
            handleEqualsClick();
        }
        s1 = operator;
        Output.setText(s0 + s1 + s2);
    }

    private void handleClearClick() {
        s0 = s1 = s2 = "";
        Output.setText(s0 + s1 + s2);
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
        Output.setText(s0 + s1 + s2);
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
