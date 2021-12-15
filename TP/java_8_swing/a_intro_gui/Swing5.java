package a_intro_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing5 {
    private static String lblPrefijo = "No. clicks: ";
    private static int numClicks = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Evento 2");
        JButton boton = new JButton("Evento 2");
        final JLabel etiqueta = new JLabel(lblPrefijo + "0   ");

        boton.setMnemonic(KeyEvent.VK_U); // alt + U
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                etiqueta.setText(lblPrefijo + numClicks);
            }}
        );

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(boton);
        frame.getContentPane().add(etiqueta);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }}
        );

        frame.pack();
        frame.setVisible(true);
    }
}