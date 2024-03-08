package Introducao_OOP.entidades;

public class Triangle {

    public double a;
    public double b;  // atributos da classe
    public double c;

    public double area() { // como já temos as instancias declaradas, nao precisamos digitar os parâmetros que iriamos utilizar na funcao
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
