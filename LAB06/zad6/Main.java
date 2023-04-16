package zad6;

public class Main {
    public static String usunNelement(int n, String... strings) {
        int count = 0;
        String res = "";
        for (String str : strings) {
            count++;
            if (count % n != 0) {
                res += (str + " ");
            }
        }
        return res;
    }

    public static void main(String[] args){
        String wynik = usunNelement(2, "Ala", "nie", "ma", "test", "kota i", "psa", "papugę");
        System.out.println(wynik);
    }

}
