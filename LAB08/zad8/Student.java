package zad8;

public class Student implements Comparable<Student>{
    private String imie;
    private String nazwisko;
    private String indeks;

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    @Override
    public int compareTo(Student other) {
        return this.indeks.compareTo(other.indeks);
    }
}
