package fatec.poo.model;
import java.util.ArrayList;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Instrutor extends Pessoa {

    private int codigo;
    private String areaAtuacao;
    private double valorHora;
    private ArrayList<Turma> turmas;   
    
    public Instrutor(String nome, int codigo) {
        super(nome);
        this.codigo = codigo;
        this.turmas = new ArrayList<Turma>();
    }
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getCodigo() {
        return codigo;
    }  
    public void addTurmas(Turma turma){
        turmas.add(turma);
        turma.setInstrutor(this);
    }   
}
