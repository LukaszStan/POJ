package zad3;

public class CarWorks extends Car{
    protected boolean works;

    public CarWorks(String color, String brand, boolean works) {
        super(color, brand);
        this.works = works;
    }
    public String Works(){
        return ("Does it work: " + works);
    }
    @Override
    public String toString(){
        return (this.Color + " " + this.Brand + " " + Works());
    }
}
