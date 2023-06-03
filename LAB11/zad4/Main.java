package zad4;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    private static final String[] flagPaths = {
            "zad4/bg.png",
            "zad4/cz.png",
            "zad4/gm.png",
            "zad4/lh.png",
            "zad4/pl.png"
    };
    public Main(){

        JFrame frame = new JFrame();
        frame.setTitle("Zad 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(1,3);
        panel.setLayout(layout);
        frame.add(panel);

        Random random = new Random();
        Set<String> selectedFlags = new HashSet<>();
        while (selectedFlags.size() < 3) {
            int randomFlagIndex = random.nextInt(flagPaths.length);
            String flagPath = flagPaths[randomFlagIndex];
            if (!selectedFlags.contains(flagPath)) {
                selectedFlags.add(flagPath);
                ImageIcon flagIcon = new ImageIcon(flagPath);
                JLabel flagLabel = new JLabel(flagIcon);
                panel.add(flagLabel);
            }
        }

        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new Main();
    }

}
