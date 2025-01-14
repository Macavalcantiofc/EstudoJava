# EstudoJava
Este repositório será mantido para armazenar desafios e materiais de estudo sobre linguagem JAVA.

---

# Pensamento Computacional

### 1.0 - Decomposição
Entender o Problema é a chave da decomposição, por mais que o problema seja complexo e não exista uma forma clara de resolvê-lo, quebrar ele em problemas menores e com baixa complexidade ajuda a entender os problemas em cada fase e dimensionar corretamente os esforços. Imagine que cozinhar um arroz pode ser uma tarefa difícil para uma pessoa que nunca a executou, mas dividindo as tarefas como exemplo: buscar todos os utensílios, buscar todos os insumos, preparar todos os insumos, cozinhar conforme receita, isso facilita a compreensão do esforço a ser executado e pode até demonstrar se você tem tudo que é preciso para preparar o arroz. Imagine que você não fez da forma como foi descrita e depois de preparar e fritar o alho, colocar o arroz na panela, você descobre que não tem sal. A decomposição evita que esse tipo de situação ocorra dentro do desenvolvimento de software.

### 1.1 - Padrões
Os padrões em software promovem consistência e eficiência, garantindo interoperabilidade e qualidade.  
Exemplos incluem:
- **Padrão de Dados**: JSON para troca de dados.
- **Padrão de Arquitetura**: Modelo Cliente-Servidor.
- **Padrão de Desenvolvimento**: MVC (Model-View-Controller) para organização de código.

### 1.2 - Abstração
É o processo intelectual de isolar um objeto da realidade, trazendo o objeto físico para o contexto digital. Como, por exemplo, o **Aluno** no mundo real, que parece simples, mas ao trazê-lo para o meio digital envolve extrair as características como nome, idade, turma, período. Todas essas informações fazem parte do processo de abstração e são essenciais para o desenvolvimento não só do software, mas para vários processos computacionais.

---

# Tipos de Dados

### 1.3 - Tipos Primitivos
**int, double, char, boolean, byte, short, long, float**:  
Mostramos as operações básicas de soma, subtração, multiplicação e divisão, além de manipulações mais específicas, como incremento e mudança de valor numérico em caracteres.

#### 1.3.1 - BigDecimal
**BigDecimal**:  
BigDecimal é uma classe utilizada para realizar cálculos de precisão arbitrária (em especial para valores monetários), que são mais precisos que float e double. No exemplo, mostramos como criar, somar e dividir valores com BigDecimal.

#### 1.3.2 - String
**String**:  
String é manipulada com vários métodos como `toUpperCase()`, `replace()`, `length()`, `charAt()`, `substring()`. Mostramos como transformar uma string em maiúscula, substituir uma substring e obter o comprimento da string.

#### 1.3.3 - Enum
**Enum**:  
Enum é uma maneira de definir um tipo com um conjunto fixo de constantes. Mostramos como acessar e manipular os valores do Enum, bem como como obter o valor ordinal e criar valores com `valueOf()`.

---

# Estruturas de Dados

### 1.4 - Estruturas de Dados

#### 1.4.1 - Arrays
**Arrays**:  
Mostramos como trabalhar com arrays em Java, manipulando seus elementos, percorrendo com um laço `for-each` e modificando valores específicos.

#### 1.4.2 - Wrapper Classes
**Wrapper Classes**:  
Wrapper Classes como `Integer`, `Double` permitem que você trate tipos primitivos como objetos. Exemplificamos a manipulação desses tipos, como incremento e multiplicação.

#### 1.4.3 - Object
**Object**:  
`Object` é a superclasse de todos os objetos em Java. Aqui, mostramos como um `Object` pode ser utilizado para armazenar diferentes tipos de dados.

#### 1.4.4 - new String()
**new String()**:  
Usamos o `new String()` para criar uma string explicitamente e depois a manipulamos com o método `intern()`, que retorna a versão interna da string.

#### 1.4.5 - Conclusão
**Conclusão**:  
Este exemplo abrange os principais tipos de dados primitivos, classes de dados e manipuladores que Java oferece. Além disso, forneci operações básicas e avançadas para você entender como trabalhar com esses tipos de maneira eficaz. Se você precisar de mais detalhes sobre qualquer outro tipo de dado ou manipulação, estou à disposição para ajudar!

---

# Comparadores Lógicos e Condições Operacionais

