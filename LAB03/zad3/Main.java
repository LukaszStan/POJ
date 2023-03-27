package zad3;

public class Main {
    public static void main(String[] args){
        TV samsung = new TV(4,6,false);
        Remote pilot = new Remote(samsung);
        pilot.turnTv();
        pilot.changeChannel();
        pilot.changeVolume();
    }
}
