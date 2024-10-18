package model;

public class Revista extends ObjetoLeitura{

    private String tipoArtigo;

    public String getTipoArtigo() {
        return tipoArtigo;
    }

    public void setTipoArtigo(String tipoArtigo) {
        this.tipoArtigo = tipoArtigo;
    }

    public void gerarArtigo(){
        if(tipoArtigo.equalsIgnoreCase("tutorial")){
            System.out.println("Escreva nesta sessão um tutorial;");
        } else if (tipoArtigo.equalsIgnoreCase("Informativo")){
            System.out.println("Escreva aqui um artigo informativo: ");
        } else if (tipoArtigo.equalsIgnoreCase("resenha")){
            System.out.println("Escreva aq uma resenha: ");
        } else {
            System.out.println("Esreva aqui um artigo de assunto livro");
        }
    }


}


