
package algoritmonumber;

import java.util.Scanner;


public class AlgoritmoNumber {

    public static void main(String[] args) {
        
        int numb, number, count, counter;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        numb = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        number = entrada.nextInt();
        
        count = numb * 2;
        counter = number * 3;
        
        System.out.println("O dobro do primeiro numero eh: " + 
                count + " , e o triplo do segundo eh: " + counter);
    }
    
}
