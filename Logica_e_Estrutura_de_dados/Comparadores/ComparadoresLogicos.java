package Comparadores;

public class ComparadoresLogicos {

    public static void main(String[] args) {

        // Exemplo de variáveis para comparação
        int a = 10;
        int b = 20;
        int c = 10;
        boolean x = true;
        boolean y = false;

        // 1. Comparadores de Igualdade
        System.out.println("1. Comparadores de Igualdade:");
        System.out.println("a == c: " + (a == c));  // a == c: true
        System.out.println("a == b: " + (a == b));  // a == b: false
        System.out.println();

        // 2. Comparadores de Desigualdade
        System.out.println("2. Comparadores de Desigualdade:");
        System.out.println("a != b: " + (a != b));  // a != b: true
        System.out.println("a != c: " + (a != c));  // a != c: false
        System.out.println();

        // 3. Comparadores de Maior e Menor
        System.out.println("3. Comparadores de Maior e Menor:");
        System.out.println("a > b: " + (a > b));    // a > b: false
        System.out.println("a < b: " + (a < b));    // a < b: true
        System.out.println("b >= a: " + (b >= a));  // b >= a: true
        System.out.println("b <= a: " + (b <= a));  // b <= a: false
        System.out.println();

        // 4. Comparadores Lógicos (AND, OR, NOT)
        System.out.println("4. Comparadores Lógicos:");
        System.out.println("x && y: " + (x && y));  // x && y: false (E lógico)
        System.out.println("x || y: " + (x || y));  // x || y: true  (OU lógico)
        System.out.println("!x: " + (!x));          // !x: false (NÃO lógico)
        System.out.println();

        // 5. Condições Operacionais (if-else)
        System.out.println("5. Condições Operacionais (if-else):");
        if (a == c) {
            System.out.println("a é igual a c");  // a é igual a c
        } else {
            System.out.println("a não é igual a c");
        }

        if (a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("a não é maior que b");  // a não é maior que b
        }

        // 6. Condição Operacional com else-if
        System.out.println("6. Condição Operacional com else-if:");
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a == b) {
            System.out.println("a é igual a b");
        } else {
            System.out.println("a é menor que b");  // a é menor que b
        }

        // 7. Operador ternário
        System.out.println("7. Operador Ternário:");
        String resultado = (a == c) ? "a é igual a c" : "a não é igual a c";
        System.out.println(resultado);  // a é igual a c

        // 8. Switch-Case
        System.out.println("8. Switch-Case:");
        switch (a) {
            case 10:
                System.out.println("a é igual a 10");  // a é igual a 10
                break;
            case 20:
                System.out.println("a é igual a 20");
                break;
            default:
                System.out.println("a não é igual a 10 nem a 20");
                break;
        }
    }
}

