package varidade;

import java.util.Scanner;


public class VarIdade {

    public static void main(String[] args) {
        
        int age, days;
        String name;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        name = entrada.next();
        
        System.out.println("digite sua idade: ");
        age = entrada.nextInt();
        
        days = (age * 365);
        
        System.out.println(name + ", você já viveu " + days + " dias");

    }
    
}
