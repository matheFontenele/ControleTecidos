import models.Costureira;
import models.Estoque;
import models.Tecido;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Tecido tecidoRosa = new Tecido("Rosa", 9.80);
        Tecido tecidoPreto = new Tecido("Preto", 3.80);

        Costureira maria = new Costureira("Maria");

        maria.fazerPeca(tecidoPreto, "Vestido", 2.80);
        maria.fazerPeca(tecidoRosa, "Blusa", 2.80);


        estoque.adicionarPecas(1, maria);

        estoque.exibirPecas();

        System.out.println(estoque.exibirPecaPorID(1));

        System.out.println(estoque.exibirPecaPorNome("Blusa"));


    }
}