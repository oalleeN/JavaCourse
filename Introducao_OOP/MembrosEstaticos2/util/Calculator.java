package Introducao_OOP.MembrosEstaticos2.util;

public class Calculator {
    public static final double PI = 3.14159; // final para indicar que é uma constante -> membro estatico

    public static double circumference(double rad){
        return 2.0 * PI * rad;
    }
    public static double volume(double rad) {
        return 4.0 * PI * rad * rad * rad / 3.0;
    }
}
