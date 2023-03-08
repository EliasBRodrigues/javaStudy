
package movelvendido;

import java.util.Scanner;


public class MovelVendido {

  
    public static void main(String[] args) {
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
