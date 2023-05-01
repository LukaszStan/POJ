package zad7;

public class Kwadrat implements Figura{
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    @Override
    public double obliczPole(){
        return bok*bok;
    }
    @Override
    public double obliczObwod(){
        return 4*bok;
    }
}
