package fatec.poo.model;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Pessoa {
    private String nome;
    private String dtNascimento;
    private String endereço;
    
   public Pessoa(String nome){
   this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}