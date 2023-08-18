import java.util.Scanner;

public class Colesterol extends Exame{
    
    private int glicose;

    public Colesterol(){
        super();
    }

    public void setGlicose(int glicose){
        this.glicose = glicose;
    }

    public int getGlicose(){
        return glicose;
    }
    
    @Override
    public void cadastrarExame(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        setNomePaciente(scan.nextLine());

        System.out.println("Digite o tipo Sanguíneo: ");
        setTipoSanguineo(scan.nextLine());

        System.out.println("Digite o ano de nascimento: ");
        setAnoNascimento(scan.nextInt());

        System.out.println("Digite a quantidade de cliose por mg/l: ");
        setGlicose(scan.nextInt());

        scan.close();
    }
    
    @Override
    public void classficarResultado(){
        if (glicose < 100) {
            System.out.println("Normoglicemia");
        } else if (glicose >= 100 && glicose < 126){
            System.out.println("Pré-diabetes");
        } else{
            System.out.println("Diabetes estabelecido");
        }
    }

    @Override
    public void mostrarResultado(){
        System.out.println(getNomePaciente());
        System.out.println(getTipoSanguineo());
        System.out.println(getAnoNascimento());
        classficarResultado();
    }

    
}
