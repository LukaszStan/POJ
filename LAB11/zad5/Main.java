package zad5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JLabel label2;
    private JFormattedTextField text;
    private JPanel panel;
    public Main(){
        frame = new JFrame();

        button = new JButton("Zatwierdź");
        button.addActionListener(this);
        label = new JLabel("Podaj datę(dd/mm/yyyy): ");
        label2 = new JLabel();
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
        frame.setTitle("Zad 5");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String string = text.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(string, formatter);
        label2.setText("To był " + date.getDayOfWeek());
    }
}
