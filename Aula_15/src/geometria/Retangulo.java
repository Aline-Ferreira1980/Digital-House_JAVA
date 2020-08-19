package geometria;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return 2*(largura + altura);
	}
	
	public double diagonal() {
		double diag = Math.pow(altura, 2);
		double diagL= Math.pow(largura, 2);
		double diagonal = (diag + diagL);
		return Math.sqrt(diagonal);
		
	}
	@Override
	public String toString() {
		return "Area: "+area()
				+"\nPerimetro: "+ perimetro()
				+ "\nDiagonal: "+diagonal();
	}
}
