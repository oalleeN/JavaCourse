package Secao10_Exercicio;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
*/
public class Ex4_Numeros_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetNum = new int[n];

        for (int i = 0; i < vetNum.length; i++) {
            System.out.print("Digite um numero: ");
            vetNum[i] = sc.nextInt();
        }
        int numPar = 0;
        System.out.println("NUMEROS PARES:  ");
        for (int i = 0; i < vetNum.length; i++) {
            if (vetNum[i] % 2 == 0) {
                System.out.printf("%d ", vetNum[i]);
                numPar++;
            }
        }
        System.out.println("\n\nQuantidade de numeros pares = " + numPar);

        sc.close();
    }
}
