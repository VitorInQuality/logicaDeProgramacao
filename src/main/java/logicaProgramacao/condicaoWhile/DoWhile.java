package logicaProgramacao.condicaoWhile;

public class DoWhile {
	public static void main(String[] args) {

		int numero1 = 20;
		int numero2 = 20;

		do {

			numero1 += 1;
			System.out.println("Entrei no while, o número1 vale: " + numero1);
		} while (numero1 < numero2);

		System.out.println("Fora do while, o número1 vale: " + numero1);

	}

}
