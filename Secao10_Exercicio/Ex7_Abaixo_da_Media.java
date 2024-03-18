package Secao10_Exercicio;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

public class Ex7_Abaixo_da_Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int ent = sc.nextInt();

        double[] vetNum = new double[ent];

        for (int i = 0; i < vetNum.length; i++) {
            System.out.print("Digite um numero: ");
            vetNum[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < vetNum.length; i++) {
            soma += vetNum[i];
        }

        double media = soma / ent;
        System.out.println();
        System.out.printf("MÉDIA DO VETOR: %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vetNum.length; i++) {
            if (vetNum[i] < media){
                System.out.printf("%.1f\n", vetNum[i]);
            }
        }

        sc.close();
    }
}
