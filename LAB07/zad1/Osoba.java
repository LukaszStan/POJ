package zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rok_urodzenia;

    public Osoba(String imie, String nazwisko, int rok_urodzenia) throws Exception {
        sprawdzDaneOsoby(imie, nazwisko, rok_urodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rok_urodzenia;
    }
    private void sprawdzDaneOsoby(String imie, String nazwisko, int rok_urodzenia) throws Exception{
        if (imie.isEmpty()){
            throw new Exception("Podano niewłaściwe imię!");
        }
        if (nazwisko.isEmpty()){
            throw new Exception("Podano niewłaściwe nazwisko!");
        }
        if (rok_urodzenia<1900 || rok_urodzenia>2020){
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }
    @Override
    public String toString(){
        return ("Imię: " + imie + ", " + "Nazwisko: " + nazwisko + ", " + "Rok urodzenia: " + rok_urodzenia);
    }
}
