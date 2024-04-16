/**
 * @author Natalia
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo objCirc1;
        Circulo objCirc2;
        
        objCirc1 = new Circulo();
        objCirc2 = new Circulo();
        
        objCirc1.setRaio(1.0);
        objCirc2.setRaio(3.0);
        
        System.out.println("Objeto Circulo 1:  ");
        System.out.println("Medida do raio: " + objCirc1.getRaio());
        System.out.println("Medida da área: " + objCirc1.calcArea());
        System.out.println("Medida do perimetro: " + objCirc1.calcPerimetro());
        System.out.println("Medida do diametro: " + objCirc1.calcDia());
        
        System.out.println("\n------------\n");   
        
        System.out.println("Objeto Circulo 2:  ");
        System.out.println("Medida do raio: " + objCirc2.getRaio());
        System.out.println("Medida da área: " + objCirc2.calcArea());
        System.out.println("Medida da perimetro: " + objCirc2.calcPerimetro());
        System.out.println("Medida do diâmetro: " + objCirc2.calcDia());
        
        
    }
    
}
