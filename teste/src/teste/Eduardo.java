package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Eduardo {
	  public static void main(String[] args) throws IOException {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st2 = new StringTokenizer(br2.readLine());
	        
	        int km = Integer.parseInt(st.nextToken());
	        Double lt = Double.parseDouble(st2.nextToken());

	        Double combustivel = Double.parseDouble(formtarDecimal(".#", lt));
	        
	        Double consumoMedio = km / combustivel;
	        
	        //System.out.printf("%.3f km/l\n", consumoMedio);
	        System.out.println(Double.parseDouble(formtarDecimal(".###", consumoMedio)) + " km/l");
	    }
	    
	    public static String formtarDecimal(String decimal, double combustivel) {
	        DecimalFormat df = new DecimalFormat(decimal);
	        //df.setRoundingMode(RoundingMode.FLOOR); //impede do numero ser arredondado
	        String teste = df.format(combustivel);
	        return teste.replace(',', '.');
	    }

	}
