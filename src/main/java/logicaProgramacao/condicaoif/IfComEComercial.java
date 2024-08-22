package logicaProgramacao.condicaoif;

public class IfComEComercial {

	public static void main(String[] args) {

		String nome = "Vitor Rodrigues";
		double nota1 = 10.0;
		double nota2 = 10.0;
		double nota3 = 10.0;
		double media = (nota1 + nota2 + nota3) / 3;
		double notaPassar = 7.0;
		boolean presencaDoAluno = true;
		boolean dis = false;

		if(media >= notaPassar && presencaDoAluno && dis) {
			
			System.out.println(nome +", você passou de ano.");
			
		}else {
			
			System.out.println(nome +", você reprovou de ano.");
		}
		
	}

}
