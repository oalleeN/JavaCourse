package Secao10.example_vect_application;

import Secao10.example_vect_entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); // instanciamos a cada indice do vetor nomes e valores
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++)
            sum += vect[i].getPrice(); // para cada indice vamos pegar apenas os valores (getPrice)

        double avg = sum / n;
        System.out.printf("AVERAGE PRICE = %.2f", avg);


        sc.close();
    }
}


