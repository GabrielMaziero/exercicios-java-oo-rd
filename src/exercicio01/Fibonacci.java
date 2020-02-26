package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {
        int n1 = 0, n2 = 1;
        for (int i = tamanho; i > 0; i--){
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return null;
    }

}
