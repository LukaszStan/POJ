package zad2;

public class Bakery extends Shop{
    private String[] products;
    public Bakery(String adress, int size, String[] products) {
        super(adress, size);
        this.products = products;
    }
    @Override
    public void getInformation(){
        System.out.println(adress + ", " + size + " m2");
        System.out.println("Przykładowe produkty: ");
        for(String str: products){
            System.out.println(str);
        }
    }
}
