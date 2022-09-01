package listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex3Decrescente {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(15);
        lista.add(6);
        lista.add(12);
        lista.add(90);
        lista.add(800);
        lista.add(1);
        lista.add(25);
        lista.add(400);
        lista.add(2);
        lista.add(9);
        lista.add(2);

        lista.sort(((n1, n2) -> n2.compareTo(n1)));

        System.out.println(lista);
    }
}
