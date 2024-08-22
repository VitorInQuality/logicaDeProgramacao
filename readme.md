<h1 align="left">Lógica de Programação</h1>

###

<p align="left">Lógica de programação é a base para criar programas de computador. Ela envolve o uso de um conjunto de regras e passos organizados, chamados de algoritmos, para resolver problemas ou realizar tarefas específicas. Esses algoritmos são executados por meio de instruções que o computador segue, como tomar decisões, repetir ações e manipular dados. Com uma boa lógica de programação, você consegue construir soluções eficientes e eficazes para qualquer tipo de problema computacional.</p>

###

<h3 align="left">Criar um projeto Maven no Eclipse IDE</h3>

###

<p align="left">Para criar um projeto Maven simples no Eclipse:<br><br>1. Abrir o Eclipse:<br><br>• Abra o Eclipse e escolha sua workspace.<br><br>2. Criar um Novo Projeto Maven:<br><br>• Vá em File > New > Other....<br>• Selecione Maven Project e clique em Next.<br>• Marque a opção "Create a simple project (skip archetype selection)" e clique em Next.<br>• Preencha Group Id (ex.: com.exemplo) e Artifact Id (nome do projeto) e clique em Finish.</p>

###

<h2 align="left">Criar uma classe na pasta scr/main/java que executa o programa</h2>

###

<p align="left">1. Criar a Classe:<br><br>• No Project Explorer, clique com o botão direito em src/main/java<br>• Selecione New > Class<br>• Dê um nome à classe (exemplo MinhaClasse)<br>• Marque a opção para criar o método public static void main(String[] args) se necessário<br>• Clique em Finish<br><br>2. Escrever o Código:<br><br>•No método main, escreva seu código Exemplo:<br><br>public class MinhaClasse {<br>    public static void main(String[] args) {<br>        System.out.println("Olá, mundo!")<br>    }<br>}<br><br>3. Executar o Programa:<br><br>• Clique com o botão direito na sua classe (MinhaClasse.java)<br>• Selecione Run As > Java Application<br>• Isso criará e executará seu programa no Eclipse</p>

###

<h2 align="left">Exibir mensagem no console</h2>

###

<p align="left">Para exibir algo no console em uma linguagem de programação, você geralmente usa um comando específico que imprime texto ou valores na tela. Aqui estão exemplos em algumas linguagens comuns:<br><br>Exemplos:<br><br>• Java:<br><br>System.out.println("Olá, mundo!");<br>System.out.println exibe a mensagem seguida de uma nova linha no console.<br><br>• Python:<br><br>print("Olá, mundo!")<br>print exibe a mensagem no console.<br><br>• JavaScript:<br><br>console.log("Olá, mundo!");<br>console.log exibe a mensagem no console do navegador ou ambiente de execução.<br><br>Esses comandos são essenciais para testes e depurações, pois permitem ver o que o programa está fazendo em tempo real.]<br><br>Obs: contém exemplos no projeto. Está no pacote  **logicaProgramacao.console.PrimeiroPrograma;**</p>

###

<h2 align="left">Quebras de  linha</h2>

###

<p align="left">1. Usar System.out.println():<br><br>• Cada System.out.println() pula para a próxima linha.<br><br>System.out.println("Linha 1");<br>System.out.println("Linha 2");<br>System.out.println(); // Linha em branco<br>System.out.println("Linha 4");<br><br>2. Usar \n dentro de uma String:<br><br>• Adicione \n onde deseja uma quebra de linha.<br><br>System.out.println("Linha 1\nLinha 2\n\nLinha 4");<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.console;**</p>

###

<h2 align="left">String</h2>

###

