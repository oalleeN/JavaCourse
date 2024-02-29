package OutroTopicos;

import java.util.Scanner;

public class aula_outrosTpJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; // 35
        int num = sc.nextInt();
        if ((num & mask) != 0){
            System.out.println("6 bit é verdadeiro!");
        } else{
            System.out.println("6 bit é falso!");
        }

        sc.close();


    }
}
