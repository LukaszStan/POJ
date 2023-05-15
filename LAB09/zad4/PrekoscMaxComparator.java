package zad4;

import java.util.Comparator;

public class PrekoscMaxComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik zawodnik1, Zawodnik zawodnik2){
        return Double.compare(zawodnik1.getMaxpredkosc(), zawodnik2.getMaxpredkosc());
    }
}
