package br.simetricas.crypto;


public class CifraVigenere {
    public static String encriptar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        texto = texto.toUpperCase();
        chave = chave.toUpperCase();
        int chaveIndex = 0;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                int deslocamento = chave.charAt(chaveIndex) - 'A';
                char encriptado = (char) ((c - 'A' + deslocamento) % 26 + 'A');
                resultado.append(encriptado);
                chaveIndex = (chaveIndex + 1) % chave.length();
            } else {
                resultado.append(c); // Manter caracteres não alfabéticos
            }
        }
        return resultado.toString();
    }
}
