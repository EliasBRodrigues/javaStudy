
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
public class UserContact {
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public UserContact() {
        this("", "", "", "");
    }

    public UserContact(String nome, String telefone, String endereco, String cidade) {
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
         System.out.println("os dados do usuario sao: \n" + 
                "Nome: " + this.getNome() +
                "\nTelefone: " + this.getTelefone() +
                "\nEndereco: " + this.getEndereco() +
                "\nCidade: " + this.getCidade());
    }
    
    public void RegistroUsuario(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite nome: ");
        setNome(entrada.next());
        
        System.out.println("digite telefone: ");
        setTelefone(entrada.next());
        
        System.out.println("digite endereco: ");
        setEndereco(entrada.next());
        
        System.out.println("digite cidade: ");
        setCidade(entrada.next());
    }
}

