package logicaProgramacao.condicaoif;

public class IfEncadeado {

	public static void main(String[] args) {

		boolean opcao1 = true;
		boolean opcao2 = false;
		boolean opcao3 = false;

		if (opcao1) {
			System.out.println("Entrou na opção 1");

			if (opcao2) {
				System.out.println("Entrou na opção 2");
				if (opcao3) {
					System.out.println("Entrou na opção 3");
				} else {
					System.out.println("Não entrou na opção 3");
				}

			} else {
				System.out.println("Não entrou na opção 2");
			}

		} else {
			System.out.println("Não entrou na opção 1");
		}

	}

}
