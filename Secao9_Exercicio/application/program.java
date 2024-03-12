package Secao9_Exercicio.application;

import Secao9_Exercicio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account; // declaracao da variavel

        System.out.print("Enter account number: ");
        int accountNumbers = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char optional = sc.next().charAt(0);

        if (optional == 'y' || optional == 'Y') {
            System.out.print("Enter initial deposit value: "); // deposito inicial
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumbers, name, initialDeposit); // instanciando a variavel com a sobrecarga
        }else {
            account = new Account(accountNumbers, name); // instanciando valores
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit value: ");  // deposito
        double deposit = sc.nextDouble();
        account.addDeposit(deposit);

        System.out.println();
        System.out.println("Updated account data: "); // dados atualizados
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: "); // saque
        double withdrawDeposit = sc.nextDouble();
        account.withdraw(withdrawDeposit);

        System.out.println();
        System.out.println("Updated account data: "); // dados atualizados
        System.out.println(account);

        sc.close();
    }

}
