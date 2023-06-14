import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ui extends JFrame implements ActionListener {
    //Liczba nieudanych prób odgadnięcia słowa
    private int incorrectGuesses;
    //Przechowujemy wartości otrzymane z metody loadChellenge klasy WordDb
    private String[] wordChallenge;
    private final WordDB wordDB;
    private JLabel hangmanImage, categoryLabel, hiddenWordLabel, resultLabel, wordLabel;
    private JButton[] letterButtons;
    private JDialog resultDialog;
    public Ui(){
        super("Wisielec");
        setSize(new Dimension(540,760));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(Color.decode("#101820"));

        //Inicjalizujemy zmienne
        wordDB = new WordDB();
        letterButtons = new JButton[26];
        wordChallenge = wordDB.loadChallenge();
        createResultDialog();

        addGuiComponents();
    }

    private void addGuiComponents(){
        //Zdjęcie wisielca
        hangmanImage = CustomTools.loadImage("resources/1.png");
        hangmanImage.setBounds(0,0,hangmanImage.getPreferredSize().width, hangmanImage.getPreferredSize().height);
        //Pole kategorii
        categoryLabel = new JLabel(wordChallenge[0]);
        categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoryLabel.setOpaque(true);
        categoryLabel.setForeground(Color.WHITE);
        categoryLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        categoryLabel.setBackground(Color.decode("#4C4E52"));
        categoryLabel.setBorder(BorderFactory.createLineBorder(Color.decode("#4C4E52")));
        categoryLabel.setBounds(0,hangmanImage.getPreferredSize().height-28,540,categoryLabel.getPreferredSize().height);
        //Pole słowa do odgadnięcia
        hiddenWordLabel = new JLabel(CustomTools.hideWords(wordChallenge[1]));
        hiddenWordLabel.setForeground(Color.WHITE);
        hiddenWordLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hiddenWordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hiddenWordLabel.setBounds(0, categoryLabel.getY() + categoryLabel.getPreferredSize().height + 50, 540, hiddenWordLabel.getPreferredSize().height);
        //Przyciski liter
        GridLayout gridLayout = new GridLayout(4,7);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(-5,hiddenWordLabel.getY() + hiddenWordLabel.getPreferredSize().height, 540, 320);
        buttonPanel.setLayout(gridLayout);
        //Tworzymy przyciski z literami
        for(char c = 'A'; c<= 'Z'; c++){
            JButton button = new JButton(Character.toString(c));
            button.setBackground(Color.decode("#14212D"));
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            button.addActionListener(this);
            //Używamy wartości ASCII do obliczenia bieżącego indeksu
            int currentIndex = c -'A';

            letterButtons[currentIndex] = button;
            buttonPanel.add(letterButtons[currentIndex]);
        }
        //Przycisk reset
        JButton resetButton = new JButton("Reset");
        resetButton.setForeground(Color.WHITE);
        resetButton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        resetButton.setBackground(Color.decode("#4C4E52"));
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        //Przycisk wyjścia z gry
        JButton quitButton = new JButton("Wyjdź");
        quitButton.setForeground(Color.WHITE);
        quitButton.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        quitButton.setBackground(Color.decode("#4C4E52"));
        quitButton.addActionListener(this);
        buttonPanel.add(quitButton);

        getContentPane().add(categoryLabel);
        getContentPane().add(hangmanImage);
        getContentPane().add(hiddenWordLabel);
        getContentPane().add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Reset") || command.equals("Restart")){
            resetGame();

            if(command.equals("Restart")){
                resultDialog.setVisible(false);
            }
        }else if(command.equals("Wyjdź")){
            dispose();
            return;
        }else{
            //Wyłączenie przycisków
            JButton button = (JButton) e.getSource();
            button.setEnabled(false);
            //Sprawdzamy, czy słowo zawiera zgadywaną literę użytkownika
            if(wordChallenge[1].contains(command)){
                //Zmieniamy kolor przycisku na zielony, aby wskazać, że użytkownik odgadł litere
                button.setBackground(Color.GREEN);
                //Przechowujemy ukryte słowo w tablicy znaków, aby zaktualizować ukryty tekst
                char[] hiddenWord = hiddenWordLabel.getText().toCharArray();

                for(int i = 0; i < wordChallenge[1].length(); i++){
                    //Aktualizujemy znak _ na poprawną litere
                    if(wordChallenge[1].charAt(i) == command.charAt(0)){
                        hiddenWord[i] = command.charAt(0);
                    }
                }
                //Aktualizujemy etyktietę hiddenWordLabel
                hiddenWordLabel.setText(String.valueOf(hiddenWord));
                //Użytkownik odgadł słowo poprawnie
                if(!hiddenWordLabel.getText().contains("*")){
                    //Okno dialogowe z wiadomością o odgadnięciu słowa
                    resultLabel.setText("Brawo wygrałeś!");
                    resultDialog.setVisible(true);
                }

            }else{
                //Zmieniamy kolor przycisku na czerwony, aby wskazać, że użytkownik nie odgadł litery
                button.setBackground(Color.RED);
                //Zwiększamy licznik nieudanych prób o 1
                ++incorrectGuesses;
                //Aktualizujemy zdjęcie wisielca
                CustomTools.updateImage(hangmanImage, "resources/" + (incorrectGuesses + 1) + ".png");
                //Użytkownik nie odgadł słowa
                if(incorrectGuesses >= 6){
                    //Okno dialogowe z wiadomością o przegranej
                    resultLabel.setText("Niestety nie udało ci się, Spróbuj ponownie klikając w Restart");
                    resultDialog.setVisible(true);
                }
            }
            wordLabel.setText("Słowo: " + wordChallenge[1]);
        }
    }

    private void createResultDialog(){
        resultDialog = new JDialog();
        resultDialog.setTitle("Wynik");
        resultDialog.setSize(500,127);
        resultDialog.getContentPane().setBackground(Color.decode("#101820"));
        resultDialog.setResizable(false);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setModal(true);
        resultDialog.setLayout(new GridLayout(3, 1));
        resultDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                resetGame();
            }
        });

        resultLabel = new JLabel();
        resultLabel.setForeground(Color.WHITE);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        wordLabel = new JLabel();
        wordLabel.setForeground(Color.WHITE);
        wordLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton restartButton = new JButton("Restart");
        restartButton.setForeground(Color.WHITE);
        restartButton.setBackground(Color.decode("#4C4E52"));
        restartButton.addActionListener(this);

        resultDialog.add(resultLabel);
        resultDialog.add(wordLabel);
        resultDialog.add(restartButton);
    }
    private void resetGame(){
        //Losujemy kolejną kategorie i słowo, oraz resetujemy licznik nieudanych prób
        wordChallenge = wordDB.loadChallenge();
        incorrectGuesses = 0;
        //Aktualizujemy zdjęcie wisielca na początkowe
        CustomTools.updateImage(hangmanImage, "resources/1.png");
        //Przypisujemy do etykiety z kategorią, nową wylosowaną kategorie
        categoryLabel.setText(wordChallenge[0]);
        //Gwiazdkujemy nowo wylosowane słowo metodą hideWords z klasy CustomTools, oraz przypisujemy je do etykiety
        String hiddenWord = CustomTools.hideWords(wordChallenge[1]);
        hiddenWordLabel.setText(hiddenWord);
        //Włączamy przyciski z literami do odgadywania
        for(int i = 0; i < letterButtons.length; i++){
            letterButtons[i].setEnabled(true);
            letterButtons[i].setBackground(Color.decode("#14212D"));
        }
    }
}