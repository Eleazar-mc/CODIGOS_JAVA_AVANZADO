package b_componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Menus {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menus");
        final JTextField texto = new JTextField(20);
        JMenuBar mb = new JMenuBar();
        JMenu[] menu = { new JMenu("Computacion"), new JMenu("Informatica") };
        JMenuItem[] items = { new JMenuItem("Fundamentos"),
                new JMenuItem("Ingenieria de Software"),
                new JMenuItem("Tecnologia Cliente/Servidor"),
                new JMenuItem("Bases de datos Espacio-Temporales"),
                new JMenuItem("Programacion Orientada a Objetos") };

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText(((JMenuItem) e.getSource()).getText());
            }
        };

        for (int i = 0; i < items.length; i++) {
            items[i].addActionListener(al);
            menu[i % 2].add(items[i]);
        }

        for (int i = 0; i < menu.length; i++)
            mb.add(menu[i]);

        frame.setJMenuBar(mb);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(texto);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}