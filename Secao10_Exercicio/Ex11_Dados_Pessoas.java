package Secao10_Exercicio;
import java.util.Locale;
import java.util.Scanner;
/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */
public class Ex11_Dados_Pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos dados você vai ler? ");
        int entrada = sc.nextInt();

        double[] altura = new double[entrada];
        char[] genero = new char[entrada];
        for (int i = 0; i < entrada; i++) {
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "ª pessoa: [M / F] ");
            genero[i] = sc.next().charAt(0);
        }

        double maiorAlt = altura[0];
        double menorAlt = altura[0];
        for (int i = 0; i < entrada; i++) {
            if (altura[i] >= maiorAlt) {
                maiorAlt = altura[i];
            } else if (altura[i] <= menorAlt){
                    menorAlt = altura[i];
            }
        }

        double soma = 0.0;
        int tam = 0;
        int totMasc = 0;
        for (int i = 0; i < entrada; i++) {
            if (genero[i] == 'f' || genero[i] == 'F'){
               soma += altura[i];
               tam++;
            }else if (genero[i] == 'm' || genero[i] == 'M'){
                totMasc++;
            }
        }
        double mediaFem = soma / tam;

        System.out.printf("Maior = %.2f\n", maiorAlt);
        System.out.printf("Menor = %.2f\n", menorAlt);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaFem);
        System.out.println("Numero de homens = " + totMasc);
        sc.close();
    }
}
