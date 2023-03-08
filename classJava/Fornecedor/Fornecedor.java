
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
public class Fornecedor {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedor() {
        this("", "", "");
    }

    public Fornecedor(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarForncedor(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Digite os dados do Fornecedor e do Produto ******");
        System.out.println("****** Nome Fornecedor: ******");
        setNomeFornecedor(entrada.next());
        
        System.out.println("****** Nome Produto: ******");
        setNomeProduto(entrada.next());
        
        System.out.println("***** Descrição do Produto: *****");
        setDescricaoProduto(entrada.next());
    }
    
    public void listarFornecedor(){
        System.out.println("----Dados Fornecedor e Produto----" +
                "\nNome Fornecedor:" + this.getNomeFornecedor() +
                "\nNome Produto:" + this.getNomeProduto() +
                "\nDescrição Produto:" + this.getDescricaoProduto());
    }
    
}
