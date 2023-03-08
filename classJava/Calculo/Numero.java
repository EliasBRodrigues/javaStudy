
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Numero {
    private double numb;
    private double calc;

    public Numero() {
        this(0, 0);
    }

    public Numero(double numb, double calc) {
        this.numb = numb;
        this.calc = calc;
    }

    public double getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public double getCalc() {
        return calc;
    }

    public void setCalc(double calc) {
        this.calc = calc;
    }

   public void calcularDobro(){
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("---- Dobro de um Número ----");
       
       System.out.println("Número: ");
       setNumb(entrada.nextInt());
       
       calc = (numb * 2);
       System.out.println("Dobro: " + calc);
       
       System.out.println("O dobro do número " + this.getNumb() + " é " +
               this.getCalc());
   }
    
}
