package zad4;

import java.util.Random;

public class Moneta {
    private Random rand = new Random();

    public String rzut() {
        if (rand.nextBoolean()) {
            return "orzeł";
        } else {
            return "reszka";
        }
    }
}
