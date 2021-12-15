package b_componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Folders {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Folders");
        JTabbedPane folder = new JTabbedPane();

        folder.add("Diamante", new JButton("Diamante genuino de africa"));
        folder.add("Mercurio", new JButton("Mercurio"));
        folder.addTab("Fluorita", new JButton("Fluorita pura!"));
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(folder);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }}
        );

        frame.pack();
        frame.setVisible(true);
    }
}