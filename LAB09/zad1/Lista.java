package zad1;
public class Lista <E>{
    private E[] lista;
    private int rozmiar;

    public Lista(int rozmiar){
        this.rozmiar = rozmiar;
        lista = (E[]) new Object[rozmiar];
    }

    public boolean dodaj(E element){
        for(int i= 0; i<rozmiar;i++){
            if(lista[i]==null){
                lista[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(E element){
        for(int i = 0; i < rozmiar; i++){
            if(element.equals(lista[i])){
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        for(int i = 0; i < rozmiar; i++){
            if(element.equals(lista[i])){
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element){
        for(int i = rozmiar - 1; i >= 0; i--){
            if(element.equals(lista[i])){
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks){
        if(indeks >= 0 && indeks < rozmiar){
            return lista[indeks];
        }
        else {
            throw new IndexOutOfBoundsException("Nieprawidłowy indeks");
        }
    }

    public boolean podmienElement(int indeks, E element){
        if (indeks>=0 && indeks < rozmiar){
            lista[indeks] = element;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
