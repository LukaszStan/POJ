package zad3;

public class CarType extends Car {
    private String type;

    public CarType(String color, String brand, String type) {
        super(color, brand);
        this.type = type;
    }
    public String Type(){
        return ("Car type: " + type);
    }
    @Override
    public String toString(){
        return (this.Color + " " + this.Brand + " " + Type());
    }
}
