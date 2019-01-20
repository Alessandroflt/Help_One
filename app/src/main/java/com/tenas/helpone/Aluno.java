package com.tenas.helpone;

public class Aluno {

    private int id;
    private String nome;
    private String curso;
    private String cpf;

    public Aluno(int id, String nome, String curso, String cpf) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
    }

    public Aluno() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}