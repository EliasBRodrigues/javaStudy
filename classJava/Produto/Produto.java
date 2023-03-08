import java.util.Scanner;
public class Produto {
    private String nome;
    private int qtde;
    private double valor;
    private double total;

    public Produto() {
        this("", 0, 0, 0);
    }

    public Produto(String nome, int qtde, double valor, double total) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("---- Total de Compras ----");
        
        System.out.println("Nome Produto: ");
        setNome(entrada.next());
        
        System.out.println("Quantidade adquirida: ");
        setQtde(entrada.nextInt());
        
        System.out.println("Valor Produto: ");
        setValor(entrada.nextDouble());
        
        total = (qtde * valor);
        System.out.println(" ------ Total a ser pago ------- " + 
                "\nR$ " + this.getTotal());
    }
    
}
