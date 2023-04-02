package zad5;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Marek", 2, 12);
        Zawodnik zawodnik2 = new Zawodnik("Jonasz", 3, 10);
        Zawodnik zawodnik3 = new Zawodnik("Anna", 4, 13);

        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik3.przedstawSie();

        Zawodnik zwyciezca = null;
        int dystans = 0;

        while (dystans < 50) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();

            dystans = Math.max(zawodnik1.getPokonanaOdleglosc(), Math.max(zawodnik2.getPokonanaOdleglosc(), zawodnik3.getPokonanaOdleglosc()));

            if (dystans >= 50) {
                if (dystans == zawodnik1.getPokonanaOdleglosc()) {
                    zwyciezca = zawodnik1;
                } else if (dystans == zawodnik2.getPokonanaOdleglosc()) {
                    zwyciezca = zawodnik2;
                } else if (dystans == zawodnik3.getPokonanaOdleglosc()) {
                    zwyciezca = zawodnik3;
                }
                break;
            }
        }

        System.out.println("Zwycięzcą wyścigu jest: " + zwyciezca.getImie() + ", przebiegł(a) " + zwyciezca.getPokonanaOdleglosc() + " km");
    }
}
