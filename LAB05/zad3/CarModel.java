package zad3;

public class CarModel extends Car {
    private String model;

    public CarModel(String color, String brand, String model) {
        super(color, brand);
        this.model = model;
    }
    public String Model(){
        return ("Car model: " + model);
    }
    @Override
    public String toString(){
        return (this.Color + " " + this.Brand + " " + Model());
    }
}
