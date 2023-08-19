package src.exames;

public class Colesterol extends Exame{
    
    private int colesterolHDL;
    private int colesterolLDL;
    private String riscoPaciente;

    protected void setColesterolHDL(int colesterolHDL){
        this.colesterolHDL = colesterolHDL;
    }
    
    protected void setColesterolLDL(int colesterolLDL){
        this.colesterolLDL = colesterolLDL;
    }
    
    protected void setRiscoPaciente(String riscoPaciente){
        this.riscoPaciente = riscoPaciente;
    }

    protected int getColesterolHDL(){
        return colesterolHDL;
    }

    protected int getColesterolLDL(){
        return colesterolLDL;
    }

    protected String getRiscoPaciente(){
        return riscoPaciente;
    } 
    

    @Override
    public void cadastrarExame(){

        this.setInformacoesPaciente();

        System.out.println("Digite a quantidade de Colesterol HDL por mg/L: ");
        this.setColesterolHDL(scan.nextInt());

        System.out.println("Digite a quantidade de Colesterol LDL por mg/L: ");
        this.setColesterolLDL(scan.nextInt());

        System.out.println("Digite o risco do paciente (A - Alto; M - Médio; B Baixo)");
        this.setRiscoPaciente(scan.next());

        scan.close();
    }
    
    @Override
    protected String classficarResultado(){
        int idadePaciente = (2023 - this.getAnoNascimento());
        String result = "";

        // Classificate HDL
        if(idadePaciente >= 0 && idadePaciente <= 19){
            if (this.getColesterolHDL() > 45){
                result = "Classificação HDL: BOM\n";
            }else{
                result = "Classificação HDL: RUIM\n";
            }
        }else{
            if (this.getColesterolHDL() > 40){
                result = "Classificação HDL: BOM\n";
            }else{
                result = "Classificação HDL: RUIM\n";
            }
        }
        
        // Classificate LDL
        switch(this.getRiscoPaciente()){
            case "B": // Baixo
                if(this.getColesterolLDL() < 100){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
            case "M": // Médio
                if(this.getColesterolLDL() < 70){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
            case "A": // Alto
                if(this.getColesterolLDL() < 50){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
        }
        
        return result;

    }

    @Override
    public void mostrarResultado(){
        this.getInformacoesPaciente();
        System.out.println("Colesterol HDL por mg/L: "+this.getColesterolHDL());
        System.out.println("Colesterol LDL por mg/L: "+this.getColesterolLDL());
        System.out.println(this.classficarResultado());
    }

    
}
