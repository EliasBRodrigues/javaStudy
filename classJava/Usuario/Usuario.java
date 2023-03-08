public class Usuario {
    /* atributos */
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    /* constructor */
    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    
    /* encapsular */

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
    
    public void Mensagem(){
        System.out.println("os dados do usuario sao: Nome: " + this.getNome() + 
                "\nEmail: " + this.getEmail() + "\nLogin: " + this.getLogin() +
                "\nSenha: " + this.getSenha());
    }
    
}
