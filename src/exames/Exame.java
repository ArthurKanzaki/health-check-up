package src.exames;
import java.util.Scanner;

public abstract class Exame {

/////////////   Atributos    /////////////  

    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;
    protected Scanner scan = new Scanner(System.in);


/////////////   Métodos    ///////////// 

// Encpasulamento

    protected void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }

    protected void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }

    protected void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getNomePaciente(){
        return nomePaciente;
    }

    public String getTipoSanguineo(){
        return tipoSanguineo;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void getInformacoesPaciente(){
        System.out.println("Nome: "+getNomePaciente());
        System.out.println("Tipo Sanguíneo: "+getTipoSanguineo());
        System.out.println("Ano de Nascimento: "+getAnoNascimento());
    }

    protected void setInformacoesPaciente(){
        
        System.out.println("Digite o nome: ");
        setNomePaciente(scan.nextLine());
        
        System.out.println("Digite o tipo Sanguíneo: ");
        setTipoSanguineo(scan.nextLine());
        
        System.out.println("Digite o ano de nascimento: ");
        setAnoNascimento(scan.nextInt());
    }

// Ações

    protected abstract void classficarResultado();
    public abstract void mostrarResultado();
    public abstract void cadastrarExame();

}

