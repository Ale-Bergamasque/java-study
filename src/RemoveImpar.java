import java.util.ArrayList;
import java.util.List;

public class RemoveImpar {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(4);
        lista.add(8);
        lista.add(13);
        lista.add(17);
        lista.add(22);
        lista.add(15);
        lista.add(31);

        for(int i = lista.size() - 1 ; i >= 0 ; i--) {
            if(lista.get(i) % 2 != 0) {
                lista.remove(i);

            }
        }
        System.out.println(lista);
    }
}
