package a_intro_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Swing3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing 3");

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JButton("Boton Swing"));
        frame.getContentPane().add(new JButton("Otro boton Swing"));

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
