package Introducao_OOP.MembrosEstaticos2.application;

import Introducao_OOP.MembrosEstaticos2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Versao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); // metodos estaticos

        double v = Calculator.volume(radius); // metodo estatico

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI); // constante estatica

        sc.close();
    }

}
