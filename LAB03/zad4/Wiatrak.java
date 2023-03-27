package zad4;

public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    float radius;
    String color;
    public Wiatrak(){
        speed = 1;
        on = true;
        radius = 1.5f;
        color = "white";
    }
    public Wiatrak(boolean on, int speed, float radius, String color){
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }
    public void informacje(){
        String speedtxt = null;
        switch (speed){
            case 1:
                speedtxt = "SLOW";
                break;
            case 2:
                speedtxt = "MEDIUM";
                break;
            case 3:
                speedtxt = "FAST";
                break;
            default:
                System.out.println("Prędkość może być tylko od 1-3");
        }
        System.out.println(on + " " + speedtxt + " " + radius + " " + color);
    }
}
