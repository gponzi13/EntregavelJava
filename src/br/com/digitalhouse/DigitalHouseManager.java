package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Matricula> listaDeMatriculas;

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(ArrayList<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public ArrayList<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(ArrayList<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public DigitalHouseManager() {
    }

    public DigitalHouseManager(ArrayList<Aluno> listaAlunos, ArrayList<Professor> listaProfessores, ArrayList<Matricula> listaDeMatriculas) {
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaxAluno) {
        ArrayList listaDeCursos = new ArrayList();
        for (Curso novoCurso : listaDeCursos) {
            if (novoCurso.getNome() && novoCurso.getQtdMaxAluno() && novoCurso.getCodigoCurso()) {
                novoCurso.add(novoCurso);
            }
        }

    }

    public void exluirCurso(Integer codigoCurso) {
        for (Curso exCurso : codigoCurso) {
            if (exCurso.getCodigoCurso()) {
                exCurso.remove;
            }

        }
    }
    public void registrarProfessorAdjunto(String nome, String sobreNome, Integer quantidadeDeHoras){
        List<Professor> listaDePreofessores = new ArrayList<>();

    }

}
