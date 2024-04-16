/**
 * @author Natalia
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return(raio);
    }
    
    public double calcArea(){
        return(3.1416 * Math.pow(raio,2));
    }
    public double calcPerimetro(){
        return(2 * (raio * 3.1416));
    }
    public double calcDia(){
        return(2 * raio);
    }
}
