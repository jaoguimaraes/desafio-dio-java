import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual;
        System.out.println("Digite o saldo");
        saldoAtual = scanner.nextDouble();

        double valorDeposito;
        System.out.println("Digite o Deposito");
        valorDeposito = scanner.nextDouble();

        double valorRetirada;
        System.out.println("Digite a retirada");
        valorRetirada = scanner.nextDouble();

        //Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual = saldoAtual + valorDeposito;

        double valorTotal;
        valorTotal = saldoAtual - valorRetirada;
        //Imprimir a saída conforme a tabela de exemplos (uma casa decimal).
        System.out.printf("%.1f%n", valorTotal);
    }
}