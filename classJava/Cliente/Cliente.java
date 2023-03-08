import java.util.Scanner;


public class Cliente {
    private String nome;
    private String end;
    private String RG;

    public Cliente() {
        this("", "", "");
    }

    public Cliente(String nome, String end, String RG) {
        this.nome = nome;
        this.end = end;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void cadastrarCliente(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----Digite os dados do Cliente------");
        
        System.out.println("Nome: ");
        setNome(entrada.next());
        
        System.out.println("Endereço: ");
        setEnd(entrada.next());
        
        System.out.println("RG: ");
        setRG(entrada.next());
        
    }
    
    public void listarCliente(){
        System.out.println("*****Dados do CLIENTE*****" +
                "\nNome: " + this.getNome() +
                "\nEndereço: " + this.getEnd() +
                "\nRG: " + this.getRG());
    }
}
