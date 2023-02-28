/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarionew;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class SalarioNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salario, newSalario, percentual;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Digite o salario do functionario: ");
        salario = entrada.nextDouble();
        
        System.out.println("Digite o percentual de aumento: ");
        percentual = entrada.nextDouble();
        
        newSalario = salario + (salario * percentual/100);
        
        System.out.println("Novo salario eh: " + newSalario);
    }
    
}
