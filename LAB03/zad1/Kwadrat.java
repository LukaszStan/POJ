package zad1;

public class Kwadrat {
    int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }
    public void obw(){
        System.out.println("Obwód kwadratu to: " + 4*bok);
    }
    public void pole(){
        System.out.println("Pole kwadratu to: " + bok*bok);
    }
}
