package Secao10_Ex_Lista.application;

import Secao10_Ex_Lista.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sr = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int n = sr.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {  // para ler o funcionario (id, name, salary (fees))
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("ID: ");
            Integer ids = sr.nextInt();
            while (hasId(list, ids)) {
                System.out.print("Id already taken! Try again: ");
                ids = sr.nextInt();
            }
            sr.nextLine(); // limpa o buffer
            System.out.print("NAME: ");
            String names = sr.nextLine();
            System.out.print("SALARY: ");
            Double fees = sr.nextDouble();

            list.add(new Employee(ids, names, fees)); // adicionei a cada parte (atributo) da minha lista as variaveis referentes
        }

        System.out.println();
        System.out.print("Enter the emplyee id that will have salary increase: "); // id do funcionario
        int identification = sr.nextInt();
        Employee employee = list.stream().filter(numId -> numId.getId() == identification).findFirst().orElse(null);

        // Integer position = positionId(list, identification); // fazendo uma variavel receber a posição do id solicitado

        if (employee == null){ // se o id não existe
            System.out.println("This is does not exist!");
        }
        else { // caso exista:
            System.out.print("Enter the percentage: ");
            double percentage = sr.nextDouble();
            employee.increase(percentage); // na lista, pegue o id na posicao "position" e faça a função ".increase()"
        }

        System.out.println();
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sr.close();
    }
    public static Integer positionId(List<Employee> list, int id){ // função para identificar a posiçao do id sem lambda
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){ // pega cada elemento na lista do atributo "id" com o .get
                return i;
            }
        }
        return null; // indica que o elemento nao foi encontrado

    }
    public static boolean hasId(List<Employee> list, int id){ // vai resultar em verdadeiro ou falso
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
