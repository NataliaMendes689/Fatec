package fatec.poo.model;
import java.util.ArrayList;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Turma {
    
    private final int codigo;
    private int qtdeVagas;
    private int qtdeAprovados = 0;
    private int qtdeReprovados = 0;
    private int qtdeAlunos = 0;
    private final ArrayList<Matricula> matricula; //multiplicidade 1..*
    private Instrutor instrutor;
    private Curso curso;

    public Turma(int codigo){
        this.codigo = codigo;
        matricula = new ArrayList<Matricula>();
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }
    
        public Instrutor getInstrutor() {
        return instrutor;
    }
        public Curso getCurso() {
        return curso;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    } 
        
    public int calcQtdeAprovados() {
        return qtdeAprovados;
    }
    public int calcQtdeReprovados() {
        return qtdeReprovados;
    }
      
public void addMatriculas(Matricula matricula) {
    this.matricula.add(matricula);
    matricula.setTurma(this);
}
    private void passaNaoPassa(){
        double totalFaltas = (curso.getCargaHoraria() * 0.4);
            for (int x = 0; x < matricula.size(); x++){
                if ((matricula.get(x).getQtdeFaltas() <= totalFaltas) &&
                        (matricula.get(x).getMedia() >= 5)){
                        qtdeAprovados++;
                        matricula.get(x).setPassaNaoPassa("Aprovado");
                } else{
                        matricula.get(x).setPassaNaoPassa("Reprovado");
                        qtdeReprovados++;
            }
        // Funciona dessa vez pelo amor de Deus  
    }
    qtdeAlunos = qtdeAprovados + qtdeReprovados; 
}   
    public void listarAlunos() {
        passaNaoPassa();
        System.out.println("\t\t\t\tRelação Alunos da Turma\n");
        System.out.println("Sigla do Curso: " + curso.getSigla() + "\t\t"
                            + "Nome do Curso: " + curso.getDescricao() + "\n");
        System.out.println("Sigla Turma: " + codigo + "\n");
        System.out.println("Nome do Instrutor: " + instrutor.getNome() + "\n");
        System.out.println("Nome do Aluno\t\t\t\tQtde. Faltas\t\tMedia\t\t\tSituação");
            for (int x = 0; x < matricula.size(); x++){
            System.out.println(matricula.get(x).getAluno().getNome() + "\t\t\t\t\t"
                                + matricula.get(x).getQtdeFaltas() + "\t\t\t" 
                                + matricula.get(x).getMedia() + "\t\t\t"
                                + matricula.get(x).getPassaNaoPassa());
        }

        System.out.println("\nQtde. de Alunos: " + (qtdeAlunos));
        System.out.println("Qtde. de Alunos Aprovados: "
                             + calcQtdeAprovados());
        System.out.println("Qtde. de Alunos Reprovados: "
                            + calcQtdeReprovados());
        System.out.println("\n----------\n");
    }    
}
