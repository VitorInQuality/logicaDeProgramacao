package logicaProgramacao.condicaoif;

public class IfComElseIf {

	public static void main(String[] args) {

		boolean dinheiro = false;
		boolean credito = false;
		boolean boleto = true;
		int preco = 10000;

		System.out.println("****************************************************");
		System.out.println("***************** E2E TREINAMENTOS *****************");
		System.out.println("****************************************************\n");
		
		if (dinheiro) {

			int desconto = 600;
			//preco = preco - desconto;
			preco -= desconto;
			System.out.println("Parabéns você comprou o carro no valor de R$ " + preco);

		} else if (credito) {
			
			int juros = 1500;
			//preco = preco + juros;
			preco += juros;
			System.out.println("Parabéns você comprou o carro no valor de R$ " + preco);

		} else if (boleto) {
			
			int juros = 3000;
			//preco = preco + juros;
			preco += juros;
			System.out.println("Parabéns você comprou o carro no valor de R$ " + preco);

		} else {
			System.err.println("opção de pagamento não disponível");

		}

	}
}
