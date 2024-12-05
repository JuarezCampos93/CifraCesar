package br.cesar.crypto;

import java.util.HashMap;
import java.util.Map;

public class Criptoanalise {
    public static void analisarFrequencia(String texto) {
        Map<Character, Integer> frequencias = new HashMap<>();
        int totalLetras = 0;

        // Contar a frequência de cada letra
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequencias.put(c, frequencias.getOrDefault(c, 0) + 1);
                totalLetras++;
            }
        }

        // Exibir as frequências
        System.out.println("\nFrequências de letras no texto:");
        for (Map.Entry<Character, Integer> entrada : frequencias.entrySet()) {
            double porcentagem = (entrada.getValue() / (double) totalLetras) * 100;
            System.out.printf("%c: %d (%.2f%%)\n", entrada.getKey(), entrada.getValue(), porcentagem);
        }
    }
}
