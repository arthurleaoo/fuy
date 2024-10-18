package view;

import model.Livro;
import model.ObjetoLeitura;
import model.Revista;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ObjetoLeitura revista = new Revista();


        livro.setUUID(213134);
        livro.setNome ("teste POO");
        livro.setAnoPublicacao (2020);

        revista.setUUID (21314);
        revista.setNome ("teste banco de dados");
        revista.setAnoPublicacao (2024);
        ((Revista) revista).setTipoArtigo("resenha");
    }

}
