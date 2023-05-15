package zad2i3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;
    private int rozmiar;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
        rozmiar = 0;
    }

    public boolean dodaj(K klucz, V wartosc){
        if(czyZawiera(klucz)){
            int indeks = znajdzIndeks(klucz);
            wartosci[indeks] = wartosc;
            return true;
        }
        else if(rozmiar < klucze.length){
            int wolnyIndeks = pierwszyWolnyIndeks();
            klucze[wolnyIndeks] = klucz;
            wartosci[wolnyIndeks] = wartosc;
            rozmiar++;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean czyZawiera(K klucz){
        String kluczString = klucz.toString();
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] != null && klucze[i].toString().equals(kluczString)) {
                return true;
            }
        }
        return false;
    }
    private int znajdzIndeks(K klucz){
        for(int i=0;i<klucze.length;i++){
            if (klucze[i]!=null && klucze[i].equals(klucz)){
                return i;
            }
        }
        return -1;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }
    public int wielkosc(){
        return rozmiar;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            int size = Integer.parseInt(line.trim());
            Slownik<String, String> slownik = new Slownik<>(size);

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("->");
                if (parts.length == 2) {
                    String klucz = parts[0].trim();
                    String wartosc = parts[1].trim();
                    slownik.dodaj(klucz, wartosc);
                }
            }

            return slownik;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
