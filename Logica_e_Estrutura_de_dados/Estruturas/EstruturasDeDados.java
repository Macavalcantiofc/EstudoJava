package Estruturas;
import java.math.BigDecimal;

public class EstruturasDeDados {

    public static void main(String[] args) {
        // 1. Tipos de Dados com Classes

        // a. BigDecimal (precisão arbitrária)
        BigDecimal numeroGrandeDecimal = BigDecimal.valueOf(123.456);
        System.out.println("BigDecimal: " + numeroGrandeDecimal);  // System.out.println("BigDecimal: " + numeroGrandeDecimal); >> BigDecimal: 123.456
        BigDecimal aumento = BigDecimal.valueOf(100.123);
        numeroGrandeDecimal = numeroGrandeDecimal.add(aumento);  // numeroGrandeDecimal.add(aumento); >> Soma (223.579)
        System.out.println("BigDecimal após soma: " + numeroGrandeDecimal);  // System.out.println("BigDecimal após soma: " + numeroGrandeDecimal); >> BigDecimal após soma: 223.579
        BigDecimal resultadoDivisao = numeroGrandeDecimal.divide(BigDecimal.valueOf(3), BigDecimal.ROUND_HALF_UP);  // numeroGrandeDecimal.divide(BigDecimal.valueOf(3)); >> Divisão (74.5267)
        System.out.println("BigDecimal após divisão: " + resultadoDivisao);  // System.out.println("BigDecimal após divisão: " + resultadoDivisao); >> BigDecimal após divisão: 74.5267

        // b. String (sequência de caracteres)
        String texto = "Olá, Mundo!";
        System.out.println("String original: " + texto);  // System.out.println("String original: " + texto); >> String original: Olá, Mundo!
        texto = texto.toUpperCase();  // texto.toUpperCase(); >> Converte para maiúsculas (OLÁ, MUNDO!)
        System.out.println("String em maiúsculas: " + texto);  // System.out.println("String em maiúsculas: " + texto); >> String em maiúsculas: OLÁ, MUNDO!
        texto = texto.replace("MUNDO", "Java");  // texto.replace("MUNDO", "Java"); >> Substitui texto (OLÁ, JAVA!)
        System.out.println("String após substituição: " + texto);  // System.out.println("String após substituição: " + texto); >> String após substituição: OLÁ, JAVA!
        int comprimento = texto.length();  // texto.length(); >> Comprimento (12)
        System.out.println("Comprimento da String: " + comprimento);  // System.out.println("Comprimento da String: " + comprimento); >> Comprimento da String: 12
        char primeiroChar = texto.charAt(0);  // texto.charAt(0); >> Pega o primeiro caractere (O)
        System.out.println("Primeiro caractere: " + primeiroChar);  // System.out.println("Primeiro caractere: " + primeiroChar); >> Primeiro caractere: O
        String substring = texto.substring(4, 9);  // texto.substring(4, 9); >> Substring (JAVA)
        System.out.println("Substring (índices 4 a 8): " + substring);  // System.out.println("Substring (índices 4 a 8): " + substring); >> Substring (índices 4 a 8): JAVA

        // c. Enum (valores predefinidos)
        DiaSemana dia = DiaSemana.SEGUNDA;
        System.out.println("Dia da semana: " + dia);  // System.out.println("Dia da semana: " + dia); >> Dia da semana: SEGUNDA
        System.out.println("Valor ordinal de " + dia + ": " + dia.ordinal());  // System.out.println("Valor ordinal de " + dia + ": " + dia.ordinal()); >> Valor ordinal de SEGUNDA: 1
        dia = DiaSemana.SABADO;  // dia = DiaSemana.SABADO; >> Atribui o valor SABADO
        System.out.println("Dia alterado para: " + dia);  // System.out.println("Dia alterado para: " + dia); >> Dia alterado para: SABADO
        DiaSemana diaDeHoje = DiaSemana.valueOf("TERCA");  // DiaSemana.valueOf("TERCA"); >> Obtém valor do Enum por nome (TERCA)
        System.out.println("Enum a partir do nome: " + diaDeHoje);  // System.out.println("Enum a partir do nome: " + diaDeHoje); >> Enum a partir do nome: TERCA

        // 2. Arrays e Manipulação de Arrays
        int[] numerosArray = {1, 2, 3, 4, 5};
        System.out.println("Array original: ");
        for (int num : numerosArray) {
            System.out.print(num + " ");  // System.out.print(num + " "); >> 1 2 3 4 5
        }
        System.out.println();
        numerosArray[2] = 10;  // numerosArray[2] = 10; >> Modificação do índice 2 (1 2 10 4 5)
        System.out.println("Array após modificação do elemento na posição 2: ");
        for (int num : numerosArray) {
            System.out.print(num + " ");  // System.out.print(num + " "); >> 1 2 10 4 5
        }
        System.out.println();

        // 3. Uso de Wrapper Classes
        Integer numeroWrapper = Integer.valueOf(50);  // Integer.valueOf(50); >> Wrapper para int (50)
        System.out.println("Integer (Wrapper para int): " + numeroWrapper);  // System.out.println("Integer (Wrapper para int): " + numeroWrapper); >> Integer (Wrapper para int): 50
        numeroWrapper += 10;  // numeroWrapper += 10; >> Incremento (60)
        System.out.println("Integer após incremento: " + numeroWrapper);  // System.out.println("Integer após incremento: " + numeroWrapper); >> Integer após incremento: 60
        Double numeroWrapperDouble = Double.valueOf(15.5);  // Double.valueOf(15.5); >> Wrapper para double (15.5)
        System.out.println("Double (Wrapper para double): " + numeroWrapperDouble);  // System.out.println("Double (Wrapper para double): " + numeroWrapperDouble); >> Double (Wrapper para double): 15.5
        numeroWrapperDouble *= 2;  // numeroWrapperDouble *= 2; >> Multiplicação (31.0)
        System.out.println("Double após multiplicação: " + numeroWrapperDouble);  // System.out.println("Double após multiplicação: " + numeroWrapperDouble); >> Double após multiplicação: 31.0

        // 4. Object (superclasse de todos os objetos em Java)
        Object obj = "Texto genérico";
        System.out.println("Objeto: " + obj);  // System.out.println("Objeto: " + obj); >> Objeto: Texto genérico
        obj = 123;  // obj = 123; >> Alteração para inteiro (123)
        System.out.println("Objeto agora como inteiro: " + obj);  // System.out.println("Objeto agora como inteiro: " + obj); >> Objeto agora como inteiro: 123

        // 5. Trabalhando com `new String()`
        String novaString = new String("Nova String criada com new");
        System.out.println("String criada com new: " + novaString);  // System.out.println("String criada com new: " + novaString); >> String criada com new: Nova String criada com new
        String outraString = novaString.intern();  // novaString.intern(); >> String internada
        System.out.println("String internada: " + outraString);  // System.out.println("String internada: " + outraString); >> String internada: Nova String criada com new
    }

    // Enum exemplo
    enum DiaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
    }
}
