package zad2;

public class Main {
    public static void main(String[] args){
        String[] productsBakery = {"Maka","Bagietka","Bulki","Chleb"};
        String[] productsBookshop = {"Podrecznik","Biografia","Encyklopedia"};
        Bakery bakery1 = new Bakery("Jelitkowska 14c",25, productsBakery);
        Bookshop book1 = new Bookshop("Marszałkowska 21b",15, productsBookshop);

        bakery1.getInformation();
        book1.getInformation();
    }
}
