
package taxajuros;

import java.util.Scanner;

public class TaxaJuros {

  
    public static void main(String[] args) {
        double value, taxa, delayValue;
        int time;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor da prestacao: ");
        value = entrada.nextDouble();
        
        System.out.println("Digite o valor da taxa de juros: ");
        taxa = entrada.nextDouble();
        
        System.out.println("Digite quantos meses de atraso: ");
        time = entrada.nextInt();
        
        delayValue = value + (value * (taxa/100) * time);
        
        System.out.println("O valor da prestacao em atraso eh: " + 
                delayValue);
    }
    
}
