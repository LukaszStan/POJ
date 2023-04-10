package zad1;

public class Dog extends Animal{
    public Dog (String name, String color){
        super(name, color);
    }

    public void makeSound(){
        System.out.println("Woof woof " + name + " " + color);
    }
}
