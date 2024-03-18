package Secao10_Exercicio;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

import java.util.Locale;
import java.util.Scanner;

public class Ex5_Maior_Posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int ent = sc.nextInt();

        double[] vetNum = new double[ent];

        int posMaiVal = 0;

        for (int i = 0; i < vetNum.length; i++) {
            System.out.print("Digite um numero: ");
            vetNum[i] = sc.nextDouble();
        }
        double maiorVal = vetNum[0];
        for (int i = 0; i < vetNum.length; i++) {
            if (vetNum[i] >= maiorVal) {
                maiorVal = vetNum[i];
                posMaiVal = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maiorVal);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posMaiVal);
        sc.close();
    }
}
