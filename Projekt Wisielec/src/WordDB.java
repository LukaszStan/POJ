import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class WordDB {
    //Zawiera klucz-> kategoria, wartość -> słowo
    private HashMap<String,String[]> wordList;
    //Używamy do wylosowania kategorii (nie możemy otrzymać losowego indexu w HashMap)
    private ArrayList<String> categories;

    public WordDB(){
        try{
            wordList = new HashMap<>();
            categories = new ArrayList<>();

            //Ścieżka pliku z słowami i kategoriami do zgadywania
            String filePath = getClass().getClassLoader().getResource("resources/data.txt").getPath();
            if(filePath.contains("%20")) filePath = filePath.replaceAll("%20"," ");
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            //Przechodzimy przez każdą linie w pliku data.txt
            String line;
            while ((line = reader.readLine()) != null){
                //Oddzielamy słowa i kategorie znakiem ","
                String[] parts = line.split(",");
                //Pierwsze słowo każdej linii oznacza kategorię
                String category = parts[0];
                categories.add(category);
                //Reszta wartości z tabeli parts to słowa odnoszące się do danej kategorii, wrzucamy je do nowej tabeli values
                String[] values = Arrays.copyOfRange(parts, 1, parts.length);
                wordList.put(category, values);

            }
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }

   public String[] loadChallenge(){
        Random rand = new Random();

        //Losujemy numer, aby wybrać kategorię
        String category = categories.get(rand.nextInt(categories.size()));

        //losujemy numer, aby wybrać słowo z danej kategorii
        String[] categoryValues = wordList.get(category);
        String word = categoryValues[rand.nextInt(categoryValues.length)];

        //[0] -> kategoria, [1] -> słowo
        return  new String[]{category.toUpperCase(), word.toUpperCase()};
   }
}
