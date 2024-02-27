package Exercicio_for;

import java.util.Scanner;

///Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
public class Ex2_ER_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma_in = 0;
        int soma_out = 0;

        for ( int i=0 ; i<N ; i++ ){
            int X = sc.nextInt();
            if (X >= 10 && X <= 20){
                soma_in += 1;
            }
            else{
                soma_out += 1;
            }
        }

        System.out.println(soma_in + " in");
        System.out.println(soma_out + " out");

        sc.close();
    }
}
