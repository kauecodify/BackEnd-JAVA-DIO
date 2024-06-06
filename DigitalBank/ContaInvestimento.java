public class ContaInvestimento extends Conta {
    private double rendimentoAnual;

    public ContaInvestimento(Cliente cliente, int numero, double rendimentoAnual) {
        super(cliente, numero);
        this.rendimentoAnual = rendimentoAnual;
    }

    @Override
    public void depositar(double valor) {
        adicionarSaldo(valor);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            subtrairSaldo(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (getSaldo() >= valor) {
            subtrairSaldo(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * rendimentoAnual;
        depositar(rendimento);
    }
}