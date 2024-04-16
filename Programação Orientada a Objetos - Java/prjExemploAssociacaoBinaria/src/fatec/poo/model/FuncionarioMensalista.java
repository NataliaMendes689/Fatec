package fatec.poo.model;

/**
 * @author Natalia
 */
public class FuncionarioMensalista extends Funcionario{
    private double numSalMin;
    private double valSalMin;

    public FuncionarioMensalista(int r,
                                 String n, 
                                 String dtAdm, 
                                 double vsm) {
        super(r, n, dtAdm);//chamada ao método construtor da superclasse
        valSalMin = vsm;
    }

    public void setNumSalMin(double nsm) {
        numSalMin = nsm;
    }    
    
    @Override
    //Aplicando o polimorfismo
    public double calcSalBruto() {
        return(valSalMin * numSalMin);
    }
}
