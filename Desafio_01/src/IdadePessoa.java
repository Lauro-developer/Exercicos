public class IdadePessoa {
    private int idade;
    private String nome;

    public IdadePessoa() {
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void exibaFicha() {
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println("VOCE É MAIOR DE IDADE");
        } else {
            System.out.println("VOCE É MENOR DE IDADE");
        }

    }

    public void exibirTudo() {
        this.exibaFicha();
        this.verificarIdade();
    }
}
