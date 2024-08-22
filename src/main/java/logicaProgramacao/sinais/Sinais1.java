package logicaProgramacao.sinais;

public class Sinais1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 10;
		boolean pergunta = false;

		if (pergunta) {

			System.out.println("A pergunta é verdadeira");
		}

		if (!pergunta) {

			System.out.println("A pergunta é falsa");
		}

		if (n1 > n2) {

			System.out.println("N1 é maior que N2");
		}
		if (n1 < n2) {

			System.out.println("N1 é menor que N2");
		}

		if (n1 == n2) {

			System.out.println("N1 e N2 são iguais");
		}

		if (n1 != n2) {

			System.out.println("N1 e N2 são diferentes");
		}
	}

}
