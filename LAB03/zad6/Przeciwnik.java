package zad6;

public class Przeciwnik {
    int pktZycia=20;
    int atak;
    String bron;
    String zbroja;
    boolean dead = false;

    public Przeciwnik(){

    }
    public void latwyPrzeciwnik(){
        bron = "drewniany miecz";
        atak = 2;
        zbroja = "skorzna zbroja";
        pktZycia += 5;
    }
    public void sredniPrzeciwnik(){
        bron = "stalowy miecz";
        atak = 5;
        zbroja = "stalowa zbroja";
        pktZycia += 10;
    }
    public void trudnyPrzeciwnik(){
        bron = "zloty miecz";
        atak = 10;
        zbroja = "zlota zbroja zbroja";
        pktZycia += 20;
    }
    public int losowaniePrzeciwnik(){
        int min = 1;
        int max = 10;
        int random_intP = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_intP;
    }
}
