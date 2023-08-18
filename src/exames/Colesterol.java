package src.exames;

public class Colesterol extends Exame{
    
    private int colesterolHDL;
    private int colesterolLDL;

    public void setColesterolHDL(int colesterolHDL){
        this.colesterolHDL = colesterolHDL;
    }
    
    public void setColesterolLDL(int colesterolLDL){
        this.colesterolLDL = colesterolLDL;
    }

    public int getColesterolHDL(){
        return colesterolHDL;
    }

    public int getColesterolLDL(){
        return colesterolLDL;
    }
    

    @Override
    public void cadastrarExame(){
        setInformacoesPaciente();
        
        
        scan.close();
    }
    
    @Override
    protected void classficarResultado(){

    }

    @Override
    public void mostrarResultado(){
        getInformacoesPaciente();
        classficarResultado();
    }

    
}
