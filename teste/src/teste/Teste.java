package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teste {
	  public static void main(String[] args) throws IOException {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	
		    int cem = 0;
		    int cinquenta =0;
		    int vinte = 0;
		    int dez = 0;
		    int cinco = 0;
		    int dois = 0;
		    int um =  0;
		    
		  System.out.println(N);
		
			  if (N >= 100) {
				   cem = N/100;
				   N = N % 100;
			  }
			  if(N >= 50) {
		   			cinquenta = N/50;
		   			N = N%50;
			  }
			  if (N>=20) {
	   				vinte = N/20;
	   				N = N %20 ;
			  }
 				if(N>=10) {
 					dez = N/10;
 					N = N%10;
 				}
			  if (N>= 5 ) {
						cinco = N/5;
						N= N %5;
			  }
			  if (N>=2 ) {
 					dois = N/2;
 					N = N%2 ;
			  } 
			  if(N >= 1) {
				um = N/1;
			}
			  
		  
	
		    	  System.out.println(cem +" nota(s) de R$ 100,00");
		    	  System.out.println(cinquenta +" nota(s) de R$ 50,00");	
		    	  System.out.println(vinte +" nota(s) de R$ 20,00");
		    	  System.out.println(dez +" nota(s) de R$ 10,00");
		    	  System.out.println(cinco +" nota(s) de R$ 5,00");
		    	  System.out.println(dois +" nota(s) de R$ 2,00");
		    	  System.out.println(um +" nota(s) de R$ 1,00");
		      }       
	  }
