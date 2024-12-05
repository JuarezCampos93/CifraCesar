package br.cesar.crypto;

import java.util.Scanner;

public class CifraDeCesar {
    public static String encriptar(String texto, int chave) {
        StringBuilder resultado = new StringBuilder();
        chave = chave % 26; // Garantir que a chave esteja dentro do intervalo do alfabeto

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + chave) % 26 + base);
            }
            resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto para encriptar: ");
        String texto = scanner.nextLine();
        System.out.print("Digite a chave de deslocamento: ");
        int chave = scanner.nextInt();

        String encriptado = encriptar(texto, chave);
        System.out.println("Texto encriptado: " + encriptado);

        // Passar o texto encriptado para análise
        Criptoanalise.analisarFrequencia(encriptado);
    }
}
