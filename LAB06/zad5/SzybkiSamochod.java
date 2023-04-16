package zad5;

public class SzybkiSamochod extends Samochod{
    public SzybkiSamochod(String kolor, String marka, int rocznik) {
        super(kolor, marka, rocznik);
    }
    @Override
    public void przyspiesz(){
        super.przyspiesz();
        if (getPredkosc() > 200) {
            setPredkosc(200);
        }
    }
}
