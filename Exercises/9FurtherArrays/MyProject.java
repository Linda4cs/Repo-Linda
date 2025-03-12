import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyProject {
    public static void main(String[] args) {
        // Creating a JFrame that will display the graphics panel
        JFrame frame = new JFrame("LBUGraphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating and adding graphics panel to the frame
        GraphicsClass graphicsPanel = new GraphicsClass();
        frame.add(graphicsPanel, BorderLayout.CENTER);

        // Set up the text field and button at the bottom of the frame
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(15);
        JButton button = new JButton("OK");

        panel.add(textField);
        panel.add(button);
        frame.add(panel, BorderLayout.SOUTH);

        // Define the action when the user presses Enter or clicks the button
        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Process the command typed into the text field
                String command = textField.getText().toLowerCase().trim();
                graphicsPanel.processCommand(command);
                textField.setText("");  // Clear the text field after processing
            }
        };

        // Bind Enter key press to button action
        textField.addActionListener(listener);
        button.addActionListener(listener);

        // Display the frame
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
