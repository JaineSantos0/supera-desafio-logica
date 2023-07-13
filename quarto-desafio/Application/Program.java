import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeDeFrases = sc.nextInt();
        List<String> frases = new ArrayList<>();

        for (int i = 0; i <= quantidadeDeFrases; i++) {
            String frase = sc.nextLine();
            frases.add(frase);
        }

        DesembaralhaFraseService service = new DesembaralhaFraseService();

        service.desembaralhar(frases);
    }
}