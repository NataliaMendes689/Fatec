package fatec.poo.model;

/**
 * @author Natalia
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;
    
    public PedidoCompra(int n){
        numero = n;
    }
    public void setDataPedido(String dt){
        dataPedido = dt;
    }
    public void setValor(double val){
        valor = val;
    }
    public String getDataPedido(){
        return dataPedido;
    }
    public double getValor(){
        return valor;
    }
    public Pessoa getPessoa(){
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
}
