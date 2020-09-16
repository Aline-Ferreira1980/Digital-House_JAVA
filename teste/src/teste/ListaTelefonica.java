package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ListaTelefonica {

	public static void main(String[] args) throws IOException {
	 System.out.println("Dado de Entrada:");
	 Integer N;
	 int quantidade = 0, auxiliar = 1;
   	    	
     List<Integer> entrada = new ArrayList<>();
     List<Integer> pares = new ArrayList<>();
     List<Integer> impares = new ArrayList<>();
       
     do{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 N = Integer.parseInt(st.nextToken());
    	 if((N < 1 || N > 105) && quantidade == 0 ){
    		 System.out.println("Valor entrado não válido");
    	 }else if((N >= 1 && N <= 105) && quantidade == 0){
    		 auxiliar = N;
    		 entrada.add(N);  // parse each token to integer and add to linkedlist
    		 quantidade++;
    	 }
    	 else if(N <= 0 && quantidade >= 1) {
    		 System.out.println("Valor entrado não válido, somente números positivos");
    	 }else {
    		 entrada.add(N);  // parse each token to integer and add to linkedlist
    		 quantidade++;
    	 }
             
     }while (quantidade <= auxiliar);  // iterate until no more tokens
     entrada.remove(0);
     
     
     System.out.println("Dado de Saída:");   
     for (int i = 0; i < entrada.size(); i++) {
         if (entrada.get(i) % 2 == 0) {
             pares.add(entrada.get(i));
             Collections.sort(pares);
         } else {
             impares.add(entrada.get(i));
             Collections.sort(impares);
         }
     }

     Collections.reverse(impares);
     for (int par : pares) {
         System.out.println(par);
     }
     for (int impar : impares) {
         System.out.println(impar);
     }
 }
}