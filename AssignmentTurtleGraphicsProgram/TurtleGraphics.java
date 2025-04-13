import uk.ac.leedsbeckett.oop.LBUGraphics;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class TurtleGraphics extends LBUGraphics {
    ;

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
        //about();                          //call the LBUGraphics about method to display version information.
    }

    @Override
    public void about () {
        super.about();  // Call the original about method to show the default graphic
        System.out.println("Linda's Turtle");
    }

    @Override
    public void processCommand(String command){


        String[] splitText;
        int parameter;
        splitText = command.split(" ");

        switch (splitText[0]) {

            // Special command to display a graphic
            case "about":
                about(); // Display a simple graphic of the turtle
                break;

            case "pendown":
                setPenState(true);
                displayMessage("pendown");
                break;

            case "move":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("No parameter given");
                        break;
                    }
                    forward(parameter);
                }
                break;

            case "save":
            {
                try {
                    FileWriter file = new FileWriter("Program txt");
                    BufferedWriter output = new BufferedWriter(file);
                    //output.write(String.valueOf(commandHistory));
                }catch (IOException e){
                    System.out.println("File error");
                }
            }

            case "reverse":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                       forward(-parameter); // Move the turtle forward by specified parameter
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command: ");

                        break;
                    }
                    break;
                }

            case "left":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid command");
                        break;
                    }
                    left(parameter);
                }
                break;

            case "right":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid command");
                        break;
                    }
                    right(parameter);
                    break;
                }

            case "penup":
                setPenState(false); // Lift the pen to stop drawing
                break;

            case "circle":
                if (splitText.length > 1) {
                    try {
                    parameter = Integer.parseInt(splitText[1]);
                } catch (NumberFormatException e) {
                    System.out.println("invalid command");
                    break;
                }
                circle(parameter);
                break;
            }

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

            // Clear and Reset command
            case "clear":
                clear(); // Clear the canvas, keeping the turtle in the same position
                break;

            case "reset":
                reset(); // Reset the canvas to the initial state
                break;

            case "square":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                        drawSquare(parameter);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command: + command");
                    }
                }
                break;

            case "saveImage":
                try {
                    saveImage();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case "loadImage":
                try {
                    loadImage();
                } catch (IOException e) {
                    System.out.println("No parameter passed");
                }
                break;

            case "saveCommand":
                try {
                    saveCommand();
                } catch (IOException e) {
                    System.out.println("Error saving Image");
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

            case "triangle":
                if (splitText.length == 2) {
                    try {
                        int size = Integer.parseInt(splitText[1]);
                        drawTriangle(size);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command: + command");
                    }
                }
                 break;

            default:
                System.out.println("Unknown command: + command");
        }
    }
        private void drawSquare(int length) {
            for (int i = 0; i < 4; i++) {
                forward(length);
                right(90);
            }
        }

        private void drawTriangle(int size) {
            for (int i = 0; i < 3; i++) {
                forward(size);
                right(120);
            }
        }
        private void doMove(String command) {
            if (command.isEmpty()) {
                System.out.println("Wrong move: CANNOT BE EMPTY. <Enter a valid number>");
            }
            else if (command.startsWith("-")){
                System.out.println("Wrong move: CANNOT BE NEGATIVE. <Please enter a positive number>");
            }
            else {
                try {
                    forward(command);
                }catch (Exception e){
                    System.out.println("Wrong move: MUST BE A NUMBER <Enter required number>");
                }
            }
        }

    private void turnRight(String command) {
        if (command.isEmpty()) {
            System.out.println("Wrong move: CANNOT BE EMPTY. <Enter a valid number>");
        } else if (command.startsWith("-")) {
            System.out.println("Wrong move: CANNOT BE NEGATIVE. <Please enter a positive number>");
        } else {
            try {
                forward(command);
            } catch (Exception e) {
                System.out.println("Wrong move: MUST BE A NUMBER <Enter required number>");

            }
        }
    }

    private void turnLeft(String command) {
        if (command.isEmpty()) {
            System.out.println("Wrong move: CANNOT BE EMPTY. <Enter a valid number>");
        } else if (command.startsWith("-")) {
            System.out.println("Wrong move: CANNOT BE NEGATIVE. <Please enter a positive number>");
        } else {
            try {
                forward(command);
            } catch (Exception e) {
                System.out.println("Wrong move: MUST BE A NUMBER <Enter required number>");

            }
        }
    }

        private void saveImage() throws IOException {
        BufferedImage image = getBufferedImage();
        ImageIO.write(image, "png", new  File ("drawing.png"));
        displayMessage("Image saved as drawing.png");

        }
        private void loadImage() throws IOException {
        BufferedImage img = ImageIO.read(new File("drawing.png"));
        setBufferedImage(img);
        displayMessage("Image loaded: ");
        }

        private void saveCommand() throws IOException {
            //Files.write(Paths.get("commands.txt"), commandHistory);
            displayMessage("Command saved to commands.txt");

            // Code for a warning dialog
            int choice = JOptionPane.showConfirmDialog(null,
                    "Message Unsaved. Do you want to save them?",
                    "Warning", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                saveImage(); // Save the image before clearing
            }
        }

        }
