import java.util.HashSet;
import java.util.Set;

public class NumeroParesService {

    public int gerar(int[] numeros, int valorAlvo) {

        Set<Integer> numerosSet = new HashSet<>();
        int contadorPares = 0;

        for (int numero: numeros) {
            if (numerosSet.contains(numero - valorAlvo)) {
                contadorPares ++;
            }
            if (numerosSet.contains(numero + valorAlvo)) {
                contadorPares++;
            }

            numerosSet.add(numero);
        }

        return contadorPares;
    }
}