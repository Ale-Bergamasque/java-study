package listas;

import java.util.ArrayList;
import java.util.List;

public class Ex2VogaisConsoantes {

    public static void main(String[] args) {

        List<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");

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

        List<String> nomesIniciacosComVogal = new ArrayList<>();
        List<String> nomesIniciadosComConsoante = new ArrayList<>();

        for (int i = listaNomes.size() - 1 ; i >= 0 ; i--) {
            for(int j = 0 ; j < vogais.size() ; j++){
                String letra = String.valueOf(listaNomes.get(i).charAt(0));

                if (vogais.get(j).compareTo(letra) == 0) {
                    nomesIniciacosComVogal.add(listaNomes.get(i));
                    listaNomes.remove(listaNomes.get(i));
                }
            }
        }
        nomesIniciadosComConsoante = listaNomes;

        System.out.println(nomesIniciacosComVogal);
        System.out.println(nomesIniciadosComConsoante);
    }
}
