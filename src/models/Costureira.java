package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Costureira {
    private String nome;
    private double estoqueMetro;
    private List<Peca> pecas;

    Random gerador = new Random();

    //construtor
    public Costureira(String nome) {
        this.nome = nome;
        this.pecas = new ArrayList<>();
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public double getEstoqueMetro() {
        return estoqueMetro;
    }
    public List<Peca> getPecas() {
        return pecas;
    }

    //Metodos
    //fazer uma nova peça
    public void fazerPeca(Tecido tecido, String nome, double quantidade){
        if(quantidade > tecido.getQuantidadePorMetro()){
            System.out.println("Quantidade de tecido baixa, repor!!");
        }else {
            Peca novaPeca = new Peca(nome, tecido.getCor());
            tecido.setQuantidadePorMetro(tecido.getQuantidadePorMetro() - quantidade);
            pecas.add(novaPeca);
            System.out.println("Quantidade de "+novaPeca.getNome()+" - "+pecas.size());
            System.out.println("Tecido restante de "+tecido.getCor()+" - "+tecido.getQuantidadePorMetro());
        }
    }
}
