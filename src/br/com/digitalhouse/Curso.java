package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular titular;
    private ProfessorAdjunto adjunto;
    private Integer qtdMaxAluno;
    private ArrayList<Aluno> alunos;

    public Curso() {
    }

    public Curso(String nome, Integer codigoCurso, ProfessorTitular titular, ProfessorAdjunto adjunto, Integer qtdMaxAluno, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.titular = titular;
        this.adjunto = adjunto;
        this.qtdMaxAluno = qtdMaxAluno;
        this.alunos = alunos;
    }

    public ProfessorTitular getTitular() {
        return titular;
    }

    public void setTitular(ProfessorTitular titular) {
        this.titular = titular;
    }

    public ProfessorAdjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(ProfessorAdjunto adjunto) {
        this.adjunto = adjunto;
    }

    public Integer getQtdMaxAluno() {
        return qtdMaxAluno;
    }

    public void setQtdMaxAluno(Integer qtdMaxAluno) {
        this.qtdMaxAluno = qtdMaxAluno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    private boolean mesmoAluno(Aluno umAluno) {
        if (codigoCurso == codigoCurso)
            System.out.println("Mesmo Curso!");
        return true;
    }

    //tentativa criar metodo add aluno//

    public void adicionarUmAluno(List<Aluno> umAluno, Integer codA) {
        List<Aluno> alunosCurso = new ArrayList<>();
        for (Aluno umAluno : alunosCurso) {
            if (umAluno.getNome() && umAluno.getSobreNome() && umAluno.getCodA() != codA &&  !=nome && !=codA){
                umAluno.add(alunosCurso);
                return true;
            }
            System.out.println("Aluno adicionado!");

        }

        public void excluirAluno (List < Aluno > umAluno) {
            List<Aluno> alunosEx = new ArrayList<>();
            for (Aluno alunoEx : alunosCurso)
                if
        }
        System.out.println("Aluno removido!");


    }


}