<p align="left">A classe String em Java é utilizada para representar e manipular sequências de caracteres. Ela permite criar, modificar e comparar textos, e é fundamental para o trabalho com dados textuais em Java.<br><br>Para concatenar Strings e exibir o resultado usando System.out.println em Java, você pode usar o operador +. <br><br>Exemplo:<br><br>public class ExemploConcatenacao {<br>    public static void main(String[] args) {<br>        <br>String nome = "João";<br>        <br>System.out.println("Olá, " + nome + "!"); <br><br>    }<br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Variáveis tipo Inteiro</h2>

###

<p align="left">Tipos Inteiros em Java<br><br>1. int<br><br>• Tipo de dado primitivo mais usado para armazenar inteiros.<br>• Tamanho: 32 bits.<br>• Intervalo: de -2.147.483.648 a 2.147.483.647.<br><br>2. short<br><br>• Menor que int, usado para economizar memória.<br>• Tamanho: 16 bits.<br>• Intervalo: de -32.768 a 32.767.<br><br>3. long<br><br>• Usado para valores inteiros maiores.<br>• Tamanho: 64 bits.<br>• Intervalo: de • 9.223.372.036.854.758.008 a 9.223.372.036.854.758.007.<br><br>4. byte<br><br>• Usado para valores inteiros muito pequenos.<br>• Tamanho: 8 bits.<br>• Intervalo: de -128 a 127.<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Variáveis tipo Ponto Flutuante</h2>

###

<p align="left">1. float<br><br>• Usado para números com precisão simples.<br>• Precisão: 32 bits.<br>• Valor Máximo: Aproximadamente 3.4028235E38 (3.4 × 10^38).<br>• Valor Mínimo: Aproximadamente 1.4E-45 (1.4 × 10^-45).<br><br>2. double<br><br>• Usado para números com precisão dupla.<br>• Precisão: 64 bits.<br>• Valor Máximo: Aproximadamente 1.7976931348623157E308 (1.8 × 10^308).<br>•Valor Mínimo: Aproximadamente 4.9E-324 (4.9 × 10^-324).<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Variável tipo Caractere</h2>

###

<p align="left">Em Java, o tipo de variável usado para armazenar um único caractere é char. Aqui está um resumo sobre o tipo char:<br><br>1. Tipo char<br><br>• Tipo de Dado: char<br>• Tamanho: 16 bits.<br>• Representação: Armazena um único caractere Unicode.<br>• Valor: Pode armazenar qualquer caractere Unicode, incluindo letras, números e símbolos.<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Variável tipo Booleano</h2>

###

<p align="left">Em Java, o tipo de variável usado para armazenar valores booleanos é boolean. Aqui estão os principais pontos sobre o tipo boolean:<br><br>1. Tipo boolean<br><br>• Tipo de Dado: boolean<br>• Valores: Pode armazenar apenas dois valores: true ou false.<br>• Tamanho: Não há uma especificação de tamanho fixo, mas é otimizado para armazenar um único bit de informação.<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Atribuir valor as Variáveis</h2>

###

<p align="left">Em Java, atribuir valor a uma variável envolve duas etapas principais: declarar a variável e, em seguida, atribuir um valor a ela. A declaração define o tipo e o nome da variável, enquanto a atribuição define o valor que a variável armazenará. É possível declarar e atribuir valores em uma única linha ou separadamente.<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.variaveis;**</p>

###

<h2 align="left">Condição IF</h2>

###

<p align="left">O if em Java executa um bloco de código se uma condição for verdadeira. Com o else, você pode executar um código diferente se a condição for falsa. Em outras palavras, é um jeito de dizer "SE... SENÃO" em programação.<br><br>Estrutura Básica<br><br>if (condição) {<br><br>    // Código executado se a condição for verdadeira<br><br>}<br> else {<br><br>    // Código executado se a condição for falsa<br><br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;**</p>

###

<h2 align="left">Condição IF com cálculo matemático</h2>

###

<p align="left">Você pode usar o IF em Java para realizar cálculos matemáticos dentro das condições. Isso permite executar diferentes blocos de código baseados nos resultados de cálculos.<br><br>1. Aritmética Básica<br><br>• Soma: a + b<br>• Subtração: a - b<br>• Multiplicação: a * b<br>• Divisão: a / b<br><br>2. Operações Relacionais<br><br>• Maior que: a > b<br>• Menor que: a < b<br>• Maior ou igual a: a >= b<br>• Menor ou igual a: a <= b<br>• Igual a: a == b<br>• Diferença: a != b<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;** e **logicaProgramacao.sinais;**</p>

###

<h2 align="left">Condição IF com Pipe ||</h2>

###

<p align="left">Em Java, você pode usar o operador lógico "ou" (||), que é conhecido como "pipe" ou "pipe duplo" em alguns contextos. Esse operador permite que você verifique se pelo menos uma das várias condições é verdadeira.<br><br>• Operador || (Pipe Duplo)<br><br>O operador || é usado para combinar duas ou mais condições. O bloco de código dentro do if será executado se pelo menos uma das condições for verdadeira.<br><br>• Estrutura Básica<br><br>if (condição1 || condição2) {<br>    // Código executado se pelo menos uma das condições for verdadeira<br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;**</p>

###

<h2 align="left">Condição IF com E comercial &&</h2>

###

<p align="left">Em Java, o operador lógico && é usado para combinar várias condições, e o bloco de código dentro do if será executado somente se todas as condições forem verdadeiras. O && é conhecido como o operador "E" lógico.<br><br>•  Operador && (E Lógico)<br><br>O operador && permite que você verifique se todas as condições em uma expressão são verdadeiras.<br><br>• Estrutura Básica<br><br>if (condição1 && condição2) {<br>    // Código executado se todas as condições forem verdadeiras<br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;**</p>

###

<h2 align="left">Condição IF Aninhado</h2>

###

<p align="left">Um if aninhado é uma estrutura condicional onde um if é colocado dentro de outro if. Isso permite fazer verificações adicionais dentro de uma condição já existente, criando uma hierarquia de decisões. Em outras palavras, você pode testar uma segunda condição apenas se a primeira for verdadeira.<br><br>• Exemplo Básico<br><br>if (condição1) {<br>    // Código executado se condição1 for verdadeira<br><br>    if (condição2) {<br>        // Código executado se condição1 e condição2 forem verdadeiras<br>    }<br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;**</p>

###

<h2 align="left">Condição IF com Else IF</h2>

###

<p align="left">A estrutura condicional if com else if em Java permite testar múltiplas condições em sequência e executar blocos de código diferentes com base na primeira condição verdadeira. Se a primeira condição if não for verdadeira, o programa verifica as condições subsequentes no else if. Se nenhuma das condições if ou else if for verdadeira, o bloco else (se presente) é executado.<br><br>• Definição<br><br>• if: Testa uma condição inicial. Se for verdadeira, o bloco de código associado é executado.<br>• else if: Testa uma condição adicional se a condição if for falsa. Pode haver múltiplos blocos else if.<br>• else: Executa um bloco de código se todas as condições anteriores forem falsas.<br><br>• Estrutura Básica<br><br>if (condição1) {<br>    // Código executado se a condição1 for verdadeira<br>} else if (condição2) {<br>    // Código executado se a condição1 for falsa e a condição2 for verdadeira<br>} else if (condição3) {<br>    // Código executado se as condições anteriores forem falsas e a condição3 for verdadeira<br>} else {<br>    // Código executado se todas as condições anteriores forem falsas<br>}<br><br>Obs: contém exemplos no projeto. Está no pacote **logicaProgramacao.condicaoif;**</p>

###