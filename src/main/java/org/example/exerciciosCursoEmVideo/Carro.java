package org.example.exerciciosCursoEmVideo;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, int anoFabricacao, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public void status() {
        System.out.println("Um carro da marca: " + getMarca() + "\nDo modelo: " + getModelo() + "\nDo ano: " + getAnoFabricacao() + "\nDa cor: " + getCor() + "\nDa placa: " + getPlaca());
    }


}
