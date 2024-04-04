import javax.swing.*;
import java.awt.*;

public class ColoredBorderPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Border Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel with a colored border
        JPanel coloredBorderPanel = new JPanel();
        coloredBorderPanel.setBorder(BorderFactory.createLineBorder(Color.PINK, 10)); // Set border color here
        coloredBorderPanel.setBackground(Color.WHITE); // Set background color if needed
                                                                                                                                                                       

        frame.setVisible(true);
    }
}