package src.exames;

public class Glicemia extends Exame{
    
    private int glicose;

    public void setGlicose(int glicose){
        this.glicose = glicose;
    }

    public int getGlicose(){
        return glicose;
    }
    
    @Override
    public void cadastrarExame(){
        setInformacoesPaciente();
        System.out.println("Digite a quantidade de glicose por mg/l: ");
        setGlicose(scan.nextInt());
        scan.close();
    }
    
    @Override
    protected void classficarResultado(){
        if (glicose < 100) {
            System.out.println("Resultado: Normoglicemia");
        } else if (glicose >= 100 && glicose < 126){
            System.out.println("Resultado: Pré-diabetes");
        } else{
            System.out.println("Resultado: Diabetes estabelecido");
        }
    }

    @Override
    public void mostrarResultado(){
        getInformacoesPaciente();
        classficarResultado();
    }

    
}
