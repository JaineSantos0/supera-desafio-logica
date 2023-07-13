import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanhoArray = sc.nextInt();
        int alvo = sc.nextInt();

        int[] numeros = new int[tamanhoArray];

        for(int i = 0; i < numeros.length; i++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        NumeroParesService service = new NumeroParesService();

        int quantidadePares = service.gerar(numeros, alvo);
        System.out.println(quantidadePares);
    }
}