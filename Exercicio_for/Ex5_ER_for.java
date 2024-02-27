package Exercicio_for;

import java.sql.SQLOutput;
import java.util.Scanner;

///Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.
public class Ex5_ER_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fac = 1;
        for ( int i=1 ; i<=n ; i++ ){
            fac = fac * i;
        }
        System.out.println(fac);

        /// or

        for ( int i=n ; i>=1 ; i-- ){
            fac = fac * i;
        }
        System.out.println(fac);

        sc.close();

    }
}
