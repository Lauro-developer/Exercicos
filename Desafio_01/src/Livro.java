public class Livro {
    private String autor;
    private String nomeLivro;

    public String getAutor() { //LE OS DADOS DO AUTOR DO LIVRO
        return autor;
    }

    public String getNomeLivro() {//LE OS DADOS DO NOME DO LIVRO
        return nomeLivro;
    }

    public void setAutor(String autor) { // ALÉM DE LER PODE ALTERAR O NOME DO AUTOR
        this.autor = autor;
    }
    public void setNomeLivro(String nomeLivro) { // ALÉM DE LER PODE ALTERAR O NOME DO titulo
        this.nomeLivro = nomeLivro;
    }

    public void exibirFichaLivro(){
        System.out.println("NOME DO LIVRO: "+ nomeLivro);
        System.out.println("AUTOR: "+ autor);
    }
}
