package Secao10_Exercicio;
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Ex3_Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitas? ");
        int pessoas = sc.nextInt();

        String[] nome = new String[pessoas];
        int[] idade = new int[pessoas];
        double[] altura = new double[pessoas];

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        int menor16 = 0;

        for (int i = 0; i < idade.length; i++) {
            soma += altura[i];
            if (idade[i] < 16){
                menor16++;
            }
        }

        double porcen = menor16 * 100.0 / idade.length ;
        double alturaMedia = soma / altura.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcen);
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
