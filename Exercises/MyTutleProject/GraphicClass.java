import javax.swing.*;
import java.awt.*;

public class GraphicClass extends JPanel {

    private String message = "Enter a command below:";

    public GraphicClass() {
        // Setting the preferred panel size
        this.setPreferredSize(new Dimension(750, 580));
    }

    // This method is called to process the command typed by the user
    public void processCommand(String command) {
        if (command.equals("about")) {
            about();  // Draw the "about" graphic when the user types "about"
        } else {
            message = "Unknown command: " + command;
            repaint();  // Repaint the panel to show the message
        }
    }

    // This method draws the "dancing turtle" (or any other graphic)
    public void about() {
        message = "The Turtle is Dancing!";
        repaint();  // Repaint the panel to show the graphic for "about"
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call to ensure the panel is properly rendered

        // Set up the drawing environment
        g.setColor(Color.RED);
        g.setFont(new Font("Cali", Font.BOLD, 20));

        // Draw a message on the screen
        g.drawString(message, 200, 50);

        // Dancing turtle when about() is called
        if (message.equals("The Turtle is Dancing!")) {
            drawDancingTurtle(g);
        }
    }

    // This is where you draw the turtle or any other graphic
    private void drawDancingTurtle(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(350, 200, 100, 100);  // Draw a simple turtle shape (circle)
        g.setColor(Color.RED);
        g.drawLine(400, 250, 400, 350); // Draw turtle legs (simplified)
        g.drawLine(350, 250, 350, 350); // Another leg
    }
}