### 1.5 - Comparadores Lógicos
**Comparadores lógicos** em Java são usados para comparar valores e condições. Alguns exemplos incluem:
- **Igualdade (`==`)**: Verifica se os valores de duas variáveis são iguais.
- **Desigualdade (`!=`)**: Verifica se os valores de duas variáveis são diferentes.
- **Maior que (`>`)**: Verifica se um valor é maior que outro.
- **Menor que (`<`)**: Verifica se um valor é menor que outro.
- **Maior ou igual a (`>=`)**: Verifica se um valor é maior ou igual a outro.
- **Menor ou igual a (`<=`)**: Verifica se um valor é menor ou igual a outro.

Além disso, temos operadores lógicos como `&&` (E lógico), `||` (OU lógico) e `!` (NÃO lógico), que permitem combinar múltiplas condições para criar verificações mais complexas.

#### 1.5.1 - Operadores de Comparação
Os operadores de comparação são usados para comparar valores de tipos primitivos ou objetos em Java. Os exemplos incluem verificações de igualdade (`==`), desigualdade (`!=`), maior (`>`) e menor (`<`), e as versões "ou igual" (`>=`, `<=`). Esses operadores são frequentemente utilizados em instruções `if`, `else-if` e loops para tomar decisões com base em condições lógicas.

#### 1.5.2 - Condições Operacionais (if, if-else, else-if)
As estruturas de controle `if`, `else-if`, e `else` permitem que você execute blocos de código baseados em condições.
- **if**: Executa um bloco de código se a condição for verdadeira.
- **else-if**: Executa um bloco de código alternativo se a condição anterior for falsa e essa for verdadeira.
- **else**: Executa um bloco de código quando todas as condições anteriores forem falsas.

#### 1.5.3 - Operador Ternário
O **operador ternário** é uma forma compacta de realizar uma instrução `if-else`. Ele avalia uma condição e retorna um valor dependendo se a condição é verdadeira ou falsa. A sintaxe é:  
`condição ? valor_se_verdadeiro : valor_se_falso`.

#### 1.5.4 - Switch-Case
O **switch-case** é uma estrutura condicional que permite a comparação de uma variável com múltiplos valores, de forma mais eficiente em casos com muitas condições possíveis. Dependendo do valor da variável, um bloco de código correspondente será executado.

---

# Estruturas de Repetição: Do Básico ao Avançado

### 1.6 - Exemplos Básicos

#### 1.6.1 - Laço `for` Básico
O laço `for` básico é usado quando sabemos exatamente o número de iterações. No exemplo, iteramos de 0 até 4 e exibimos o valor de `i`.

#### 1.6.2 - Laço `for` com Incremento Diferente
Modificamos o incremento do laço `for` para 2, fazendo com que ele percorra de 0 a 8, imprimindo os valores de `i` de 2 em 2.

#### 1.6.3 - Laço `while`
O laço `while` é utilizado enquanto a condição especificada for verdadeira. A variável `j` é incrementada dentro do laço, que itera enquanto `j < 5`.

#### 1.6.4 - Laço `do-while`
O laço `do-while` sempre executa pelo menos uma vez, independentemente da condição. No exemplo, ele imprime os valores de `k` de 0 até 4.

---

### 1.7 - Exemplos Intermediários

#### 1.7.1 - Laço `for-each` para Arrays
O laço `for-each` percorre arrays. Neste exemplo, percorremos um array de inteiros e imprimimos cada valor de `numeros`.

#### 1.7.2 - Laço `for-each` para Listas
Utilizamos o `for-each` em uma lista (`List<String>`), iterando sobre as frutas e as imprimindo.

#### 1.7.3 - Uso de `break`
O comando `break` é utilizado para interromper a execução de um laço. No exemplo, o laço é interrompido quando o valor de `i` chega a 5.

#### 1.7.4 - Uso de `continue`
O comando `continue` faz com que o laço pule a iteração atual e vá para a próxima. Exemplo de exibição apenas de números ímpares entre 0 e 9.

---

### 1.8 - Exemplos Avançados

#### 1.8.1 - Laço Infinito com `break`
Criamos um laço infinito com `while(true)` e interrompemos a execução com o comando `break` quando o contador atinge 5.

#### 1.8.2 - Uso de `parallelStream`
Utilizamos `parallelStream` para realizar operações de forma paralela sobre uma coleção de números. No exemplo, somamos os números pares utilizando processamento paralelo.

#### 1.8.3 - Laço `for-each` com Manipulação Avançada de Coleções
Usamos o `for-each` juntamente com `stream` para realizar manipulações avançadas, como a conversão de palavras para maiúsculas e exibição dos resultados.

#### 1.8.4 - Laço `for` com Operações Complexas
Neste exemplo, realizamos uma multiplicação e, dependendo do resultado, verificamos se o número é par ou ímpar, demonstrando como manipular operações dentro de um laço.
