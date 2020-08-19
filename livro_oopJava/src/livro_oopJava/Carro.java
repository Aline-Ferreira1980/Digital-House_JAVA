package livro_oopJava;

public class Carro {

	//atributos do carro 
	String fabricante;
	String modelo;
	String cor;
	String tipoDeCombustivel;
	int anoFabricacao;
	double valorMercado;
	Proprietario dono; //chamando a Classe Proprietario,
	
	void ligar() {
		if (modelo != null) {
		System.out.println("Ligando carro " + modelo);
		}
	}
}