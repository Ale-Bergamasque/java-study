package listas;

import java.util.ArrayList;
import java.util.List;

public class Ex4OrdemAlfabetica {

    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("PEDRO");
        listaNomes.add("ANA");
        listaNomes.add("LUCAS");
        listaNomes.add("MARIA");
        listaNomes.add("TALITA");
        listaNomes.add("JHONSON");
        listaNomes.add("AMANDA");
        listaNomes.add("JOICE");
        listaNomes.add("MARIO");
        listaNomes.add("CARLOS");
        listaNomes.add("JENIFER");

        listaNomes.sort((nome1, nome2) -> nome1.compareTo(nome2) );

        System.out.println(listaNomes);
    }
}
