package b_componentes;

import javax.swing.JFileChooser;

public class JFileChooserDemo {
    public static void main(String[] args) {
        JFileChooser choice = new JFileChooser();
        int option = choice.showOpenDialog(null);
    }
}