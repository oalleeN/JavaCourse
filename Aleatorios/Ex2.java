package Aleatorios;

import java.util.Scanner;

public class Ex2 {
    public Ex2() {
    }

    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int a = sm.nextInt();
        int b = sm.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        sm.close();
    }
}
