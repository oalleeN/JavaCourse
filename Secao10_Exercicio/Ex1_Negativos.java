package Secao10_Exercicio;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Scanner;

public class Ex1_Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você quer digitar: ");
        int opc = sc.nextInt();

        int[] vetNum = new int[opc];

        for (int i = 0; i<vetNum.length; i++) {
            System.out.print("Digite um número: ");
            vetNum[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Números negativos: ");
        int negativos = 0;
        for (int i = 0; i<vetNum.length; i++) {
            if (vetNum[i] < 0) {
                negativos = vetNum[i];
                System.out.println(negativos);
            }
        }
        sc.close();
    }
}
