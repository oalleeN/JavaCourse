package Secao9_Exercicio.entities;

public class Account {
    private int accountNumbers;
    private String name;
    private double balance;

    public Account(){ // construtor padrao
    }

    public Account(int accountNumbers, String name, double initialDeposit) { // construtor personalizado
        this.accountNumbers = accountNumbers;
        this.name = name;
        addDeposit(initialDeposit);
    }

    public Account(int accountNumbers, String name) { // sobrecarga
        this.accountNumbers = accountNumbers;
        this.name = name;
    }
    public int getAccountNumbers(){
        return accountNumbers;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void addDeposit(double deposit) {
        this.balance += deposit;
    }
    public void withdraw(double deposit) {
        this.balance -= deposit + 5.0; // taxa de 5.0 do saque
    }
    public String toString() {
        return "Account "
                + accountNumbers
                + ", Holder: "
                + name
                + ", Balance $"
                + String.format("%.2f", balance);
    }
}