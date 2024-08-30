package aula04;

public class Televisao {
    private boolean ligada;
    private boolean estahAumentandoVolume;
    private String cor;
    private int qntPolegadas;

    public Televisao(boolean ligada, boolean estahAumentandoVolume, String cor, int qntPolegadas) {
        this.ligada = ligada;
        this.estahAumentandoVolume = estahAumentandoVolume;
        this.cor = cor;
        this.qntPolegadas = qntPolegadas;
    }

    public boolean getLigada() {
        return this.ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public boolean getEstahAumentandoVolume() {
        return this.estahAumentandoVolume;
    }
    public void setEstahAumentandoVolume(boolean estahAumentandoVolume) {
        this.estahAumentandoVolume = estahAumentandoVolume;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQntPolegadas() {
        return this.qntPolegadas;
    }
    public void setQntPolegadas(int qntPolegadas) {
        this.qntPolegadas = qntPolegadas;
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentar_volume() {
        estahAumentandoVolume = true;
    }
    public void diminuir_volume() {
        estahAumentandoVolume = false;
    }
    public void status() {
        System.out.println("A TV está ligada? " + getLigada());
        System.out.println("Está aumentando o volume? " + getEstahAumentandoVolume());
        System.out.println("Cor da TV: " + getCor());
        System.out.println("Quantidade de polegadas: " + getQntPolegadas() + '"');
    }
}
