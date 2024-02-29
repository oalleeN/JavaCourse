package OutroTopicos;

import java.util.Scanner;

public class funcoesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c); // funcao para maior numero MAX

        showResult(higher); // funcao para mostrar na tela o MAX

        sc.close();
    }
    public static int max(int x, int y, int z) { // cada valor contido como paramentro é dado aos seus respectivos
        int maior;                               // numeros contidos dentro da variavel "higher" -> a, b, c
        if (x > y && x > z){
            maior = x;
        } else if(y > z){
            maior = y;
        } else{
            maior = z;
        }
        return maior;
    }

    public static void showResult(int mst){
        System.out.println("Higher: " + mst); // vai receber o valor contido dentro dos -> ( )
    }

}
