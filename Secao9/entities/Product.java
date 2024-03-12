package Secao9.entities;


public class Product {
    private String name;
    private double price; // encapsulamento dos 3 atributos
    private int quantity;

    // construtor padrao
    public Product() {
    }

    // utilizando um construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // sobrecarga da mesma operacao
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // habilitando a leitura/retorno do atributo
    public String getName() {
        return name;
    }

    // habilitando a alteração do atributo
    public void setName(String name) {
        this.name = name;
    }

    // habilitando a leitura/retorno do atributo
    public double getPrice() {
        return price;
    }

    // habilitando a alteração do atributo
    public void setPrice(double price) {
        this.price = price;
    }

    // hablitando somente a leitura/retorno, pois já temos operacoes para altercao "addProducts" e "removeProducts"
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; // this. serve para indicar que você está se referindo ao atributo quantity
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price) // formatação do preço
                + ", "
                + quantity
                + " units, Total: " + String.format("%.2f", totalValueInStock());
    }
}
