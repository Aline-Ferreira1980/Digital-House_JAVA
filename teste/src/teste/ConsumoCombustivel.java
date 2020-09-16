package teste;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoCombustivel {
		public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner(System.in);
	    	
		    Double media;
		     int distanciaPercorrida = sc.nextInt();
		    double combustivelConsumido = sc.nextDouble();
		    
		    media = distanciaPercorrida /combustivelConsumido;
		
	
		    	  System.out.printf("%.3f km/l", media);
		    sc.close();	  
		}      

	}