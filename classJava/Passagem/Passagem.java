import java.util.Scanner;
public class Passagem {
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    public Passagem() {
        this("", "", "", "", "", "", "");
    }

    public Passagem(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }

    public void cadastrarDadosPassageiros(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------Digite os dados do Passageiro----------");
        
        System.out.println("Nome do Passageiro: ");
        setNomePassageiro(entrada.next());
        
        System.out.println("Telefone do Passageiro: ");
        setTelefone(entrada.next());
        
        System.out.println("RG do Passageiro: ");
        setRG(entrada.next());
    }
    
    public void cadastrarDadosPassagem(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------Digite os dados da Passagem----------");
        
        System.out.println("Destino da Viagem: ");
        setLocalViagem(entrada.next());
        
        System.out.println("Data da Viagem: ");
        setData(entrada.next());
        
        System.out.println("Horário da Viagem: ");
        setHorario(entrada.next());
        
        System.out.println("Número da Poltrona: ");
        setNumPoltrona(entrada.next());
    }
    
    
    public void mostrarDadosPassageiro(){
        System.out.println("**********Dados do Passageiro********" +
                "\nNome: " + this.getNomePassageiro() +
                "\nTelefone: " + this.getTelefone() +
                "\nRG: " + this.getRG());
    }
    
    
    public void mostrarDadosPassagem(){
        System.out.println("*********Dados da Passagem*********" +
                "\nDestino Viagem: " + this.getLocalViagem() +
                "\nData: " + this.getData() +
                "\nHorário: " + this.getHorario() +
                "\nNúmero da Poltrona: " + this.getNumPoltrona());
    }
    
}
