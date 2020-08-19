package livro_oopJava;

public class Principal {

	public static void main(String[] args) {
			Carro meuCarro = new Carro();
			Carro seuCarro = new Carro();
			Proprietario dono1 = new Proprietario();  
			dono1.nome = "João da Silva";
			dono1.cpf = "000.000.000-00";
			dono1.idade = 25;
			dono1.logradouro = "Rua João Pinheiro, 10";
			dono1.bairro = "Centro";
			dono1.cidade = "Uberlândia";
			
			meuCarro.anoFabricacao = 2011;
			meuCarro.cor = "Prata";
			meuCarro.fabricante = "Fiat";
			meuCarro.modelo = "Palio";
			meuCarro.tipoDeCombustivel = "Bicombustivel";
			meuCarro.valorMercado = 3000;
			meuCarro.dono = dono1; //dono do carro (proprietario) foi incluido;
			
//			// atribuindo valores às variáveis do dono do seuCarro
			seuCarro.modelo = "Civic";
//			seuCarro.dono = new Proprietario();
//			seuCarro.dono.nome = "José Pereira";
//			seuCarro.dono.cpf = "111.111.111-11";
//			seuCarro.dono.idade = 30;
//			seuCarro.dono.logradouro = "Av. Monsenhor Eduardo, 983";
//			seuCarro.dono.bairro = "Bom Jesus";
//			seuCarro.dono.cidade = "Uberlândia";
			
			seuCarro.ligar();
			meuCarro.ligar();
			
			
			seuCarro.anoFabricacao = 2009;
			seuCarro.cor = "Preto";
			seuCarro.fabricante = "Honda";
			seuCarro.modelo = "Civic";
			seuCarro.tipoDeCombustivel = "Gasolina";
			seuCarro.valorMercado = 45000;
			System.out.println("Meu carro");
			System.out.println("---------------------");
			System.out.println("Modelo: " + meuCarro.modelo);
			System.out.println("Ano: " + meuCarro.anoFabricacao);
			System.out.println();
			System.out.println("Seu carro");
			System.out.println("---------------------");
			System.out.println("Modelo: " + seuCarro.modelo);
			System.out.println("Ano: " + seuCarro.anoFabricacao);

	}

}
