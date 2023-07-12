import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantNumeros = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < quantNumeros; i++) {
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        OrdenarValoresService service = new OrdenarValoresService();

        service.organizar(numeros);
    }
}