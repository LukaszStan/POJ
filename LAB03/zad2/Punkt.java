package zad2;
import java.util.Scanner;
import java.lang.Math;
public class Punkt {
    int x;
    int y;
    public Punkt(){
        x=0;
        y=0;
    }
    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void odlegloscPunktow1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długości punktu od którego chcesz obliczyć odległość");
        System.out.println("x: ");
        int x2 = scan.nextInt();
        System.out.println("y: ");
        int y2 = scan.nextInt();
        System.out.println("Odległość między tymi punktami wynosi: " + Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2)) );
    }
    public void odlegloscPunktow2(Punkt xy){
        int sumX = xy.x - x;
        int sumY = xy.y - y;
        System.out.println("Odległość między tymi punktami wynosi: " + Math.sqrt(Math.pow(sumX,2)+Math.pow(sumY,2)) );
    }
}
