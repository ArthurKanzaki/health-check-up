import src.exames.Colesterol;

public class Principal {
    public static void main(String[] args) {
        
        //Exame glicemia = new Glicemia();
        //glicemia.cadastrarExame();
        //glicemia.mostrarResultado();
        
        Colesterol exameColesterol = new Colesterol();

        exameColesterol.cadastrarExame();
        exameColesterol.mostrarResultado();
    

    }
}
