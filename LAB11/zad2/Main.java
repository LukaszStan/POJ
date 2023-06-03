package zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main implements ActionListener {
    private Random rand;
    private int number;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JFormattedTextField text;
    private JPanel panel;
    public Main(){
        rand = new Random();

        number = rand.nextInt(11);

        frame = new JFrame();

        button = new JButton("Zgadnij liczbę");
        button.addActionListener(this);
        label = new JLabel();
        text = new JFormattedTextField();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(text);
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Zad 2");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int player = Integer.parseInt(text.getText());

        if(number>player){
            label.setText("Spróbuj wyżej");
        } else if (number<player) {
            label.setText("Spróbuj niżej");
        }
        else {
            label.setText("Zgadłeś!");
        }
    }
}
