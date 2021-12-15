package b_componentes;

import javax.swing.*;
import javax.swing.plaf.basic.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class LookAndFeel {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.metal.MetalLookAndFeel"); // default
//			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//			"com.sun.java.swing.plaf.multi.MultiLookAndFeel"); // igual a default
//			"com.sun.java.swing.plaf.synth.SynthLookAndFeel"); // igual a defualt

        } catch (Exception e) {
        }

        JFrame frame = new JFrame("Look and Feel");
        JPanel panel = new JPanel();
        JButton boton = new JButton("JButton");
        boton.setToolTipText("Este es un ToolTip");
        BasicArrowButton arriba = new BasicArrowButton(BasicArrowButton.NORTH), abajo = new BasicArrowButton(
                BasicArrowButton.SOUTH), izq = new BasicArrowButton(
                BasicArrowButton.WEST), der = new BasicArrowButton(
                BasicArrowButton.EAST);
        ButtonGroup g = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("JRadioButton 1");
        JRadioButton rb2 = new JRadioButton("JRadioButton 2");
        g.add(rb1);
        g.add(rb2);

        frame.setLayout(new FlowLayout());
        frame.add(boton);
        frame.add(new JToggleButton("JToggleButton"));
        frame.add(new JCheckBox("JCheckBox"));
        frame.add(rb1);
        frame.add(rb2);
        panel.setBorder(new TitledBorder(" Direcciones "));
        panel.add(arriba);
        panel.add(abajo);
        panel.add(izq);
        panel.add(der);
        frame.getContentPane().add(panel);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}