package br.com.digitalhouse;

public class Aluno {
    private String nome;
    private String sobreNome;
    private Integer codA;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodA() {
        return codA;
    }

    public void setCodA(Integer codA) {
        this.codA = codA;
    }

    public Aluno(String nome, String sobreNome, Integer codA) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codA = codA;
    }

    private boolean mesmoAluno() {
        if (codA == codA)
            System.out.println("Mesmo Aluno!");
        return true;
    }
}

