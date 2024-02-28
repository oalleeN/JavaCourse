package Exercicio_for;

import java.util.Scanner;

public class aula_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leia = sc.nextInt();
        int soma = 0;

        for ( int v=0 ; v<leia ; v++ ){
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("A soma dos valores propostos é igual à " + soma);

        sc.close();
    }
} /// sou o Alan
