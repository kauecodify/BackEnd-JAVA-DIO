public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente, int numero, double limite) {
        super(cliente, numero);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        adicionarSaldo(valor);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            subtrairSaldo(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (getSaldo() + limite >= valor) {
            subtrairSaldo(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}