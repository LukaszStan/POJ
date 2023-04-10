package zad3;

public class Car {
    protected String Color;
    protected String Brand;

    public Car(String color, String brand) {
        this.Color = color;
        this.Brand = brand;
    }
    @Override
    public String toString(){
        return (this.Color + " " + this.Brand);
    }
}
