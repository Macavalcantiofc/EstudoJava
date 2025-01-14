package Tipos_de_dados;

public class ExemploTipoDados {

    public static void main(String[] args) {
        // 1. Tipos Primitivos

        // a. int (inteiro)
        int inteiro = 10;
        System.out.println("int: " + inteiro);  // System.out.println("int: " + inteiro); >> int: 10
        inteiro++;  // inteiro++; >> Incrementa (11)
        System.out.println("int incrementado: " + inteiro);  // System.out.println("int incrementado: " + inteiro); >> int incrementado: 11
        inteiro *= 2;  // inteiro *= 2; >> Multiplicação (22)
        System.out.println("int após multiplicação: " + inteiro);  // System.out.println("int após multiplicação: " + inteiro); >> int após multiplicação: 22
        inteiro /= 5;  // inteiro /= 5; >> Divisão (4)
        System.out.println("int após divisão: " + inteiro);  // System.out.println("int após divisão: " + inteiro); >> int após divisão: 4
        inteiro -= 2;  // inteiro -= 2; >> Subtração (2)
        System.out.println("int após subtração: " + inteiro);  // System.out.println("int após subtração: " + inteiro); >> int após subtração: 2

        // b. double (ponto flutuante)
        double numeroDecimal = 10.5;
        System.out.println("double: " + numeroDecimal);  // System.out.println("double: " + numeroDecimal); >> double: 10.5
        numeroDecimal += 5.25;  // numeroDecimal += 5.25; >> Adição (15.75)
        System.out.println("double após adição: " + numeroDecimal);  // System.out.println("double após adição: " + numeroDecimal); >> double após adição: 15.75
        numeroDecimal -= 2.25;  // numeroDecimal -= 2.25; >> Subtração (13.5)
        System.out.println("double após subtração: " + numeroDecimal);  // System.out.println("double após subtração: " + numeroDecimal); >> double após subtração: 13.5
        numeroDecimal *= 3;  // numeroDecimal *= 3; >> Multiplicação (40.5)
        System.out.println("double após multiplicação: " + numeroDecimal);  // System.out.println("double após multiplicação: " + numeroDecimal); >> double após multiplicação: 40.5
        numeroDecimal /= 4;  // numeroDecimal /= 4; >> Divisão (10.125)
        System.out.println("double após divisão: " + numeroDecimal);  // System.out.println("double após divisão: " + numeroDecimal); >> double após divisão: 10.125

        // c. char (caractere)
        char letra = 'A';
        System.out.println("char: " + letra);  // System.out.println("char: " + letra); >> char: A
        letra++;  // letra++; >> Incrementa para o próximo caractere (B)
        System.out.println("char após incremento: " + letra);  // System.out.println("char após incremento: " + letra); >> char após incremento: B
        letra = (char) (letra + 3);  // letra = (char) (letra + 3); >> Manipulação numérica (E)
        System.out.println("char após manipulação numérica: " + letra);  // System.out.println("char após manipulação numérica: " + letra); >> char após manipulação numérica: E

        // d. boolean (verdadeiro ou falso)
        boolean verdade = true;
        System.out.println("boolean: " + verdade);  // System.out.println("boolean: " + verdade); >> boolean: true
        verdade = !verdade;  // verdade = !verdade; >> Inverte o valor (false)
        System.out.println("boolean após negação: " + verdade);  // System.out.println("boolean após negação: " + verdade); >> boolean após negação: false

        // e. byte (número pequeno, de -128 a 127)
        byte pequeno = 100;
        System.out.println("byte: " + pequeno);  // System.out.println("byte: " + pequeno); >> byte: 100
        pequeno += 50;  // pequeno += 50; >> Adição (150)
        System.out.println("byte após soma: " + pequeno);  // System.out.println("byte após soma: " + pequeno); >> byte após soma: 150
        pequeno -= 20;  // pequeno -= 20; >> Subtração (130)
        System.out.println("byte após subtração: " + pequeno);  // System.out.println("byte após subtração: " + pequeno); >> byte após subtração: 130

        // f. short (número inteiro pequeno)
        short numeroPequeno = 32000;
        System.out.println("short: " + numeroPequeno);  // System.out.println("short: " + numeroPequeno); >> short: 32000
        numeroPequeno += 1000;  // numeroPequeno += 1000; >> Adição (33000)
        System.out.println("short após adição: " + numeroPequeno);  // System.out.println("short após adição: " + numeroPequeno); >> short após adição: 33000
        numeroPequeno *= 2;  // numeroPequeno *= 2; >> Multiplicação (66000)
        System.out.println("short após multiplicação: " + numeroPequeno);  // System.out.println("short após multiplicação: " + numeroPequeno); >> short após multiplicação: 66000

        // g. long (número inteiro grande)
        long numeroGrande = 100000L;
        System.out.println("long: " + numeroGrande);  // System.out.println("long: " + numeroGrande); >> long: 100000
        numeroGrande *= 10;  // numeroGrande *= 10; >> Multiplicação (1000000)
        System.out.println("long após multiplicação: " + numeroGrande);  // System.out.println("long após multiplicação: " + numeroGrande); >> long após multiplicação: 1000000

        // h. float (ponto flutuante de precisão simples)
        float numeroFlutuante = 5.75f;
        System.out.println("float: " + numeroFlutuante);  // System.out.println("float: " + numeroFlutuante); >> float: 5.75
        numeroFlutuante -= 2.5f;  // numeroFlutuante -= 2.5f; >> Subtração (3.25)
        System.out.println("float após subtração: " + numeroFlutuante);  // System.out.println("float após subtração: " + numeroFlutuante); >> float após subtração: 3.25
    }
}
