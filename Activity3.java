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

public class Activity3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Activity #3");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(8, 4));
        JTextField firstNumberField = new JTextField();
        JTextField secondNumberField = new JTextField();
        
        JTextField sumField = new JTextField();
        JTextField diffField = new JTextField();
        JTextField prodField = new JTextField();
        JTextField divField = new JTextField();
        JButton calculateButton = new JButton("Solve");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double firstNum = Double.parseDouble(firstNumberField.getText());
                    double secondNum = Double.parseDouble(secondNumberField.getText());

                    double sum = firstNum + secondNum;
                    sumField.setText(String.valueOf(sum));

                    double diff = firstNum - secondNum;
                    diffField.setText(String.valueOf(diff));

                    double product = firstNum * secondNum;
                    prodField.setText(String.valueOf(product));

                    if (secondNum == 0) {
                        divField.setText("Cannot divide by zero!");
                    } else {
                        double quotient = firstNum / secondNum;
                        divField.setText(String.valueOf(quotient));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        inputPanel.add(new JLabel("✔ ENTER FIRST NUMBER  "));
        inputPanel.add(firstNumberField);
        inputPanel.add(new JLabel(" ✔ ENTER SECOND NUMBER "));
        inputPanel.add(secondNumberField);

        inputPanel.add(new JLabel());
        inputPanel.add(calculateButton);
        
        inputPanel.add(new JLabel("SUM ➕"));
        inputPanel.add(sumField);
        inputPanel.add(new JLabel("DIFFERENCE ➖ "));
        inputPanel.add(diffField); 
        inputPanel.add(new JLabel("PRODUCT ✖ "));
        inputPanel.add(prodField);
        inputPanel.add(new JLabel("QUOTIENT ➗ "));
        inputPanel.add(divField);
        
        

        mainPanel.add(inputPanel, BorderLayout.NORTH);
    
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
                                                                                                                                                                                      