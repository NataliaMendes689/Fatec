package fatec.poo.model;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Aluno extends Pessoa{
    private String ra;
    private String escolaridade;
    public Aluno(String ra, String nome){
    super(nome);
    this.ra = ra;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    public String getRa() {
        return ra;
    }
}
