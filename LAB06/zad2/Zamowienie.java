package zad2;

public class Zamowienie {
    private Pozycja[] pozycje;
    private int maksRozmiar;

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }
    public Zamowienie(){
        this.maksRozmiar = 10;
        pozycje = new Pozycja[maksRozmiar];
    }
    public void dodajPozycje(Pozycja pozycja){
        if (pozycje[pozycje.length - 1] != null) {
            System.out.println("Nie można dodać pozycji. Maksymalna ilość pozycji została osiągnięta.");
            return;
        }
        for(int i = 0; i < pozycje.length; i++){
            if (pozycje[i] == null){
                pozycje[i] = pozycja;
                break;
            }
        }
    }
    public double obliczWartosc(){
        double suma = 0;
        for (Pozycja pozycja : pozycje){
            if (pozycja != null){
                suma += pozycja.obliczWartosc();
            }
        }
        return suma;
    }
    @Override
    public String toString(){
        System.out.println("Zamówienie");
        for (Pozycja pozycja : pozycje) {
            if (pozycja != null) {
                System.out.println(pozycja.toString());
            }
        }
        return ("Razem: " + obliczWartosc() + " zł");
    }
}
