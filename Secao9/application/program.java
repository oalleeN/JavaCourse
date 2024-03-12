package Secao9.application;
import Secao9.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer"); // alteracao do nome
        System.out.println("Updated name: " + product.getName()); // visualização do nome
        product.setPrice(2000.00);
        System.out.println("Updated price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        System.out.println();
        System.out.println("Product data: " + product); // product.toString()
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product); // product.toString()

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product); // product.toString()

        sc.close();

    }
}

