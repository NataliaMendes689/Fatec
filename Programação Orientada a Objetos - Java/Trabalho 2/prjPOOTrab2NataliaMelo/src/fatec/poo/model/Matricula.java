package fatec.poo.model;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Matricula{
    private String dtMatricula;
    private int qtdeFaltas;
    private double media;
    private Turma turma;
    private Aluno aluno;
    private String passaNaoPassa;
    
    public Matricula(String dtMatricula){
        this.dtMatricula = dtMatricula;
    }
    
    public void setPassaNaoPassa(String passaNaoPassa) {
        this.passaNaoPassa = passaNaoPassa;
    }

    public String getPassaNaoPassa() {
        return passaNaoPassa;
    }
    
    public String getDtMatricula() {
        return dtMatricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public double getMedia() {
        return media;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
