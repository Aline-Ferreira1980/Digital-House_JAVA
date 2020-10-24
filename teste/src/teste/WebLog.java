package teste;

import java.util.Scanner;

public class WebLog {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in, "ISO-8859-1")) {

            boolean temCarac01 = false;
            boolean temCarac02 = false;
            StringBuffer novaLinha = new StringBuffer();

            while (sc.hasNext()) {
                String linha = sc.nextLine();
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.substring(i, (i + 1)).contains("_")) {
                        if (temCarac01) {
                            novaLinha.append("</i>");
                            temCarac01 = false;
                        } else {
                            novaLinha.append("<i>");
                            temCarac01 = true;
                        }
                    } else {
                        if (linha.substring(i, (i + 1)).contains("*")) {
                            if (temCarac02) {
                                novaLinha.append("</b>");
                                temCarac02 = false;
                            } else {
                                novaLinha.append("<b>");
                                temCarac02 = true;
                            }
                        } else {
                            novaLinha.append(linha.substring(i, (i + 1)));
                        }
                    }
                }
                System.out.println(novaLinha);
                novaLinha.setLength(0);
            }
        }
    }
}