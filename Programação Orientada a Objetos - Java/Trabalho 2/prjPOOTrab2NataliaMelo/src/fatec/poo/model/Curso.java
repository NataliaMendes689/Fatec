package fatec.poo.model;
import java.util.ArrayList;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Curso {
    private String sigla;
    private String descricao;
    private int cargaHoraria;
    private double valor;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String descricao){
        this.descricao = descricao;
        this.sigla = sigla;
        this.turmas = new ArrayList<Turma>();
    }
    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void addTurmas(Turma turma){
        turmas.add(turma);
        turma.setCurso(this);
    }
}
