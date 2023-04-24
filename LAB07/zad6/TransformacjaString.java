package zad6;


import java.util.regex.Matcher;

public class TransformacjaString {
    public static String usunZnaki(String tekst, Znak znak) {
        String znakiDoUsuniecia = switch (znak) {
            case SPOLGLOSKA -> "[^a-zA-Z]";
            case SAMOGLOSKA -> "[^aeiouAEIOU]";
            case SPACJA -> "\\s";
            case LICZBA -> "\\d";
            case ZNAK_SPECJALNY -> "[^\\w\\s]";
        };
        return tekst.replaceAll(znakiDoUsuniecia, "");
    }

    public static String podmienZnaki(String tekst, Znak znak, String podmien) {
        String znakiDoPodmiany = switch (znak) {
            case SPOLGLOSKA -> "a-zA-Z&&[^aeiouAEIOU]";
            case SAMOGLOSKA -> "[aeiouAEIOU]";
            case SPACJA -> "\\s";
            case LICZBA -> "\\d";
            case ZNAK_SPECJALNY -> "\\W";
        };
        return tekst.replaceAll(znakiDoPodmiany, Matcher.quoteReplacement(podmien));
    }

    public static String pozostawZnaki(String tekst, Znak znak) {
        String dozwoloneZnaki = switch (znak) {
            case SPOLGLOSKA -> "a-zA-Z&&[^aeiouAEIOU]";
            case SAMOGLOSKA -> "[aeiouAEIOU]";
            case SPACJA -> "\\s";
            case LICZBA -> "\\d";
            case ZNAK_SPECJALNY -> "\\W";
        };
        return tekst.replaceAll("[^" + dozwoloneZnaki + "^]", "");
    }
}
