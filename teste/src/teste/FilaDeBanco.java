package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FilaDeBanco {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer quantidadePessoas = Integer.parseInt(st.nextToken());

        List<Integer> quantidadeAjusteOrdem = new ArrayList<>();
        List<Integer> numeroAjustar = new ArrayList<>();
        List<Integer> pessoasJaAlteradas = new ArrayList<>();

        for (int i = 0; i < quantidadePessoas; i++) {

            st = new StringTokenizer(br.readLine());

            st = new StringTokenizer(br.readLine());

            Integer quantidadeLoop = 0;
            Integer numeroAnterior = 0;
            Integer numeroAtual = 0;
            Integer quantidadeElementos = 0;
            Integer fezTroca = 0;
            Integer quantidadeElementosTotal = st.countTokens();

            while (st.hasMoreElements()) {
                quantidadeElementos++;
                if (numeroAnterior == 0) {
                    numeroAnterior = Integer.parseInt(st.nextToken());
                } else {
                    numeroAtual = Integer.parseInt(st.nextToken());
                    if (numeroAtual > numeroAnterior) {
                        fezTroca = 1;
                        if (pessoasJaAlteradas.contains(numeroAnterior) == false) {
                            pessoasJaAlteradas.add(numeroAnterior);
                        }
                        if (pessoasJaAlteradas.contains(numeroAtual) == false) {
                            pessoasJaAlteradas.add(numeroAtual);
                        }
                        numeroAjustar.add(numeroAtual);
                        numeroAjustar.add(numeroAnterior);
                    } else {
                        if (numeroAjustar.contains(numeroAnterior) == false) {
                            numeroAjustar.add(numeroAnterior);
                        }
                        if (quantidadeElementos == quantidadeElementosTotal && numeroAjustar.contains(numeroAtual) == false) {
                            numeroAjustar.add(numeroAtual);
                        }
                    }
                    numeroAnterior = numeroAtual;
                }
            }

            numeroAnterior = 0;
            quantidadeLoop = 0;
            Integer entrouSinalMaior = 0;
            if (fezTroca == 1) {
                fezTroca = 0;
                for (int j = 0; j < numeroAjustar.size(); j++) {
                    quantidadeLoop++;
                    if (numeroAnterior == 0) {
                        numeroAnterior = numeroAjustar.get(j);
                    } else {
                        numeroAtual = numeroAjustar.get(j);
                        if (numeroAtual > numeroAnterior) {
                            if (pessoasJaAlteradas.contains(numeroAnterior) == false) {
                                pessoasJaAlteradas.add(numeroAnterior);
                            }
                            if (pessoasJaAlteradas.contains(numeroAtual) == false) {
                                pessoasJaAlteradas.add(numeroAtual);
                            }
                            fezTroca = 1;
                            entrouSinalMaior = 1;
                            //trocouLugar = trocouLugar + 2;
                            numeroAjustar.add(numeroAtual);
                            numeroAjustar.add(numeroAnterior);
                        } else {
                            if (entrouSinalMaior == 0) {
                                numeroAjustar.add(numeroAnterior);
                            } else {
                                entrouSinalMaior = 0;
                            }
                            if (quantidadeLoop % quantidadeElementos == 0) {
                                numeroAjustar.add(numeroAtual);
                            }
                        }
                        numeroAnterior = numeroAtual;
                    }
                    if (quantidadeLoop % quantidadeElementos == 0 && fezTroca == 0) {
                        break;
                    } else if (quantidadeLoop % quantidadeElementos == 0 && fezTroca == 1) {
                        fezTroca = 0;
                        numeroAnterior = 0;
                    }
                }
            }

            numeroAjustar.clear();

            quantidadeElementos = quantidadeElementos - pessoasJaAlteradas.size();
            if (quantidadeElementos < 0) {
                quantidadeElementos = 0;
            }
            quantidadeAjusteOrdem.add(quantidadeElementos);
            pessoasJaAlteradas.clear();
        }

        quantidadeAjusteOrdem.stream().forEach(result -> System.out.println(result));
    }

}