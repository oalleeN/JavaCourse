
import java.util.Scanner;

import static java.util.Locale.*;

public class Rascunho {
    public static void main(String[] args){

        setDefault(US);

        Scanner sc = new Scanner(System.in);

        String w;
        int x;
        double y;
        char z;

        System.out.print("Digite seu nome: ");
        w = sc.next();

        System.out.print("Digite sua idade: ");
        x = sc.nextInt();

        System.out.print("Digite seu peso: ");
        y = sc.nextDouble();

        System.out.print("Digite letras... ");
        z = sc.next().charAt(1);

        System.out.println("Seu nome é: " + w);
        System.out.println("Sua idade é: " + x);
        System.out.printf("Seu peso é de: %.2f%n", y);
        System.out.println("Seu segundo caractere: " + z);

        sc.close(); // toda vez que iniciar um "Scanner", vamos dar um "close" logo em seguida

    }

}
