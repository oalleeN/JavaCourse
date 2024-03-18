package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_List {
    public static void main(String[] args) {

        List<String> list_names = new ArrayList<>();

        list_names.add("Ayla");
        list_names.add("Sophia");
        list_names.add("Alan");
        list_names.add("Julia");
        list_names.add("Alan");
        list_names.add(2, "Suellen");

        System.out.println("Tamanho da Lista: " + list_names.size());
        for (String names: list_names) { // para cada objeto "numbers" contido em "list_numbers", faça:
            System.out.println(names);
        }
        System.out.println("--------------------");
        // remove um elemento da lista que contem o caracter 'M' no primeiro caractere
        list_names.removeIf(names -> names.charAt(0) == 'J');
        for (String names : list_names) {
            System.out.println(names);
        }

        System.out.println("--------------------");
        System.out.println("Index of Suellen: " + list_names.indexOf("Suellen")); // para encontrar a posição do elemento
        System.out.println("Index of Alan: " + list_names.indexOf("Alan")); // quando o resultado der -1, é por que não há elemento com este nome

        System.out.println("--------------------");
        // para filtrar somente os elementos que comecem com a letra A
        List<String> result = list_names.stream().filter(names -> names.charAt(0) == 'A').collect(Collectors.toList());
                                /* tranformo o "lista_names" para stream (aceita funcções lambda),
                                depois eu filtro os nomes que começarem com 'A' (neste caso)
                                e depois eu transformo ele de novo em lista como .collect
                                */
        for (String names_filters : result) {
            System.out.println(names_filters);
        }

        System.out.println("--------------------");
        // para encontrar o primeiro da lista que contem tal String solicitada
        String name = list_names.stream().filter(names -> names.charAt(0) == 'A').findFirst().orElse(null);
        // vai fazer o mesmo que o de cima, entretanto, vai retornar o primeiro elemento que conter 'A' no primeiro caractere
        // ou se caso não existir na lista nenhum, vai retornar null, que é a funçao do ".orElse(null)
        System.out.println(name);
    }
}
