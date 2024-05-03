import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Aluno;
import fatec.poo.model.Matricula;
import java.util.Scanner;
/*
@author Natalia
Nome: Natalia Melo
RA: 0030482123017
*/
public class Aplic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sigla;
        String descricao;
        
        System.out.print("\n----------- Curso -----------\n");    
        System.out.print("Digite a sigla do curso: ");
        sigla = scanner.nextLine();
        System.out.print("Digite o nome/descricao do curso: ");
        descricao = scanner.nextLine();   
        Curso curso = new Curso(sigla, descricao);
        
        System.out.print("Digite o valor do curso: ");
        curso.setValor(scanner.nextDouble());

        System.out.print("Digite a carga horária do curso: ");
        curso.setCargaHoraria(scanner.nextInt());
        scanner.nextLine();

        Turma[] turmas = new Turma[2];

        System.out.println("\n\n----------- Turma -----------");
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o codigo da turma: ");
            turmas[i] = new Turma(scanner.nextInt());
            scanner.nextLine();
            curso.addTurmas(turmas[i]);
        }

        int codigo;
        String nome;
        String atuacao;

        System.out.println("\n\n----------- Instrutor -----------");        
        System.out.print("Digite o codigo do instrutor: ");
        codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do instrutor: ");
        nome = scanner.nextLine();
        Instrutor instrutor = new Instrutor(nome, codigo);
        System.out.print("Digite a área de atuação: ");
        atuacao = scanner.nextLine();

        String[][] aux = new String[5][2];
        Aluno[] alunos = new Aluno[5];
        String escolari;
        
        System.out.println("\n\n----------- Alunos -----------");   
        for (int i = 0; i < 5; i++) {
            System.out.print("\nDigite o código do aluno: ");
            aux[i][0] = scanner.nextLine();
            System.out.print("Digite o nome do aluno: ");
            aux[i][1] = scanner.nextLine();
            alunos[i] = new Aluno(aux[i][0], aux[i][1]);
            System.out.print("Digite a escolaridade: ");
            escolari = scanner.nextLine();
        }
        
        System.out.println("\n-----------\n");
        Matricula[] matriculas = new Matricula[5];
        System.out.println("\n\n----------- Matriculas -----------"); 
        for (int i = 0; i < matriculas.length; i++) {
            System.out.print("\nDigite a data da matrícula: ");
            matriculas[i] = new Matricula(scanner.nextLine());
            System.out.print("Digite a média do aluno: ");
            matriculas[i].setMedia(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Digite a quantidade de faltas do aluno: ");
            matriculas[i].setQtdeFaltas(scanner.nextInt());
            scanner.nextLine();
            //associando o aluno a matricula
            matriculas[i].setAluno(alunos[i]);
        }
        
        System.out.println("\n-----------\n");
        for (int i = 0; i < 3; i++) {
            turmas[0].addMatriculas(matriculas[i]);
        }
        for (int i = 3; i < 5; i++) {
            turmas[1].addMatriculas(matriculas[i]);
        }       
        for (int i = 0; i < 2; i++) {
            instrutor.addTurmas(turmas[i]);
        }
        for (int i = 0; i < 2; i++) {
            turmas[i].listarAlunos();
        }
    }
}
