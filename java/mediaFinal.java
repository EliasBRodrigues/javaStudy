package mediafinal;

import java.util.Scanner;


public class MediaFinal {

   
    public static void main(String[] args) {
    
        int n1, n2, n3, n4, n5, n6, mediaFirst, mediaSecond, mediaFinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("nota 01:");
        n1 = entrada.nextInt();
        System.out.println("nota 02:");
        n2 = entrada.nextInt();
        
        System.out.println("nota 03:");
        n3 = entrada.nextInt();
        System.out.println("nota 04:");
        n4 = entrada.nextInt();
        
        System.out.println("nota 05:");
        n5 = entrada.nextInt();
        System.out.println("nota 06:");
        n6 = entrada.nextInt();
        
        mediaFirst = (n1 + n2 + n3)/3;
        
        mediaSecond = (n3 + n4 + n5)/3;

        mediaFinal = (mediaFirst + mediaSecond)/2;
        
        System.out.println("primeira media: " + mediaFirst + ", segunda media:" + mediaSecond + ", e media final: " + mediaFinal);
    }
    
}
