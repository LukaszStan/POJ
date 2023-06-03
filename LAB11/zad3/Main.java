package zad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JLabel label2;
    private JFormattedTextField text;
    private JPanel panel;
    public Main(){
        frame = new JFrame();

        button = new JButton("Od tyłu");
        button.addActionListener(this);
        label = new JLabel("Podaj string: ");
        label2 = new JLabel();
        text = new JFormattedTextField();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,200,10,200));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(text);
        panel.add(button);
        panel.add(label2);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Zad 3");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = text.getText();

        StringBuffer sbr = new StringBuffer(str);

        sbr.reverse();

        str = sbr.toString();

        label2.setText(str);
    }
}
