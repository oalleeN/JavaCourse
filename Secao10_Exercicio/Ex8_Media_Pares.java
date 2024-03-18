package Secao10_Exercicio;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

public class Ex8_Media_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos valores você vai precisar? ");
        int ent = sc.nextInt();

        int[] vetNum = new int[ent];

        for (int i = 0; i < vetNum.length; i++) {
            System.out.print("Digite um número: ");
            vetNum[i] = sc.nextInt();
        }
        int soma = 0;
        int tam = 0;
        for (int i = 0; i < vetNum.length; i++) {
            if (vetNum[i] % 2 == 0) {
                soma += vetNum[i];
                tam++;
            }
        }

        double media = (double) soma / tam;
        if (tam == 0) {
            System.out.println("NENHUM NUMERO PAR!");
        } else{
            System.out.printf("MÉDIA DOS PARES = %.1f", media);
        }

        sc.close();
    }
}