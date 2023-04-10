package zad1;

public class Cat extends Animal{
    public Cat (String name, String color) {
        super(name, color);
    }
    public void makeSound(){
        System.out.println("Miau miau " + name + " " + color);
    }
}
