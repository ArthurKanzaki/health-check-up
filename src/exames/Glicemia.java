package src.exames;

public class Glicemia extends Exame{
    
    private int glicose;

    protected void setGlicose(int glicose){
        this.glicose = glicose;
    }

    protected int getGlicose(){
        return glicose;
    }
    
    @Override
    public void cadastrarExame(){
        this.setInformacoesPaciente();
        System.out.println("Digite a quantidade de glicose por mg/L: ");
        this.setGlicose(scan.nextInt());
    }
    
    @Override
    protected String classficarResultado(){
        if (glicose < 100) {
            return "Resultado: Normoglicemia";
        } else if (glicose >= 100 && glicose < 126){
            return "Resultado: Pré-diabetes";
        } else{
            return "Resultado: Diabetes estabelecido";
        }
    }

    @Override
    public void mostrarResultado(){
        this.getInformacoesPaciente();
        System.out.println(this.classficarResultado());
    }

    
}
