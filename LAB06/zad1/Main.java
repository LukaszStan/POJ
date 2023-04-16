package zad1;

public class Main {
    public static void main(String[] args){
        Pracownik[] pracownicy = {
                new Pracownik("Jan","Kowalski",250.0),
                new Pracownik("Marcel","Markowski",150.0),
                new Pracownik("Joanna","Piórkowska",50.0)
        };

        Firma firma = new Firma(pracownicy);

        System.out.println("Miesięczny koszt firmy: " + firma.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt firmy: " + firma.obliczRocznyKosztFirmy());
        System.out.println("Koszt firmy przez 6 miesięcy: " + firma.obliczKosztFirmy(Czas.MIESIAC, 6));
    }
}
