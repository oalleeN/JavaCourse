package Introducao_OOP.MembrosEstaticos1.application;

import Introducao_OOP.MembrosEstaticos1.util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Versao1e2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        Calculator calc = new Calculator();

        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

}
