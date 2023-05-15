package zad1;

public class Main {
    public static void main(String[] args) {
        Lista<String> listaStringow = new Lista<>(5);
        listaStringow.dodaj("abc");
        listaStringow.dodaj("def");
        listaStringow.dodaj("ghi");
        listaStringow.dodaj("abc");
        listaStringow.dodaj("xyz");

        System.out.println(listaStringow);

        System.out.println("Czy lista zawiera 'def'? " + listaStringow.czyZawiera("def"));

        System.out.println("Indeks pierwszego wystąpienia 'abc': " + listaStringow.zwrocIndeks("abc"));

        System.out.println("Indeks ostatniego wystąpienia 'abc': " + listaStringow.zwrocOstatniIndeks("abc"));

        System.out.println("Element 2 ma wartość: " + listaStringow.zwrocElement(2));

        System.out.println("Czy zamiana elementu 'xyz' na 'zyx' udała się: " + listaStringow.podmienElement(4,"zyx"));

        System.out.println(listaStringow);
    }
}
