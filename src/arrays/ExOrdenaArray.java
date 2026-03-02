package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExOrdenaArray {
    void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] inputDeNumeros = new int[5];
        ArrayList<Integer> numerosPares = new ArrayList<>();
        int[] numerosOrdenados = new int[inputDeNumeros.length];

        for (int i = 0; i < inputDeNumeros.length; i++) {

            System.out.print("Insira o numero da posição " + (i+1) + ": ");
            inputDeNumeros[i] = input.nextInt();

        }

        System.out.println("Analisando numeros pares...");
        for (int i = 0; i < inputDeNumeros.length; i++) {

            if (inputDeNumeros[i] % 2 == 0){
                numerosPares.add(inputDeNumeros[i]);
            }
        }

        Collections.sort(numerosPares);

        System.out.println("Exibindo números ordenadados: " +  numerosPares + " | ");

        input.close();

    }
}
