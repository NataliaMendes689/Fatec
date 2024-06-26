
import fate.poo.model.Cliente;
import fate.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        //Instanciação de um objeto da classe Instrutor
        Instrutor objInstrutor = new Instrutor(133, "Marcos Andrade", "3222-5578");
        
        //Instanciação de um objeto da classe Cliente
        Cliente objCliente = new Cliente("123.456.789-11", "João Medeiros", "3231-7654");
        
        objInstrutor.setAreaAtuacao("Atletismo");
        System.out.println("Identificação do Instrutor: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Área de Atuação: " + objInstrutor.getAreaAtuacao());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        
        objCliente.setAltura(1.78);
        objCliente.setPeso(65);
        System.out.println("\n\nCpf do Cliente: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Altura: " +objCliente.getAltura());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Telefone: " + objCliente.getTelefone()); 
        System.out.println("Valor do IMC: " + objCliente.calcIMC());
        
    }
}
