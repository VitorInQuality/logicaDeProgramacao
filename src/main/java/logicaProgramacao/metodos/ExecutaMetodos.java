package logicaProgramacao.metodos;

public class ExecutaMetodos {

	public static void main(String[] args) {

		MetodosVazio metodoVazio = new MetodosVazio();
		MetodoRetorno metodoRetorno = new MetodoRetorno();
		MetodoAtributo metodoAtributo = new MetodoAtributo();

		// metodoVazio.mensagem();
		//System.out.println("O nome retornado pelo método é " + metodoRetorno.nome());
		metodoAtributo.digiteSeuNome("Vitor Rodrigues");
		metodoAtributo.digiteSuaIdade(20);
	}
}
