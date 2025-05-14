package org.example.model;


public class Voluntario {
    private String nome;
    private String numeroAluno;
    private String curso;

    public Voluntario(String nome, String numeroAluno, String curso) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "org.example.model.Voluntario{" +
                "nome='" + nome + '\'' +
                ", numeroAluno='" + numeroAluno + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}

