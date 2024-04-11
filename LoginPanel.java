import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Log In");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 1));

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton logbutton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        logbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (isValidLogin(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Try Again",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
   
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = passwordField.getText();
                JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Try again");

            }
        });   


        inputPanel.add(new JLabel("Username:"));
        inputPanel.add(usernameField);
        inputPanel.add(new JLabel("Password:"));
        inputPanel.add(passwordField);

        inputPanel.add(logbutton);
        inputPanel.add(cancelButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static boolean isValidLogin(String email, String password) {
        return true;
    }
}
