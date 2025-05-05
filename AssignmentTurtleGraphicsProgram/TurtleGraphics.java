import uk.ac.leedsbeckett.oop.LBUGraphics;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class TurtleGraphics extends LBUGraphics {
    String commandList = "";
    private boolean isSaved;

    public static void main(String[] args) {
        new TurtleGraphics(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
    }
    public TurtleGraphics() {
        JFrame MainFrame = new JFrame();          //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                   //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                     //set the frame to a size we can see
        MainFrame.setVisible(true);
        displayMessage("Linda's Turtle");//now display it
    }

    @Override
    public void about() {
        super.about();  // Call the original about method to show the default graphic
        displayMessage("Linda's Turtle");
    }
    @Override
    public void processCommand(String command){
        parseCommand(command);
        commandList += command + "\n";

    }

    public void parseCommand(String command) {

        String[] splitText;
        int parameter;
        System.out.println("ProcessedCommand: " + command);
        splitText = command.split(" ");
        if (command.isEmpty())
            return;

        switch (splitText[0]) {

            // Special command to display a graphic
            case "about":
                about(); // Display a simple graphic of the turtle
                break;

            case "penup":
                setPenState(false);
                break;

            case "pendown":
                setPenState(true);
                break;

            case "left":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                        left(parameter);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid parameter for left: " + splitText[1]);
                        break;
                    }
                } else {
                    left(90);
                }
                break;

            case "right":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                        right(parameter);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong parameter for right: " );
                        break;
                    }
                } else {
                    right(90);
                }
                break;


            case "move":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                        forward(parameter);
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameters passed for move. " + splitText[1]);

                    }
                } else {
                    System.out.println("Missing parameter for move.");

                }
                break;

            case "reverse":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                        forward(-parameter); // move turtle forward by a specified parameter
                    } catch (NumberFormatException e) {
                        System.out.println("Enter parameter: ");
                    }

                }
                break;

            case "save":
                try {
                    FileWriter file = new FileWriter("commands.txt");
                    BufferedWriter output = new BufferedWriter(file);
                    output.write(commandList);
                    output.close();
                    isSaved = true;
                    System.out.println("Image and commands save. ");
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            case "loadCommands":
                loadCommands();
                break;

            case "red":
                setPenColour(Color.RED); // Set pen color to red
                break;

            case "green":
                setPenColour(Color.GREEN); // Set pen color to green
                break;

            case "blue":
                setPenColour(Color.BLUE); // Set pen color to blue
                break;

            case "white":
                setPenColour(Color.WHITE); // Set pen color to white
                break;

            //Clear and Reset command
            case "reset":
                reset(); // Reset the canvas to the initial state
                break;

            case "clear":
                if (!isSaved) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "unsaved changes. Do you wish to continue without saving",
                            "Unsaved Changes",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm != JOptionPane.YES_OPTION) {
                        System.out.println("Clear canceled by user to preserve unsaved work.");
                        break; // user chose not to proceed
                    }
                }
                clear(); // Clear the canvas, keeping the turtle in the same position
                isSaved = false;
                break;

        case "square":
        if (splitText.length > 1) {
            try {
                parameter = Integer.parseInt(splitText[1]);
                drawSquare(parameter);
            } catch (NumberFormatException e) {
                System.out.println("Invalid command: "+ e.getMessage());
            }
        }

            break;

            case "saveImage":
                try {
                    saveImage();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

            case "loadImage":
                try {
                    loadImage();
                } catch (IOException e) {
                    System.out.println("Error loading Image: " + e.getMessage());
                }
                break;

            case "penwidth":
                if (splitText.length > 1) {
                    try {
                        int width = Integer.parseInt(splitText[1]);
                        setStroke(width);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command: + command");
                    }
                }
                break;

            case "pen":
                if (splitText.length == 4) {
                    try {
                        int red = Integer.parseInt(splitText[1]);
                        int green = Integer.parseInt(splitText[2]);
                        int blue = Integer.parseInt(splitText[3]);

                        // Check bounds
                        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                            System.out.println("Invalid RGB values. Each must be between 0 and 255.");
                            break;
                        }

                        setPenColour(new Color(red, green, blue));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid parameters for RGB pen colour.");
                    }
                }
                    break;

            case "triangle":
                if (splitText.length == 2) {
                    try {
                        int size = Integer.parseInt(splitText[1]);
                        drawTriangle(size);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command: ");
                    }
                }
                break;

            default:
                System.out.println("Invalid command: " + command);
        }
    }

    private void drawSquare(int length) {
        for (int i = 0; i < 4; i++) {
            forward(length);
            right(90);
        }
        isSaved = false;
    }

    private void drawTriangle(int size) {
        for (int i = 0; i < 3; i++) {
            forward(size);
            right(120);
        }
    }

    private void saveImage() throws IOException {
        BufferedImage image = getBufferedImage();
        ImageIO.write(image, "png", new File("drawing.png"));
        displayMessage("Image saved as drawing.png");
        isSaved = true;
    }

    private void loadImage() throws IOException {
        BufferedImage img = ImageIO.read(new File("drawing.png"));
        setBufferedImage(img);
        displayMessage("Image loaded: ");
    }


    private void loadCommands(){
        try {
        BufferedReader reader = new BufferedReader(new FileReader("commands.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            parseCommand(line); // re-process each command
        }
        displayMessage("Commands loaded from file.");
    } catch (IOException e) {
        System.out.println("Error loading commands: " + e.getMessage());
    }

    }



    }
