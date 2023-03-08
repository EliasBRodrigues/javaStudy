
package plusnumber;

import java.util.Scanner;

public class PlusNumber {

    public static void main(String[] args) {
        double numb, count;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numb = entrada.nextDouble();
        
        count = Math.pow(numb, 2);
        
        System.out.println("O numero ao quadrado eh: " + count);
    }
    
}
