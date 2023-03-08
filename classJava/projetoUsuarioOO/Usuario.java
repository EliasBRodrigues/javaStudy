import java.util.Scanner;
public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;

    //valor int = 0 e double 0.0
    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //mensagem
    public void Mensagem(){
        System.out.println("os dados do usuario sao: \n" + 
                "Nome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nLogin: " + this.getLogin() +
                "\nSenha: " + this.getSenha());
    }
    //cadastrar usuario
    public void CadastroUsuario(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o nome do usuario:");
        setNome(entrada.next());
        
        System.out.println("digite o email do usuario:");
        setEmail(entrada.next());
        
        System.out.println("digite o login do usuario:");
        setLogin(entrada.next());
        
        System.out.println("digite a senha do usuario:");
        setSenha(entrada.next());
    }
}
