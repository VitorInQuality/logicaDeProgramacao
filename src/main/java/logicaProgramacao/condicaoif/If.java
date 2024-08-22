package logicaProgramacao.condicaoif;

public class If {

	public static void main(String[] args) {

		int minhaIdade = 18;
		int idadePermitida = 18;

		if (minhaIdade >= idadePermitida) {

			System.out.println("É Permitido tirar habitação, \na sua idade é " + minhaIdade + " anos");

		} else {
			System.out.println("Não é permitido tirar habitação, \nsó é permitido com " + idadePermitida + " anos");
		}

	}

}
