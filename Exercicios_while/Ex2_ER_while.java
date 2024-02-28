package Exercicios_while;

///Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Ex2_ER_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();


        String rsp = "";

        while (x != 0 && y != 0){
            if (x > 1 && y > 1){
                rsp = "Primeiro quadrante";

            } else if (x < 0 && y > 1){
                rsp = "Segundo quadrante";

            } else if (x < 0 && y < 0){
                rsp = "Terceiro quadrante";

            } else {
                rsp = "Quarto quadrante";
            }
            System.out.println(rsp);

            System.out.print("Digite o valor de X: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextInt();

        }

        sc.close();

    }
}
