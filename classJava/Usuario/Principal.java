/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* acessar Usuario.java, INSTANCIAR */
        
        Usuario user = new Usuario();
        
        /* guardando dados nos atributos da classe usuario */
        user.setNome("elias");
        user.setEmail("olamundo@olamundo.com");
        user.setLogin("elias@123");
        user.setSenha("12345678");
        user.Mensagem();
    }
    
}
