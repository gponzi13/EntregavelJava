package br.com.digitalhouse;

public abstract class Professor {
    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;

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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    private boolean mesmoAluno() {
        if (codigoProfessor == codigoProfessor)
            System.out.println("Mesmo Professor!");
        return true;
    }
}
