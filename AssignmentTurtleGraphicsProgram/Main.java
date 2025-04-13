import java.awt.*;
import javax.swing.*;

import uk.ac.leedsbeckett.oop.LBUGraphics;

class Main extends LBUGraphics {
    public static void main(String[] args) {
        new Main(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
    }

    public Main() {
        JFrame MainFrame = new JFrame();          //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                   //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                     //set the frame to a size we can see
        MainFrame.setVisible(true);          //now display it
        //about();                          //call the LBUGraphics about method to display version information.
    }

    @Override
    public void processCommand(String command) {
        String[] splitText;
        int parameter;
        splitText = command.split("");

        switch (splitText[0]) {
            case "pendown":
                setPenState(true);
                break;

            case "move":
                if (splitText.length > 1) {
                    try {
                        parameter = Integer.parseInt(splitText[1]);
                    } catch (NumberFormatException e) {
                    }
                }

                    case "forward":
                        forward(100);
                        break;

                    case "right":
                        right();
                        break;

                    case "left":
                        left();
                        break;

                    default:
                        System.out.println("Unknown command: + command");
                }

        }
    }
