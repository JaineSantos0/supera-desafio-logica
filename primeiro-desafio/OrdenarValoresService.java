import java.util.Comparator;
import java.util.List;

public class OrdenarValoresService {

    public List<Integer> ordenar (List<Integer> numeros) {

        Comparator<Integer> comp = (s1, s2) -> {
            if (s1 % 2 == 0 && s2 % 2 != 0) {
                return -1;
            } else if (s1 % 2 != 0 && s2 % 2 == 0) {
                return 1;
            } else if(s1 % 2 == 0 && s2 % 2 == 0) {
                return s1 - s2;
            } else {
                return s2 - s1;
            }
        };

        return numeros.stream().sorted(comp).toList();
    }

    public void organizar(List<Integer> numeros) {
        List<Integer> numerosOrdenados = ordenar(numeros);
        for (Integer numero: numerosOrdenados) {
            System.out.print(numero + "\n");
        }
    }
}