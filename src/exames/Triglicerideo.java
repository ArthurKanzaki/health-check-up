package src.exames;

public class Triglicerideo extends Exame {

    private int triglicerideo;

    public int getTriglicerideo() {
        return triglicerideo;
    }

    public void setTriglicerideo(int triglicerideo) {
        this.triglicerideo = triglicerideo;
    }

    @Override
    public void cadastrarExame() {
        this.setInformacoesPaciente();
        System.out.println("Digite a quantidade de Triglicerídeos por mg/L: ");
        this.setTriglicerideo(scan.nextInt());
    }
    
    @Override
    protected String classficarResultado() {
        int idadePaciente = (2023 - this.getAnoNascimento());

        if (idadePaciente>= 0 && idadePaciente <= 9){
            if(this.getTriglicerideo() < 75){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }else if (idadePaciente >= 10 && idadePaciente <= 19){
            if(this.getTriglicerideo() < 90){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }else{
            if(this.getTriglicerideo() < 150){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }
        
    }

    @Override
    public void mostrarResultado() {
        this.getInformacoesPaciente();
        System.out.println("Triglicerídeo por mg/L: "+this.getTriglicerideo());        
        System.out.println(this.classficarResultado());
       
    }

    
}
