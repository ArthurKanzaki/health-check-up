public abstract class Exame {

/////////////   Atributos    /////////////  

    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;


/////////////   Métodos    ///////////// 

// Encpasulamento

    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }

    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }

    public void setAnoNascimento(int anoNascimento){
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

// Ações

    public abstract void classficarResultado();
    public abstract void mostrarResultado();
    public abstract void cadastrarExame();
}
