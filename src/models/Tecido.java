package models;

public class Tecido {
    private String cor;
    private double quantidadePorMetro;

    //Construtor
    public Tecido(String cor, double quantidadePorMetro) {
        this.cor = cor;
        this.quantidadePorMetro = quantidadePorMetro;
    }

    //Getters
    public String getCor() {
        return cor;
    }
    public double getQuantidadePorMetro() {
        return quantidadePorMetro;
    }


    //Setters
    public void setQuantidadePorMetro(double quantidadePorMetro) {
        this.quantidadePorMetro = quantidadePorMetro;
    }
}
