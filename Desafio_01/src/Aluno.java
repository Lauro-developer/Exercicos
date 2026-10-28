public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

   public void setNome(String nome) {
       this.nome = nome;
   }
   public void setNota1(double nota1) {
       this.nota1 = nota1;
   }
   public void setNota2(double nota2) {
       this.nota2 = nota2;
   }

   public String getNome() {
       return nome;
   }
   public double getNota1() {
       return nota1;
   }
   public double getNota2() {
       return nota2;
   }
   public void calcularMedia(){
    media = (nota1 + nota2) / 2;
    System.out.println("SUA MEDIA É: "+ media);
   }
   public void exibaFichaDoAluno(){
        System.out.println("NOME DO ALUNO: "+ nome);
        System.out.println("NOTA 1: "+ nota1);
        System.out.println("NOTA 1: "+ nota2);
        calcularMedia();
   }
   
}