//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Frame extends JFrame implements ActionListener
//{
//    JLabel question = new JLabel("What is your name");
//    Font bigFont = new Font("Bauhaus 93", Font.BOLD, 16);
//    JTextField answer = new JTextField(10);
//    JButton pressMe = new JButton("Press Me");
//    JLabel greeting = new JLabel("");
//    final int WIDTH = 275;
//    final int HEIGHT = 225;
//
//    public Frame()
//    {
//        super("Hello Frame");
//        setSize(WIDTH, HEIGHT);
//        setLayout(new FlowLayout());
//        question.setFont(bigFont);
//        greeting.setFont(bigFont);
//        add(question);
//        add(answer);
//        add(pressMe);
//        add(greeting);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        pressMe.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent ae)
//    {
//        String name = answer.getText();
//        String greet = "Hello " +name;
//
//        greeting.setText(greet);
//    }
//}
