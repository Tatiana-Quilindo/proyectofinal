import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        consultaG gini = new consultaG();
        frame.setContentPane(gini.panel1);
        frame.pack();
        frame.setVisible(true);
    }
}