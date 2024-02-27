package Exercícios_while;
///Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
import java.util.Scanner;

public class Ex3_ER_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int perg = sc.nextInt();
        int alcool = 0;
        int gasol = 0;
        int diesel = 0;

        while (perg != 4){
            switch (perg){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasol += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    break;
            }
            perg = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasol);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
