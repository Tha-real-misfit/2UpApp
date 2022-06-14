import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class DesignGUI {
    private JPanel topPanel;
    private JPanel MainPanel;
    private JPanel bottomPanel;
    private JLabel headingPanel;
    private JTextField enterNameHereTextField;
    private JButton ENTERButton;

    public DesignGUI() {
        ENTERButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        enterNameHereTextField.addKeyListener(new KeyAdapter() {
            Scanner name = new Scanner(System.in);
            String userName = name.nextLine();
            System.out.println(userName);
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }
}
