package b_componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JSliders extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new JSliders();
    }

    public JSliders() {
        super("Using JSlider");
        Container content = getContentPane();
        content.setBackground(Color.WHITE);

        JSlider slider1 = new JSlider();
        slider1.setBorder(BorderFactory.createTitledBorder("JSlider without Tick Marks"));
        content.add(slider1, BorderLayout.NORTH);

        JSlider slider2 = new JSlider();
        slider2.setBorder(BorderFactory.createTitledBorder("JSlider with Tick Marks"));
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        content.add(slider2, BorderLayout.CENTER);

        JSlider slider3 = new JSlider();
        slider3.setBorder(BorderFactory.createTitledBorder("JSlider with Tick Marks & Labels"));
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        slider3.setPaintTicks(true);
        slider3.setPaintLabels(true);
        content.add(slider3, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }
}