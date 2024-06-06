public abstract class Conta {
    private Cliente cliente;
    private int numero;
    private double saldo;

    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void transferir(double valor, Conta contaDestino);

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    protected void subtrairSaldo(double valor) {
        this.saldo -= valor;
    }
}
