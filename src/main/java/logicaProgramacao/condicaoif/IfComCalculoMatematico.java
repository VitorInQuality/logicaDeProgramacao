package logicaProgramacao.condicaoif;

public class IfComCalculoMatematico {

	public static void main(String[] args) {

		String nome = "Thays Rodrigues";
		double mediaPassar = 7;
		double nota1 = 10.0;
		double nota2 = 8.5 ;
		double nota3 = 7.5;
		double mediaNotas = (nota1 + nota2 + nota3) / 3;
		
		if (mediaNotas >= mediaPassar) {
			
			System.out.println(nome +", \nParabéns você passou de ano, \nsua nota foi " + mediaNotas);
		}else {
			
			System.out.println(nome +", \nInfelizmente você repetiu de ano, \nsua nota foi " + mediaNotas + " e precisava ser no mínimo " + mediaPassar);
		}

	}
}
