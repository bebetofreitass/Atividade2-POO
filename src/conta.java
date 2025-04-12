public class Conta {
    private String cpf;
    private int numeroConta;
    private double saldo;
    private boolean clienteBlack;

    public Conta(String cpf, int numeroConta, double saldo, boolean clienteBlack) {
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteBlack = clienteBlack;
    }

    public double getBonificacao() {
    return saldo * (clienteBlack ? 0.10 : 0.05);
    }

    public void depositar(double valor) {
    if (valor > 0)
    saldo += valor;
}
    public boolean sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
    saldo -= valor;
    return true;
    }
    return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
        destino.depositar(valor);
        return true;
        }
        return false;
    }

    public void mostrar() {
    System.out.println("CPF: " + cpf);
    System.out.println("Banco: " + numeroConta);
    System.out.println("Saldo: " + saldo);
    System.out.println("Cliente Black: " + (clienteBlack ? "Sim" : "Não"));
    System.out.println("Bonificação: " + getBonificacao());
}
}
