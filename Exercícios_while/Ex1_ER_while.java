package Exercícios_while;

///Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
///incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
///impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ex1_ER_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        String resultado = "Acesso permitido!";

        while (valor != 2002) {
            System.out.println("Senha inválida!");
            valor = sc.nextInt();
        }
        System.out.println(resultado);
        sc.close();
    }
}
