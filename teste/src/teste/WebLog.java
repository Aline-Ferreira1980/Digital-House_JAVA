package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

	public class WebLog {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Locale.getISOLanguages();

			        String mensagem = "";
			        String line = "";
			        boolean aberturaA = true;
			        boolean aberturaI = true;
			        String nova = "";
			        int numero = 0;
			        
			        
			        while ((line = br.readLine()) != null) {
			            mensagem = line;
			            
			            for (int i = 0; i < mensagem.length(); i++) {
			            	 if (mensagem.substring(i, (i + 1)).equals("_") && aberturaA) {
			                    aberturaA = false;
			                    nova += "<i>";
			                } else if (mensagem.substring(i, (i + 1)).equals("_") && !aberturaA) {
			                    aberturaA = true;
			                    nova += "</i>";
			                } else if (mensagem.substring(i, (i + 1)).equals("*") && aberturaI) {
			                    aberturaI = false;
			                    nova += "<b>";
			                } else if (mensagem.substring(i, (i + 1)).equals("*") && !aberturaI) {
			                    aberturaI = true;
			                    nova += "</b>";
			                } else {
			                    nova += mensagem.substring(i, (i + 1));
			                }
			            }
			            System.out.println(nova);
			            nova = "";
			        }
				}
			}