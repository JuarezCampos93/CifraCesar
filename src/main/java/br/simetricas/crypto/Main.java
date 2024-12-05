package br.simetricas.crypto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do texto
        System.out.print("Digite o texto para encriptar: ");
        String texto = scanner.nextLine();

        // Aplicação da cifra de Vigenère
        System.out.print("Digite a palavra-chave para a cifra de Vigenère: ");
        String chave = scanner.nextLine();
        String textoVigenere = CifraVigenere.encriptar(texto, chave);
        System.out.println("Texto após Vigenère: " + textoVigenere);

        // Aplicação da cifra Rail Fence
        System.out.print("Digite o número de trilhos para a cifra Rail Fence: ");
        int trilhos = scanner.nextInt();
        String textoRailFence = CifraRailFence.encriptar(textoVigenere, trilhos);
        System.out.println("Texto final após Rail Fence: " + textoRailFence);
    }
}
