import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        while (true) {
            System.out.println("\nBem-vindo ao DigitalBank!");
            System.out.println("1. Criar conta");
            System.out.println("2. Fazer depósito");
            System.out.println("3. Listar clientes");
            System.out.println("4. Listar contas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    banco.adicionarCliente(cliente);

                    System.out.println("Escolha o tipo de conta:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Conta Poupança");
                    System.out.println("3. Conta Investimento");
                    int tipoConta = scanner.nextInt();
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();

                    Conta conta = null;
                    switch (tipoConta) {
                        case 1:
                            conta = new ContaCorrente(cliente, numeroConta, 500.0);
                            break;
                        case 2:
                            conta = new ContaPoupanca(cliente, numeroConta, 0.06);
                            break;
                        case 3:
                            conta = new ContaInvestimento(cliente, numeroConta, 0.13);
                            break;
                        default:
                            System.out.println("Escolha inválida.");
                            continue;
                    }
                    banco.adicionarConta(conta);
                    break;
                case 2:
                    System.out.print("Digite o número da conta para depósito: ");
                    int numConta = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    Conta contaParaDeposito = null;
                    for (Conta c : banco.getContas()) {
                        if (c.getNumero() == numConta) {
                            contaParaDeposito = c;
                            break;
                        }
                    }
                    if (contaParaDeposito != null) {
                        contaParaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    banco.listarClientes();
                    break;
                case 4:
                    banco.listarContas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
