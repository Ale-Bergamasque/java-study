package listas;

import java.util.ArrayList;
import java.util.List;

public class Ex1Palindromos {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("A base do teto desaba");
        lista.add("A batata e o tabaco");
        lista.add("Acuda cadela da Leda caduca");
        lista.add("Vida vivida");
        lista.add("Anotaram a data da maratona");
        lista.add("A torre da derrota");
        lista.add("A casa esta casada");
        lista.add("O galo ama o lago");
        lista.add("Oito Morros Altos");

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).replace(" ", "").toLowerCase();
            String frase = lista.get(i).replace(" ", "").toLowerCase();
            StringBuilder strb = new StringBuilder(frase);
            frase = strb.reverse().toString();

            if (frase.compareTo(lista.get(i).replace(" ", "").toLowerCase()) == 0) {
                System.out.println("'" + lista.get(i) + "'" + " é um palindromo.");
            }
        }
    }
}