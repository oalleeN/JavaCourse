package Exercicios_for;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo
public class Ex7_ER_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            int v1 = (int) Math.pow(i, 2);
            int v2 = (int) Math.pow(i, 3);

            System.out.printf("%d %d %d%n", i, v1, v2);
        }

        sc.close();
    }
}
