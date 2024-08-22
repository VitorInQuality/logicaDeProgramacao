package logicaProgramacao.condicaoif;

public class IfAninhado {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = false;
		boolean condicao3 = false;

		if (condicao1) {
			System.out.println("Entrou na condição 1");

			if (condicao2) {
				System.out.println("Entrou na condição 2");
				if (condicao3) {
					System.out.println("Entrou na condição 3");
				} else {
					System.out.println("Não entrou na condição 3");
				}

			} else {
				System.out.println("Não entrou na condição 2");
			}

		} else {
			System.out.println("Não entrou na condição 1");
		}

	}

}
