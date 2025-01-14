package Estruturas;
import java.util.*;
import java.util.stream.Collectors;

public class EstruturasdeRepeticao {
    public static void main(String[] args) {

        // ---------------------------------------------
        // Exemplos Básicos
        // ---------------------------------------------

        // 1. Laço For Básico
        System.out.println("1. Laço for básico:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);  // Itera de 0 a 4
        }
        System.out.println();

        // 2. Laço For com Incremento Diferente
        System.out.println("2. Laço for com incremento de 2:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Valor de i: " + i);  // Itera de 0 a 8 com incremento de 2
        }
        System.out.println();

        // 3. Laço While
        System.out.println("3. Laço while:");
        int j = 0;
        while (j < 5) {
            System.out.println("Valor de j: " + j);  // Itera de 0 a 4
            j++;
        }
        System.out.println();

        // 4. Laço Do-While
        System.out.println("4. Laço do-while:");
        int k = 0;
        do {
            System.out.println("Valor de k: " + k);  // Executa pelo menos uma vez, mesmo que a condição seja falsa
            k++;
        } while (k < 5);
        System.out.println();

        // ---------------------------------------------
        // Exemplos Intermediários
        // ---------------------------------------------

        // 5. Laço For-Each (para Array)
        System.out.println("5. Laço for-each para Array:");
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.println("Valor do número: " + num);  // Percorre o array e imprime cada elemento
        }
        System.out.println();

        // 6. Laço For-Each com Manipulação de Coleção
        System.out.println("6. Laço for-each para List:");
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja");
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);  // Itera sobre a lista e imprime cada fruta
        }
        System.out.println();

        // 7. Uso de Break
        System.out.println("7. Exemplo de Break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Valor de i: " + i + " - Encontrado 5, saindo do laço.");
                break;  // Interrompe o laço quando i chega a 5
            }
        }
        System.out.println();

        // 8. Uso de Continue
        System.out.println("8. Exemplo de Continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // Pula os números pares
            }
            System.out.println("Valor de i (ímpar): " + i);  // Exibe apenas números ímpares
        }
        System.out.println();

        // ---------------------------------------------
        // Exemplos Avançados
        // ---------------------------------------------

        // 9. Laço Infinito com Break
        System.out.println("9. Laço infinito com Break:");
        int contador = 0;
        while (true) {
            contador++;
            System.out.println("Contador: " + contador);
            if (contador == 5) {
                System.out.println("Contador atingiu 5, saindo do laço.");
                break;  // Interrompe o laço infinito
            }
        }
        System.out.println();

        // 10. Uso de Parallel Stream para Processamento Paralelo
        System.out.println("10. Uso de Parallel Stream:");
        List<Integer> numerosParalelos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numerosParalelos.parallelStream()
                .filter(n -> n % 2 == 0)  // Filtra números pares
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos números pares (paralelo): " + sum);  // Soma dos números pares utilizando processamento paralelo
        System.out.println();

        // 11. Laço For-Each com Manipulação Avançada de Coleção
        System.out.println("11. Laço for-each com manipulação avançada de coleção:");
        List<String> palavras = Arrays.asList("Java", "Python", "Ruby", "C++");
        palavras.stream()
                .map(String::toUpperCase)  // Converte para maiúsculas
                .forEach(palavra -> System.out.println("Palavra em maiúscula: " + palavra));  // Exibe cada palavra em maiúscula
        System.out.println();

        // 12. Exemplo de For Com Operações Complexas
        System.out.println("12. Laço for com operações complexas:");
        for (int i = 0; i < 5; i++) {
            // Operações complexas: multiplicação e verificação de condições
            int result = i * 2;
            if (result % 2 == 0) {
                System.out.println("Resultado " + result + " é par.");
            } else {
                System.out.println("Resultado " + result + " é ímpar.");
            }
        }
        System.out.println();
    }
}
