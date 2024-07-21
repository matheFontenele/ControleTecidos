package models;

public class Peca {
    private String nome;
    private String cor;
    private int quantidade;

    //construtor
    public Peca(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //Metodos

    @Override
    public String toString() {
        return "Peca{" +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
