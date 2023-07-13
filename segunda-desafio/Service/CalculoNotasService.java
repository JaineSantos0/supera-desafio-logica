public class CalculoNotasService {

    public void calcular(Double dinheiro) {

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS: ");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = (int) (dinheiro/notas[i]);
            dinheiro %= notas[i];
            double nota = notas[i];

            System.out.printf("%d nota(s) de R$ %.2f \n",quantidade,nota);
        }

        System.out.println("MOEDAS: ");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = (int) (dinheiro/moedas[i]);
            dinheiro %= moedas[i];
            double moeda = moedas[i];

            System.out.printf("%d moeda(s) de R$ %.2f \n",quantidade,moeda);
        }
    }
}