package Secao10;

import java.util.ArrayList;
import java.util.List;

public class list_test {
    public static void main(String[] args) {

        List<Integer> list_numbers = new ArrayList<>();

        list_numbers.add(1);
        list_numbers.add(2);
        list_numbers.add(3);
        list_numbers.add(2, 10);

        for (Integer numbers : list_numbers) { // para cada objeto "numbers" contido em "list_numbers", faça:
            System.out.println(numbers);
        }
    }
}
