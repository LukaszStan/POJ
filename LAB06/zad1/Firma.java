package zad1;

public class Firma {
    private Pracownik[] pracownicy;

    public Firma(Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }
    public double obliczMiesiecznyKosztFirmy(){
        double koszt = 0.0;
        for(Pracownik pracownik: pracownicy){
            koszt += pracownik.getMiesieczneWynagrodzenie();
        }
        return koszt;
    }
    public double obliczRocznyKosztFirmy(){
        return obliczMiesiecznyKosztFirmy()*12;
    }
    public double obliczKosztFirmy(Czas czas, int krotnosc){
        double koszt = 0.0;
        switch (czas) {
            case DZIEN -> {
                for (Pracownik pracownik : pracownicy) {
                    koszt += pracownik.dzienne_wynagrodzenie;
                }
                koszt *= krotnosc;
            }
            case MIESIAC -> koszt = obliczMiesiecznyKosztFirmy() * krotnosc;
            case ROK -> koszt = obliczRocznyKosztFirmy() * krotnosc;
            default -> {
            }
        }
        return koszt;
    }
}
