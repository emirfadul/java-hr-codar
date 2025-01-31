package secao18_Loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {

    int[] numerosEscolhidos;
    int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos, int[] resultadoSorteio) {
        this.numerosEscolhidos = numerosEscolhidos;
        this.resultadoSorteio = resultadoSorteio;
    }

    // METODO REALIZAR SORTEIO
    public void realizarSorteio() {
        Random random = new Random();

        resultadoSorteio = new int[6];

        for (int i = 0; i < resultadoSorteio.length; i++) {
            resultadoSorteio [i]= random.nextInt(60) + 1;
        }
        Arrays.sort(resultadoSorteio);
    }

    // METODO NUMERO DE ACERTOS
    public int contarAcertos(){

        int acertos = 0;

        for (int numerosEscolhido : numerosEscolhidos) {
            for (int numeroSorteado : resultadoSorteio) {
                if (numerosEscolhido == numeroSorteado) {
                    acertos++;
                }
            }
        }
        return acertos;
    }
    
    // METODO EXIBIR OS RESULTADOS
    public void exibirResultados(){
        System.out.println("Numeros escolhidos: "+Arrays.toString(numerosEscolhidos));
        System.out.println("Numeros sorteados: "+Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();

        System.out.println("Voce acertou "+acertos+" numeros.");
        System.out.println();

    }
}
