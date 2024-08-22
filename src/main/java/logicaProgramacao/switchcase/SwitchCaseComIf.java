package logicaProgramacao.switchcase;

public class SwitchCaseComIf {

	public static void main(String[] args) {

		int opcao = 2;
		double valorProduto = 10000.0;
		double saldoCliente = 12000.0;

		switch (opcao) {

		case 1:
			System.out.println("Você escolheu pagar á vista.");

			double desconto = 2000;
			valorProduto = valorProduto - desconto;
			if (saldoCliente >= valorProduto) {

				System.out.println("Compra realizada com sucesso, o valor do produto com desconto é R$" + valorProduto);
			} else {
				System.out.println("Compra negada, o valor do produto com desconto é R$" + valorProduto);
			}
			break;

		case 2:

			System.out.println("Você escolheu pagar no crédito.");
			double juros = 2000.0;
			valorProduto = valorProduto + juros;
			if (saldoCliente >= valorProduto) {

				System.out.println("Compra realizada com sucesso, o valor do produto com juros é R$" + valorProduto);
			} else {
				System.out.println("Compra negada, o valor do produto com juros é R$" + valorProduto);
			}
			break;

		case 3:

			System.out.println("Você escolheu pagar no boleto.");
			double juros1 = 5000.0;
			valorProduto = valorProduto + juros1;
			if (saldoCliente >= valorProduto) {

				System.out.println("Compra realizada com sucesso, o valor do produto com juros é R$" + valorProduto);
			} else {
				System.out.println("Compra negada, o valor do produto com juros é R$" + valorProduto);
			}
			break;

		default:
			System.out.println("Opção inválida. Escolha 1, 2, ou 3");
			break;

		}

	}

}