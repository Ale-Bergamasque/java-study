import java.util.ArrayList;
import java.util.List;

public class OrdemCrescente {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(30);
        lista.add(12);
        lista.add(7);
        lista.add(50);
        lista.add(500);
        lista.add(3);

        lista.sort( (n1, n2) -> Integer.compare(n1, n2) );

        System.out.println(lista);
    }
}
