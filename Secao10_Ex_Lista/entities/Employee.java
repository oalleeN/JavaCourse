package Secao10_Ex_Lista.entities;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){
    }
    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() { // leitura
        return salary;
    }
    public void increase(Double addSalary) {
        salary += salary * addSalary / 100;
    }

    @Override
    public String toString() {
        return id + ", "  + name + ", " + String.format("%.2f", salary);
    }
}
