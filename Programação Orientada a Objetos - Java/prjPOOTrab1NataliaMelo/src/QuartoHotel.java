
/**
 *
 * @author Natalia
 */
public class QuartoHotel {
    
    private int numQuarto;
    private double valorDiaria;
    private double totalFaturado;
    private boolean situacao;
    private int numRG = 0;
    
    public double liberar(int numDias){
        totalFaturado = totalFaturado + (valorDiaria * numDias);
        numRG= 0;
        situacao = false;
        return (numDias * valorDiaria);     
    }
    public QuartoHotel(int quarto, double diaria){
        numQuarto = quarto;
        valorDiaria = diaria;
    }
    public void reservar(int rg){
        numRG = rg;
        situacao = true;
    }

        public double getTotalFaturado(){
        return (totalFaturado);
    }
    public boolean getSituacao(){
        return (situacao);
    }
 
 
    
}