package Secao10_Exercicio;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

import java.util.Scanner;

public class Ex9_Mais_Velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int ent = sc.nextInt(); // entradas

        String[] nome = new String[ent];
        int[] idade = new int[ent];

        for (int i = 0; i < ent; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        int maior = idade[0];
        int maisVelha = 0;
        for (int i = 0; i < ent; i++) {
            if (idade[i] >= maior){
                maior = idade[i];
                maisVelha = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nome[maisVelha]);
        sc.close();
    }
}
