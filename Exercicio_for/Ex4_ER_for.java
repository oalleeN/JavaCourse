package Exercicio_for;

import java.util.Scanner;

///Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class Ex4_ER_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for ( int i=0 ; i<N ; i++){
            int num = sc.nextInt();
            int den = sc.nextInt();
            if (den == 0){
                System.out.println("Divisão impossível!");
            }
            else{
                double div = (double) num / den; /// indicar a linguagem que ela tem que seguir pelo tipo "double"
                System.out.printf("%.2f%n", div);

            }

        }

        sc.close();
    }
}
