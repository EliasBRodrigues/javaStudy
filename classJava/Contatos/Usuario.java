import java.util.Scanner;
public class Usuario {
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void Mensagem(){
        System.out.println("bem vindo ao sistema de cadastro" +
                "\nNome: " + this.getNome() +
                "\nTelefone:" + this.getTelefone() +
                "\nEndereco:" + this.getEndereco() +
                "\nCidade:" + this.getCidade());
    }
    
    public void CadastroUsuario(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite um nome: ");
        setNome(entrada.next());
        
        System.out.println("digite um numero de telefone: ");
        setTelefone(entrada.next());
        
        System.out.println("digite um endereco: ");
        setEndereco(entrada.next());
       
        System.out.println("digite uma cidade: ");
        setCidade(entrada.next());
    }
}
