package logicaProgramacao.variaveis;

public class AtribuindoValor {

	public static void main(String[] args) {

		// TIPO INTEIRO
		int idade;
		short numeroPequeno;
		long populacao;
		byte idadeByte;

		System.out.println("\n*****TIPO INTEIRO*****");
		idade = 30;
		System.out.println("Idade: " + idade);

		numeroPequeno = 1000;
		System.out.println("Número pequeno: " + numeroPequeno);

		populacao = 7_900_000_000L;
		System.out.println("População: " + populacao);

		idadeByte = 25;
		System.out.println("Idade em byte: " + idadeByte);

		// TIPO PONTO FLUTUANTE
		float temperatura;
		double distancia;

		System.out.println("\n*****TIPO PONTO FLUTUANTE*****");
		temperatura = 23.5f;
		System.out.println("Temperatura: " + temperatura);
		distancia = 12345.6789;
		System.out.println("Distância: " + distancia);

		// TIPO CARACTERE
		char letra;
		char numero;
		char simbolo;

		System.out.println("\n*****TIPO CARACTERE*****");
		letra = 'A';
		System.out.println("Letra: " + letra);

		numero = '1';
		System.out.println("Número: " + numero);

		simbolo = '@';
		System.out.println("Símbolo: " + simbolo);

		// TIPO BOOLEANO
		boolean isTrue;
		boolean isFalse;
		System.out.println("\n*****TIPO BOOLEANO*****");

		isTrue = true;
		System.out.println("Java é divertido? " + isTrue);

		isFalse = false;
		System.out.println("Java é divertido? " + isFalse);

	}

}
