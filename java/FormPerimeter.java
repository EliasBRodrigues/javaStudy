package formperimeter;

import java.util.Scanner;

public class FormPerimeter {

    public static void main(String[] args) {
        
        
        int sideA, sideB, ply, sum;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("lado A:");
        sideA = entrada.nextInt();
        
        System.out.println("lado B:");
        sideB = entrada.nextInt();
        
        ply = (sideA * sideB);
        
        sum = 2 * (sideA + sideB);
        
        System.out.println("A area eh: " + ply + " e o perimetro eh: " + sum);
    }
    
}
