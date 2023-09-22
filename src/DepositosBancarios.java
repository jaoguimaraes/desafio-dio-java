import java.util.Scanner;

public class DepositosBancarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        double valorDeposito = scanner.nextDouble();
        double saldoAtual = 0;

        double saldoAtualizado = saldoAtual + valorDeposito;

        if (valorDeposito > 0) {
            System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f%n", saldoAtualizado);
        } else if (valorDeposito < 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            System.out.println("Encerrando o programa...");
        }
        scanner.close();
    }
}