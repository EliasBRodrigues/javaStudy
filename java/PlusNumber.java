/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusnumber;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class PlusNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numb, count;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numb = entrada.nextDouble();
        
        count = Math.pow(numb, 2);
        
        System.out.println("O numero ao quadrado eh: " + count);
    }
    
}
