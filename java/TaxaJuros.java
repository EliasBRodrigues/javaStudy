/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxajuros;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class TaxaJuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
