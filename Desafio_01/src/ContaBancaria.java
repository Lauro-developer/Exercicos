public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    public String titularConta;

    public ContaBancaria() {
    }

    public String getTitularConta() {
        return this.titularConta;
    }

    public void exibaDadosConta() {
        System.out.println("TITULAR DA CONTA: " + this.getTitularConta());
        System.out.println("NUMERO DA CONTA: " + this.numeroConta);
        System.out.println("SALDO DA CONTA: " + this.saldoConta);
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }
}
