package by.eparmon.designpatterns.observer;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {

    private JFrame frame;

    public static void main(String[] args) {
        var example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        var frame = new JFrame();
        JButton button = new JButton("Should i do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
