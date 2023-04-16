package zad4;

public class Czas {
    int godziny;
    int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    @Override
    public String toString(){
        return (godziny + "h " + minuty + "min");
    }

    public Czas dodaj (Czas t){
        int sumaMinut = this.minuty + t.minuty;
        int sumaGodzin = this.godziny + t.godziny + sumaMinut/60 ;
        sumaMinut %= 60;
        return new Czas(sumaGodzin,sumaMinut);
    }

    public Czas odejmij (Czas t){
        int roznicaMinut = this.minuty - t.minuty;
        int roznicaGodzin = this.godziny - t.godziny - Math.floorDiv(roznicaMinut, 60);
        roznicaMinut = Math.floorMod(roznicaMinut, 60);
        return new Czas(roznicaGodzin,roznicaMinut);
    }
    public Czas pomnoz(int krotnosc) {
        int noweMinuty = this.minuty * krotnosc;
        int noweGodziny = this.godziny * krotnosc + noweMinuty / 60;
        noweMinuty %= 60;
        return new Czas(noweGodziny, noweMinuty);
    }
}
