package zad3;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Yellow","Bmw");
        CarModel car2 = new CarModel("Black","Jaguar","XF");
        CarType car3 = new CarType("White","Maserati","Cabriolet");
        CarWorks car4 = new CarWorks("Blue","Skoda",false);

        Car[] cars = {car1,car2,car3,car4};

        for(Car car: cars){
            System.out.println(car);
        }
    }
}
