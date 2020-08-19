package geometria;

public class Circulo {
	
	public static double circunferencia(double raio) {
		return 2.0 * Math.PI * raio;	
	}
	public static double volume(double raio) {
		return 4.0 *Math.PI *  Math.pow(raio, 3)/ 3.0;
	}

}
