import src.exames.Colesterol;
import src.exames.Triglicerideo;
import src.exames.Glicemia;

public class Principal {
    public static void main(String[] args) {
        
        Glicemia exameGlicemia = new Glicemia();
        exameGlicemia.cadastrarExame();
        exameGlicemia.mostrarResultado();
        
        System.out.println("----------------");

        Colesterol exameColesterol = new Colesterol();
        exameColesterol.cadastrarExame();
        exameColesterol.mostrarResultado();

        System.out.println("----------------");

        Triglicerideo exameTriglicerideo = new Triglicerideo();
        exameTriglicerideo.cadastrarExame();
        exameTriglicerideo.mostrarResultado();

    }
}
