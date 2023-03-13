public class zad6 {
    public static void nwd(int a, int b){
        int nwd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                nwd = i;
            }
        }
       System.out.println("NWD dla "+a+" i "+b+" wynosi: "+nwd);
    }
    public static void main(String[] args){
        int a = 15;
        int b = 30;
        nwd(a,b);
    }
}
