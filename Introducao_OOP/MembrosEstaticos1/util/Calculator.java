package Introducao_OOP.MembrosEstaticos1.util;

public class Calculator {
    public final double PI = 3.14159; // final para indicar que é uma constante -> membro estatico

    public double circumference(double rad){
        return 2.0 * PI * rad;
    }
    public double volume(double rad){
        return 4.0 * PI * rad * rad * rad / 3.0;
    }
}
