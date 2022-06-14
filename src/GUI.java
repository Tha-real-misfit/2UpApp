import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame
{
   public GUI()
    {
        setLayout(new FlowLayout());
        JFrame myFrame = new JFrame("2Up");
        myFrame.setSize(600,400);
        myFrame.setLocation(450,250);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        Font myFont = new Font("Bauhaus 93", Font.BOLD, 26);
        JLabel greetingLabel = new JLabel("Welcome to 2UP");
        greetingLabel.setFont(myFont);


        myFrame.add(greetingLabel);
        myFrame.setVisible(true);

    }
}
