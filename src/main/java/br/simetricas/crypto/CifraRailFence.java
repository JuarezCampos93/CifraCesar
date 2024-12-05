package br.simetricas.crypto;


public class CifraRailFence {
    public static String encriptar(String texto, int trilhos) {
        if (trilhos <= 1) return texto; // Nenhuma transformação

        StringBuilder[] linhas = new StringBuilder[trilhos];
        for (int i = 0; i < trilhos; i++) {
            linhas[i] = new StringBuilder();
        }

        int linhaAtual = 0;
        boolean descendo = true;

        for (char c : texto.toCharArray()) {
            linhas[linhaAtual].append(c);

            if (linhaAtual == trilhos - 1) descendo = false;
            else if (linhaAtual == 0) descendo = true;

            linhaAtual += descendo ? 1 : -1;
        }

        StringBuilder resultado = new StringBuilder();
        for (StringBuilder linha : linhas) {
            resultado.append(linha);
        }
        return resultado.toString();
    }
}
