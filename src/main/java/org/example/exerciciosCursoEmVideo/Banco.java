package org.example.exerciciosCursoEmVideo;

public class Banco {

    private boolean ehContaPoupanca;
    private String usuario;
    private int numeroConta;
    private String senha;

    public Banco(boolean ehContaPoupanca, String usuario, int numeroConta, String senha) {
        this.ehContaPoupanca = ehContaPoupanca;
        this.usuario = usuario;
        this.numeroConta = numeroConta;
        this.senha = senha;

    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean getEhContaPoupanca() {
        return this.ehContaPoupanca;
    }

    public void setEhContaPoupanca(boolean ehContaPoupanca) {
        this.ehContaPoupanca = ehContaPoupanca;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void status() {
        System.out.println("É conta poupança? " + getEhContaPoupanca() + "\nNome do usuário: " + getUsuario() + "\nConta: " + getNumeroConta() + "\nSenha: " + getSenha() + "\n");
    }

}
