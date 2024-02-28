package Exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class bonus_ER_do {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double gC = sc.nextDouble();
            double gF = 9.0 * gC / 5.0 + 32.0;
            System.out.printf("Sua temperatura em Fahrenheit: %.1f%n", gF);
            System.out.print("Você deseja continuar? [s/n]: ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        System.out.println("Sistema finalizado!");

        sc.close();

    }
}
