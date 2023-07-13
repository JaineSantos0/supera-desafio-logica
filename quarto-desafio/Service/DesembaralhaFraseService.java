import java.util.List;

public class DesembaralhaFraseService {

    public void desembaralhar(List<String> frases) {

        int metadeComprimento = 0;
        int comprimento = 0;
        String linha = " ";
        for (int i = 0; i < frases.size(); i++) {
            StringBuilder resultado = new StringBuilder();
            linha = frases.get(i);
            comprimento = linha.length();
            metadeComprimento = comprimento / 2;

            for (int j = metadeComprimento - 1; j >= 0; j--) {
                resultado.append(linha.charAt(j));
            }

            for (int j = comprimento - 1; j >= metadeComprimento; j--) {
                resultado.append(linha.charAt(j));
            }

            System.out.println(resultado.toString());
        }
    }
}