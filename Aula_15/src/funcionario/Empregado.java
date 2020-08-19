package funcionario;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salario() {
		return salarioBruto - imposto;
		
	}
	
	public double salarioComAcrescimo(double percentual) {
		//double acrescimo= (percentual *salarioBruto)+ salario();
		//return acrescimo;
		salarioBruto = (salarioBruto * percentual )+(salarioBruto- imposto);
		return salarioBruto;
	}
	
}
