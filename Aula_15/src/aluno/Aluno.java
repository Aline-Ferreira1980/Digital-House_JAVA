package aluno;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	

	public double notaTotal() {
		return (nota1 + nota2 + nota3);
	}
	
	public String passou() {
		if (notaTotal ()>= 60) {
			return "Aprovado";
		}else {
			return"Reprovado! Faltou "+ (60-notaTotal());
		}
	}
	
}
