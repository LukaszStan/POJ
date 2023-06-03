package zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private float farenhait;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JLabel label2;
    private JFormattedTextField text;
    private JPanel panel;
    public Main(){
        frame = new JFrame();

        button = new JButton("Zamień na Farenhaity");
        button.addActionListener(this);
        label = new JLabel("Stopnie Celcujsza: ");
        label2 = new JLabel("Wynik: ");
        text = new JFormattedTextField();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(text);
        panel.add(button);
        panel.add(label2);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Zad 1");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float celcius = Float.parseFloat(text.getText());
        farenhait = (celcius * 9/5) + 32;
        label2.setText("Wynik: " + farenhait);
    }
}
