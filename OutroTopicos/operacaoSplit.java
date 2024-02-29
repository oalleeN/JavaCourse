package OutroTopicos;

public class operacaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vect = s.split(" "); // declarando um vetor
        String var1 = vect[0];
        String var2 = vect[1];
        String var3 = vect[2];

        System.out.println(s);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);


    }
}
