package logicaProgramacao.condicaoif;

public class IfComPipe {

	public static void main(String[] args) {

		String nome = "Vitor";
		int idade = 17;
		int idadePermitida = 18;
		boolean emancipado = true;

		// VALIDA A PRIMEIRA CONDIÇÃO OU SEGUNDA CONDIÇÃO
		// PIPE ||
		
		if (idade >= idadePermitida || emancipado) {

			System.out.println(nome + ", você pode tirar habilitação");

		} else {

			System.out.println(nome + ", você não pode tirar tirar habilitação");
		}

	}

}
