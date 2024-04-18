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

public class Final {
    public static void main(String[] args) {
        Login();

        
    }

public static void Login() {
        JFrame frame = new JFrame("Final Project 🖤");
        frame.setSize(400, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        JPanel inputPanel = new JPanel(new GridLayout(5, 1));
        JTextField userfillField = new JTextField();
        JPasswordField passwordfillField = new JPasswordField();
        JButton loginButton = new JButton("LOG IN");
        JButton cancelButton = new JButton("CANCEL");


        inputPanel.add(new JLabel("                                                       LOG "));
        inputPanel.add(new JLabel("IN"));
        inputPanel.add(new JLabel("Username:"));
        inputPanel.add(userfillField);
        inputPanel.add(new JLabel("Password:"));
        inputPanel.add(passwordfillField);
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());

        inputPanel.add(loginButton);
        inputPanel.add(cancelButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userfillField.getText();
                String password = new String(passwordfillField.getPassword());

                if (username.equals("beth") && password.equals("pass")) {
                    
                    JOptionPane.showMessageDialog(frame, "LOGIN SUCCESSFUL",
                            "MESSAGE", JOptionPane.INFORMATION_MESSAGE );
                            homePage();
                            
                            
                } else {
                    JOptionPane.showMessageDialog(frame, "INVALID USERNAME/PASSWORD",
                            "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                            
                }
            }
        });
        
      cancelButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        frame.add(mainPanel);
        frame.setVisible(true);

}
public static void homePage(){
    JFrame frame = new JFrame("WELCOME USER");
    frame.setSize(1920, 1080);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel(new BorderLayout());
    JPanel inputPanel = new JPanel(new GridLayout(1, 2));

    JButton homeButton = new JButton("HOME");
    JButton exitButton = new JButton("SIGN OUT");
   
    inputPanel.add(homeButton);
    inputPanel.add(exitButton);

    exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Login();
            }
        
    });


    panel.add(inputPanel, BorderLayout.CENTER);
    frame.setVisible(true);
    frame.add(panel);

}
}