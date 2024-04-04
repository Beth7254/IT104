import javax.swing.JButton; // button
import javax.swing.JFrame; // frame
import javax.swing.JLabel; // label
import javax.swing.JOptionPane; //dialogs
import javax.swing.JPanel; // panel
import javax.swing.JTextField; //textbox
import java.awt.BorderLayout;//border
import java.awt.GridLayout; // grid
import java.awt.event.ActionEvent; // event                  
import java.awt.event.ActionListener; //actionListener

public class PopupExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello! This is the Popup Example 😉");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        JTextField textField = new JTextField();
        JButton button = new JButton("Show Popup 💻");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText();
                JOptionPane.showMessageDialog(frame, message, "Popup Message", JOptionPane.PLAIN_MESSAGE);
            }
        });   //End of Botton ActionListener

        inputPanel.add(textField);
        inputPanel.add(button);

        JLabel label = new JLabel("Enter text and click the button to show the Popup Message");
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(label, BorderLayout.NORTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}