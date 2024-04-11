import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finals {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(8, 4));

        JTextField usernamField = new JTextField();
        
        JTextField passwField = new JTextField();


        
        JButton logButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        logButton.addActionListener(new ActionListener() {
   
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = usernamField.getText();
                JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Do you want to login?");

            }
        });   
    
        cancelButton.addActionListener(new ActionListener() {
   
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = passwField.getText();
                JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Try again");

            }
        });   

        inputPanel.add(new JLabel(" Username"));
        inputPanel.add(usernamField);

        inputPanel.add(new JLabel(" Password"));
        inputPanel.add(passwField);

        inputPanel.add(new JLabel());
        inputPanel.add(logButton);
        
        inputPanel.add(new JLabel());
        inputPanel.add(cancelButton);
     
        mainPanel.add(inputPanel, BorderLayout.NORTH);
    
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
                                                                                                                                                                                      