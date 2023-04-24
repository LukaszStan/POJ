package zad5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private Integer numerDomu;
    private Integer numerLokalu;

    public Lokal(String nazwaLokalu, String adres) {
        this.nazwaLokalu = nazwaLokalu;

        String pattern = "(.*),\\s(\\d+-\\d+)\\s(.+)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(adres);

        if (m.find()) {
            this.ulica = m.group(1);
            this.kodPocztowy = m.group(2);
            String[] miejscowoscNumer = m.group(3).split("\\s");
            this.miejscowosc = miejscowoscNumer[0];

            if (miejscowoscNumer.length > 1) {
                String numer = miejscowoscNumer[1];
                if (numer.contains("/")) {
                    String[] numerDomuLokalu = numer.split("/");
                    this.numerDomu = Integer.parseInt(numerDomuLokalu[0]);
                    this.numerLokalu = Integer.parseInt(numerDomuLokalu[1]);
                } else {
                    this.numerDomu = Integer.parseInt(numer);
                }
            }
        } else {
            throw new IllegalArgumentException("Błędny format adresu");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazwaLokalu).append("\n")
                .append("Miasto: ").append(miejscowosc).append("\n")
                .append("Ulica: ").append(ulica).append("\n")
                .append("Numer domu/lokalu: ");
        if (numerDomu != null) {
            sb.append(numerDomu);
        }
        if (numerLokalu != null) {
            sb.append("/").append(numerLokalu);
        }
        sb.append("\n")
                .append("Kod pocztowy: ").append(kodPocztowy);
        return sb.toString();
    }
}
