package zad7;

public class Kolo implements Figura{
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }
    @Override
    public double obliczPole(){
        return Math.PI*promien*promien;
    }
    @Override
    public double obliczObwod(){
        return 2* Math.PI*promien;
    }
}
