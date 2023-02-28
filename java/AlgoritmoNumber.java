/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmonumber;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class AlgoritmoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
