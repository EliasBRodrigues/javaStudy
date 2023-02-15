package moneyminimus;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class MoneyMinimus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double moneyPeople, moneyMinimus, qtdMinimus;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite seu salario: ");
        moneyPeople = entrada.nextInt();
        
        System.out.println("digite o salario minimo: ");
        moneyMinimus = entrada.nextInt();
        
        qtdMinimus = (moneyPeople/moneyMinimus);
        
        System.out.println("a quantidade de salarios minimos, em relacao ao seu, corresponde a: " + qtdMinimus);
        
        
        
    }
    
}
