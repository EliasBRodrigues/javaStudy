
package salarionew;

import java.util.Scanner;


public class SalarioNew {

    public static void main(String[] args) {
        
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
