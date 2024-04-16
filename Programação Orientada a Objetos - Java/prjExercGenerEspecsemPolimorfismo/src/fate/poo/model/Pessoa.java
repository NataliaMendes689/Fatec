package fate.poo.model;

/**
 * @author Natalia
 */
public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String n, String t) {
        nome = n;
        telefone = t;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
