import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import fatec.poo.model.PedidoCompra;
import java.util.Scanner;

/**
 *
 * @author André
 */

public class Aplic {
    public static void main(String[] args) {       
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        String nome, cpf;
        int anoIns;
        
        System.out.println("\tPessoa Fisica");
        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite o Cpf: ");
        cpf = entrada.nextLine();
        System.out.print("Digite o Ano de Inscrição: ");
        anoIns = entrada.nextInt();      
        PessoaFisica pf = new PessoaFisica(cpf, nome, anoIns);
        entrada.nextLine();
        pf.setBase(40);
        
        System.out.println("\n\n\tPessoa Juridica");
        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite o Cnpj: ");
        String cnpj = entrada.nextLine();
        System.out.print("Digite o Ano de Inscrição: ");
        anoIns = entrada.nextInt();
        PessoaJuridica pj = new PessoaJuridica(cnpj, nome, anoIns);
        entrada.nextLine();
        pj.setTaxaIncentivo(20);
        
        PedidoCompra[] cadPedidos = new PedidoCompra[9];
        
        int i=0;
        while(i <=4){
            System.out.print("\nDigite o cpf ou cnpj do Comprador: ");
            String documento = entrada.nextLine();
            if(documento.equals(pf.getCPF())){
                System.out.println("Pessoa fisica: " + pf.getNome());
                System.out.print("Digite o numero do Pedido: ");
                int numPedido = entrada.nextInt();
                cadPedidos[i] = new PedidoCompra(numPedido);
                System.out.print("Digite o Valor do pedido: ");
                cadPedidos[i].setValor(entrada.nextDouble());
                entrada.nextLine();
                System.out.print("Digite a data da compra: ");
                cadPedidos[i].setDataPedido(entrada.nextLine());
                cadPedidos[i].setPessoa(pf);
                pf.addCompras(cadPedidos[i].getValor());
                pf.addPedidoCompra(cadPedidos[i]);
                System.out.println("Pedido realizado com sucesso!");
                i++;
            }
            else{
                if(documento.equals(pj.getCGC())){
                    System.out.println("Pessoa juridica: " + pj.getNome());
                    System.out.print("Digite o numero do Pedido: ");
                    int numPedido = entrada.nextInt();
                    cadPedidos[i] = new PedidoCompra(numPedido);
                    System.out.print("Digite o Valor do pedido: ");
                    cadPedidos[i].setValor(entrada.nextDouble());
                    entrada.nextLine();
                    System.out.print("Digite a data da compra: ");
                    cadPedidos[i].setDataPedido(entrada.nextLine());
                    cadPedidos[i].setPessoa(pj);
                    pj.addCompras(cadPedidos[i].getValor());
                    pj.addPedidoCompra(cadPedidos[i]);
                    System.out.println("Pedido realizado com sucesso!");
                    i++;
                }
                else{
                    System.out.println("Pessoa não localizada!");
                }
            }
        }
        
        
        
        /*
        for(int x=0; x<=9; x++){
            System.out.print("\nDigite o numero do Pedido: ");
            int numPedido = entrada.nextInt();
            cadPedidos[x] = new PedidoCompra(numPedido);
            System.out.print("Digite o Valor do pedido: ");
            cadPedidos[x].setValor(entrada.nextDouble());
            System.out.print("Digite a data da compra: ");
            cadPedidos[x].setDataPedido(entrada.next());
            
            System.out.print("\nDigite o CPF ou cnpj do Comprador: ");
            cpf = entrada.next();
            if(cpf == pf.getCPF()){
                cadPedidos[x].setPessoa(pf);
                pf.addCompras(cadPedidos[x].getValor());
                pf.addPedidoCompra(cadPedidos[x]);
                System.out.println("Pedido realizado com sucesso!");
            }
            if(cpf == pj.getCGC()){
                cadPedidos[x].setPessoa(pj);
                pj.addPedidoCompra(cadPedidos[x]);
                pj.addCompras(cadPedidos[x].getValor());
                System.out.println("Pedido realizado com sucesso!");
            }
            else{
                System.out.println("Pessoa não localizada!");
            }
        }
        */
        
        System.out.println("\n\nCpf: " + pf.getCPF());
        System.out.println("Nome:" + pf.getNome());
        System.out.println("Pedidos de compra: " + pf.getNumPedido());
        System.out.println("ValorTotal: " + df.format(pf.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(2024)));
        
        System.out.println("\n\nCnpj: " + pj.getCGC());
        System.out.println("Nome:" + pj.getNome());
        System.out.println("Pedidos de compra: " + pj.getNumPedido());
        System.out.println("ValorTotal: " + df.format(pj.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pj.calcBonus(2024)));
    }
}
