package proentradadados;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ProEntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // adicionar dados
        int n1, n2, sum, sub, ply, div;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero:");
        n1 = entrada.nextInt();
        
        System.out.println("digite o segundo numero:");
        n2 = entrada.nextInt();
        
        /*comando ler inteiros - entrada.nextInt();
                    reais - entrada.nextDouble()
                            entrada.nextFloat()
                    caracter = next() */

        sum = n1 + n2;
        sub = n1 - n2;
        ply = n1 * n2;
        div = (n1/n2);

        System.out.println("valor da soma é " + sum + " e o valor da subtracao é: " + sub +
                " valor da multiplicacao é " + ply + " e o valor da divisao é: " + div);
    }
    
}

