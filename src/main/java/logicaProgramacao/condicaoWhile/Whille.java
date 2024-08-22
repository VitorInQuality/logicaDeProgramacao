package logicaProgramacao.condicaoWhile;

public class Whille {

	public static void main(String[] args) {

		int numero1 = 10;
		int numero2 = 20;

		while (numero1 < numero2) {

			numero1 += 2;
			System.out.println("Entrei no while, o número1 vale: " + numero1);
		}

		System.out.println("Sai do while, o número1 vale: " + numero1);
	}

}
