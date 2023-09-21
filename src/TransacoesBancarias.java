import java.util.Scanner;

public class TransacoesBancarias {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        //Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        int novoSaldo;

        novoSaldo = saldoTotal - valorSaque;

        if (valorSaque <= saldoTotal) {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        } else
            System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
}