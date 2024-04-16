import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class Aplic {
 
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int opcao=0, quarto, numDias=0;
            double valor;

            System.out.print("Digite o número do quarto: ");
            quarto = entrada.nextInt();
            System.out.print("Digite o valor do quarto: R$");
            valor = entrada.nextDouble();
            QuartoHotel objQuarto = new QuartoHotel(quarto,valor);

           do{ 
                System.out.print("\n---------------------\n");
                System.out.print("\n1- Consultar quarto");
                System.out.printf("\n2- Reservar quarto");
                System.out.printf("\n3- Liberar quarto");
                System.out.printf("\n4- Consultar faturamento do quarto");
                System.out.printf("\n5- Sair");
                System.out.printf("\n\n   Digite a opção: ");
                opcao=entrada.nextInt();
                System.out.print("\n---------------------\n");
           switch(opcao){
               case 1:
                   if(objQuarto.getSituacao() == false){
                       System.out.print("\nQuarto livre.\n");
                   }
                   else{
                        System.out.print("\nQuarto reservado.\n");
                   }
                   break;
                case 2:
                   if(objQuarto.getSituacao() == true){
                      System.out.print("\nO quarto já foi reservado.\n");
                  }
                   else{
                      System.out.print("\nDigite o numero do RG do hospede: ");
                      objQuarto.reservar(entrada.nextInt());                      
                  }
                   break;
                case 3:
                    if (objQuarto.getSituacao() == false){
                        System.out.print("\nO quarto já esta livre.\n");
                    }
                    else{
                      System.out.print("\nDigite quantos dias o hospede ficou: ");
                      numDias=entrada.nextInt();
                      System.out.print("Total da estadia: R$ " + objQuarto.liberar(numDias) + "\n");
                    }
                    break;
                case 4:
                    System.out.print("\nFaturamento: R$ " + objQuarto.getTotalFaturado() +"\n");
                    break;
                case 5:
                    System.out.print("\nPrograma ecerrado!\n");

                default:
                    System.out.print("\nOpção Incorreta!\n");
           }
           }
           while (opcao!=5);
    }
 
}

 