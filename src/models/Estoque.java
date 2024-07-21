package models;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Integer, Peca> pecas;

    //Construtor
    public Estoque() {
        this.pecas = new HashMap<>();
    }

    //Getters
    public Map<Integer, Peca> getPecas() {
        return pecas;
    }

    //Metodos
    //Adicionar peças ao estoque
    public void adicionarPecas(int id, Costureira costureira){
        for(Peca p : costureira.getPecas()){
            pecas.put(id, p);
            id = id +1;
        }
    }

    //Buscar peça pelo ID
    public Peca exibirPecaPorID(int id){
        return pecas.get(id);
    }

//    //Buscar peça por nome
//    public Peca exibirPecaPorNome(String nome){
//        for (Map.Entry<Integer, Peca> entrada : pecas.entrySet()){
//            if (entrada.getValue().)
//        }
//    }

    //Exibir peças do estoque
    public void exibirPecas(){
        for(Map.Entry<Integer, Peca> itens : pecas.entrySet()){
            System.out.println("ID: "+itens.getKey()+" = "+itens.getValue());
        }
    }


}
