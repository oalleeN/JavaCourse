package Introducao_OOP.Ex1.util;

public class CurrencyConverter {
    public static final double IOT = 0.06;
    public static double calculator(double dollar, double quantity) {
        return dollar * quantity * (1.0 + IOT);
    }
}
