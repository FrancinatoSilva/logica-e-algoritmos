package arrays;

import java.util.Scanner;

public class InverteString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();

        char[] arrayPalavra = palavra.toCharArray();
        char[] palavraInverte = new char[arrayPalavra.length];

        for (int i = 0; i < arrayPalavra.length; i++) {

            palavraInverte[i] = arrayPalavra[arrayPalavra.length - i - 1];
        }

        for (int i = 0; i < palavraInverte.length; i++) {
            System.out.print(palavraInverte[i]);
        }


        sc.close();

    }
}
