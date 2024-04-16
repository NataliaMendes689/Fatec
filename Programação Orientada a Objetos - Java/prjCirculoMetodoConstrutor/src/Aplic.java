
import java.util.Scanner;

/**
 * @author Dimas
 * @editora Natalia
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in); // Criação da instância de Scanner
        double medRaio;
        int opcao;
        String unidade;
        
        // Montar o círculo
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        Circulo objCirc = new Circulo(unidade);
        
        System.out.print("Digite a medida do raio do círculo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio); // Definição do raio
        
        do {
            System.out.println("\n\n1 - Consultar área do círculo");
            System.out.println("2 - Consultar perímetro do círculo");
            System.out.println("3 - Consultar diâmetro do círculo");
            System.out.println("4 - Sair");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nMedida do raio: " + objCirc.getRaio() + " " 
            + objCirc.getUnidadeMedida());
            switch(opcao) {
                case 1:
                    System.out.println("A medida da área: " + objCirc.calcArea() + " " 
                    + objCirc.getUnidadeMedida() + "²");
                    break;
                case 2:
                    System.out.println("A medida do perímetro: " 
                    + objCirc.calcPerimetro() + " " + objCirc.getUnidadeMedida());
                    break;
                case 3:
                    System.out.println("A medida do diâmetro: " 
                    + objCirc.calcDiametro() + " " + objCirc.getUnidadeMedida());
                    break;
            }
        } while(opcao < 4);
        
        // Fecha a instância de Scanner
        entrada.close();
    }
}