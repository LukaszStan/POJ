package zad2;

public class Shop {
    protected String adress;
    protected int size;

    public Shop(String adress, int size) {
        this.adress = adress;
        this.size = size;
    }
    public void getInformation(){
        System.out.println(adress+" "+size);
    }
}
