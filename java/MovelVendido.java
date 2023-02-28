/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movelvendido;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class MovelVendido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fixed = 1000;
        int bonus = 50;
        
        double moveis, salario, newSalario; 
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de moveis vendidos: ");
        moveis = entrada.nextInt();
        
        salario = (fixed * moveis/bonus);
        newSalario = salario + fixed;
        System.out.println("O novo salario eh: " + newSalario);
    }
    
}
