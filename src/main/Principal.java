import src.exames.Colesterol;
import src.exames.Exame;

public class Principal {
    public static void main(String[] args) {
        
        Exame colesterol = new Colesterol();

        colesterol.cadastrarExame();
        colesterol.mostrarResultado();
    

    }
}
