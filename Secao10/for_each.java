package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vector = new String[] {"Danilo", "Alan", "Julia", "Sophia", "Ayla"};

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("-------------");
        for (String nomes : vector) { // para cada obejto "nomes" contido em "vector", faça:
            System.out.println(nomes);
        }

        sc.close();
    }
}
