package Secao10_Exercicio;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
*/
public class Ex10_Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos são digitados? ");
        int ent = sc.nextInt();

        String[] nome = new String[ent];
        double[] nota1 = new double[ent];
        double[] nota2 = new double[ent];
        double[] soma = new double[ent];
        double[] media = new double[ent];

        for (int i = 0; i < ent; i++){
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "ª aluno");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2[i] = sc.nextDouble();
        }
        for (int i = 0; i < ent; i++){
            soma[i] = nota1[i] + nota2[i];
        }
        for (int i = 0; i < ent; i++){
            media[i] = soma[i] / 2;
        }

        System.out.println("LISTA DOS APROVADOS: ");
        for (int i = 0; i < ent; i++){
            if (media[i] >= 6.0){
                System.out.println(nome[i]);
            }
        }
        sc.close();

    }
}
