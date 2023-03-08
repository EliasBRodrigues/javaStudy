
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
public class Media {
    private double numb;
    private double number;
    private double media;
    private String nome;

    public Media() {
        this(0, 0, 0, "");
    }

    public Media(double numb, double number, double media, String nome) {
        this.numb = numb;
        this.number = number;
        this.media = media;
        this.nome = nome;
    }

    public double getNumb() {
        return numb;
    }

    public void setNumb(double numb) {
        this.numb = numb;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calcularMedia(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---- Media Matemática -----");
        
        System.out.println("Digite o nome do aluno: ");
        setNome(entrada.next());
        
        System.out.println("Digite o primiero numero: ");
        setNumb(entrada.nextDouble());
        
        System.out.println("Digite o segundo numero: ");
        setNumber(entrada.nextDouble());
        
        media = (numb + number)/2;
        System.out.println("A média do aluno " + this.getNome() + 
                " é " + this.getMedia());
    }
}
