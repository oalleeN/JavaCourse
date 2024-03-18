package Secao10_Exercicio;

import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

public class Ex6_Soma_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int ent = sc.nextInt();

        int[] vetA = new int[ent];
        int[] vetB = new int[ent];
        int[] vetC = new int[ent];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < ent; i++) {
            vetA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < ent; i++) {
            vetB[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < ent; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }

        sc.close();
    }
}
